# Introduction #

Under development!

Tutorial for multiple sequence alignments and phylogenetic methods in [BioRuby](http://bioruby.open-bio.org/).

Eventually, this is expected to be placed on the official BioRuby page.

Author: [Christian Zmasek](https://sites.google.com/site/cmzmasek/), Sanford-Burnham Medical Research Institute


Copyright (C) 2011 Christian M Zmasek. All rights reserved.


# Multiple Sequence Alignment #


## Multiple Sequence Alignment Input and Output ##

### Reading in a Multiple Sequence Alignment from a File ###

This automatically determines the format
```
#!/usr/bin/env ruby
require 'bio'

seq_ary = Array.new
ff = Bio::FlatFile.auto('bcl2.fasta')
ff.each_entry do |entry|
  seq_ary.push(entry)
  puts entry.entry_id          # prints the identifier of the entry
  puts entry.definition        # prints the definition of the entry
  puts entry.seq               # prints the sequence data of the entry
end

# Creates a multiple sequence alignment (possibly unaligned) named
# 'seqs' from array 'seq_ary'.
seqs = Bio::Alignment.new(seq_ary)
seqs.each { |seq| puts seq.to_s }

# Writes multiple sequence alignment (possibly unaligned) 'seqs'
# to a file in PHYLIP format.
File.open('out0.phylip', 'w') do |f|
  f.write(seqs.output(:phylip))
end

# Writes multiple sequence alignment (possibly unaligned) 'seqs'
# to a file in FASTA format.
File.open('out0.fasta', 'w') do |f|
  f.write(seqs.output(:fasta))
end
```


#### ClustalW Format ####

The following example shows how to read in a **ClustalW**-formatted multiple sequence alignment.

```
#!/usr/bin/env ruby
require 'bio'

# Reads in a ClustalW-formatted multiple sequence alignment
# from a file named "infile_clustalw.aln" and stores it in 'report'.
report = Bio::ClustalW::Report.new(File.read('infile_clustalw.aln'))

# Accesses the actual alignment.
msa = report.alignment

# Goes through all sequences in 'msa' and prints the
# actual molecular sequence.
msa.each do |entry|
  puts entry.seq
end
```

#### FASTA Format ####

The following example shows how to read in a **FASTA**-formatted multiple sequence file. (_This seems a little clumsy, I wonder if there is a more direct way, avoiding the creation of an array.)
```
#!/usr/bin/env ruby
require 'bio'

# Reads in a FASTA-formatted multiple sequence alignment (which does
# not have to be aligned, though) and stores its sequences in
# array 'seq_ary'.
seq_ary = Array.new
fasta_seqs = Bio::Alignment::MultiFastaFormat.new(File.open('infile.fasta').read)
fasta_seqs.entries.each do |seq|
  seq_ary.push(seq)
end

# Creates a multiple sequence alignment (possibly unaligned) named
# 'seqs' from array 'seq_ary'.
seqs = Bio::Alignment.new(seq_ary)

# Prints each sequence to the console.
seqs.each { |seq| puts seq.to_s }

# Writes multiple sequence alignment (possibly unaligned) 'seqs'
# to a file in PHYLIP format.
File.open('outfile.phylip', 'w') do |f|
  f.write(seqs.output(:phylip))
end
```_

Relevant API documentation:

  * [Bio::ClustalW::Report](http://bioruby.open-bio.org/rdoc/classes/Bio/ClustalW/Report.html)
  * [Bio::Alignment](http://bioruby.open-bio.org/rdoc/classes/Bio/Alignment.html)
  * [Bio::Sequence](http://bioruby.open-bio.org/rdoc/classes/Bio/Sequence.html)

### Creating a Multiple Sequence Alignment ###


### Creating a Multiple Sequence Alignment from a Database ###

?

### Writing a Multiple Sequence Alignment to a File ###


The following example shows how to write a multiple sequence alignment in **FASTA**-format. It first creates a file named "outfile.fasta" for writing ('w') and then writes the multiple sequence alignment referred to by variable 'msa' to it in FASTA-format (':fasta').

```
#!/usr/bin/env ruby
require 'bio'

# Creates a new file named "outfile.fasta" and writes
# multiple sequence alignment 'msa' to it in fasta format.
File.open('outfile.fasta', 'w') do |f|
  f.write(msa.output(:fasta))
end
```

#### Setting the Output Format ####

The following symbols determine the output format:

  * `:clustal` for ClustalW
  * `:fasta` for FASTA
  * `:phylip` for PHYLIP interleaved (will truncate sequence names to no more than 10 characters)
  * `:phylipnon` for PHYLIP non-interleaved (will truncate sequence names to no more than 10 characters)
  * `:msf` for MSF
  * `:molphy` for Molphy


For example, the following writes in PHYLIP's non-interleaved format:

```
f.write(align.output(:phylipnon))
```


### Formatting of Individual Sequences ###

BioRuby can format molecular sequences in a variety of formats.
Individual sequences can be formatted to (e.g.) Genbank format as shown in the following examples.

For Sequence objects:
```
seq.to_seq.output(:genbank)
```

For Bio::FlatFile entries:
```
entry.to_biosequence.output(:genbank)
```

The following symbols determine the output format:
  * `:genbank` for Genbank
  * `:embl` for EMBL
  * `:fasta` for FASTA
  * `:fasta_ncbi` for NCBI-type FASTA
  * `:raw` for raw sequence
  * `:fastq` for FASTQ (includes quality scores)
  * `:fastq_sanger` for Sanger-type FASTQ
  * `:fastq_solexa` for Solexa-type FASTQ
  * `:fastq_illumina` for Illumina-type FASTQ

## Calculating Multiple Sequence Alignments ##

BioRuby can be used to execute a variety of multiple sequence alignment
programs (such as [MAFFT](http://mafft.cbrc.jp/alignment/software/), [Probcons](http://probcons.stanford.edu/), [ClustalW](http://www.clustal.org/), [Muscle](http://www.drive5.com/muscle/), and [T-Coffee](http://www.tcoffee.org/Projects_home_page/t_coffee_home_page.html)).
In the following, examples for using the MAFFT and Muscle are shown.


### MAFFT ###

The following example uses the MAFFT program to align four sequences
and then prints the result to the screen.
Please note that if the path to the MAFFT executable is properly set `mafft=Bio::MAFFT.new(options)` can be used instead of explicitly indicating the path as in the example.

```
#!/usr/bin/env ruby
require 'bio'

# 'seqs' is either an array of sequences or a multiple sequence 
# alignment. In general this is read in from a file as described in ?.
# For the purpose of this tutorial, it is generated in code.
seqs = ['MFQIPEFEPSEQEDSSSAER',
        'MGTPKQPSLAPAHALGLRKS',
        'PKQPSLAPAHALGLRKS',
        'MCSTSGCDLE'] 


# Calculates the alignment using the MAFFT program on the local
# machine with options '--maxiterate 1000 --localpair'
# and stores the result in 'report'.
options = ['--maxiterate', '1000', '--localpair']
mafft = Bio::MAFFT.new('path/to/mafft', options)
report = mafft.query_align(seqs)

# Accesses the actual alignment.
align = report.alignment

# Prints each sequence to the console.
align.each { |s| puts s.to_s }

```

References:

  * Katoh, Toh (2008) "Recent developments in the MAFFT multiple sequence alignment program" Briefings in Bioinformatics 9:286-298

  * Katoh, Toh 2010 (2010) "Parallelization of the MAFFT multiple sequence alignment program" Bioinformatics 26:1899-1900



### Muscle ###

```
#!/usr/bin/env ruby
require 'bio'

# 'seqs' is either an array of sequences or a multiple sequence 
# alignment. In general this is read in from a file as described in ?.
# For the purpose of this tutorial, it is generated in code.
seqs = ['MFQIPEFEPSEQEDSSSAER',
        'MGTPKQPSLAPAHALGLRKS',
        'PKQPSLAPAHALGLRKS',
        'MCSTSGCDLE']  

# Calculates the alignment using the Muscle program on the local
# machine with options '-quiet -maxiters 64'
# and stores the result in 'report'.
options = ['-quiet', '-maxiters', '64']
muscle = Bio::Muscle.new('path/to/muscle', options)
report = muscle.query_align(seqs)

# Accesses the actual alignment.
align = report.alignment

# Prints each sequence to the console.
align.each { |s| puts s.to_s }

```

References:

  * Edgar, R.C. (2004) "MUSCLE: multiple sequence alignment with high accuracy and high throughput" Nucleic Acids Res 32(5):1792-1797

### Other Programs ###

_need more detail here..._

[Probcons](http://probcons.stanford.edu/), [ClustalW](http://www.clustal.org/), and [T-Coffee](http://www.tcoffee.org/Projects_home_page/t_coffee_home_page.html) can be used in the same manner as the programs above.



## Manipulating Multiple Sequence Alignments ##

Oftentimes, multiple sequence to be used for phylogenetic inference are 'cleaned up' in some manner. For instance, some researchers prefer to delete columns with more than 50% gaps. The following code is an example of how to do that in BioRuby.


_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```



---


# Phylogenetic Trees #


## Phylogenetic Tree Input and Output ##


### Reading in of Phylogenetic Trees ###



#### Newick or New Hampshire Format ####

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```

#### phyloXML Format ####

Partially copied from [Diana Jaunzeikare's documentation](https://www.nescent.org/wg_phyloinformatics/BioRuby_PhyloXML_HowTo_documentation).

In addition to BioRuby, a libxml Ruby binding is also required. This can be installed with the following command:

```
% gem install -r libxml-ruby
```

This example reads file "example.xml" and stores its [phyloXML](http://www.phyloxml.org/)-formatted trees in variable 'trees'.

```
#!/usr/bin/env ruby
require 'bio'

# This creates new phyloXML parser.
trees = Bio::PhyloXML::Parser.new('example.xml')

# This prints the names of all trees in the file.
trees.each do |tree|
  puts tree.name
end

# If there are several trees in the file, you can access the one you wish via index.
tree = trees[3]

```


#### Nexus  Format ####

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```

### Writing of Phylogenetic Trees ###

#### Newick or New Hampshire Format ####

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```

#### phyloXML Format ####

Partially copied from [Diana Jaunzeikare's documentation](https://www.nescent.org/wg_phyloinformatics/BioRuby_PhyloXML_HowTo_documentation).

In addition to BioRuby, a libxml Ruby binding is also required. This can be installed with the following command:

```
% gem install -r libxml-ruby
```

This example writes trees 'tree1' and 'tree2' to file "tree.xml" in [phyloXML](http://www.phyloxml.org/) format.

```
#!/usr/bin/env ruby
require 'bio'

# this creates new phyloXML writer.
writer = Bio::PhyloXML::Writer.new('tree.xml')

# Writes tree to the file "tree.xml".
writer.write(tree1)

# Adds another tree to the file.
writer.write(tree2)


```


#### Nexus  Format ####

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```


# Phylogenetic Inference #

_Currently BioRuby does not contain wrappers for phylogenetic inference programs, thus I am progress of writing a RAxML wrapper followed by a wrapper for FastME..._

## Optimality Criteria Based on Character Data ##

Character data based methods work directly on molecular sequences and thus do not require the calculation of pairwise distances but tend to be time consuming and sensitive to errors in the multiple sequence alignment.

### Maximum Likelihood ###

#### RAxML ####

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```


#### PhyML ####

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```

### Maximum Parsimony ###

Currently no direct support in BioRuby.


### Bayesian Inference ###

Currently no direct support in BioRuby.


## Pairwise Distance Based Methods ##

### Pairwise Sequence Distance Estimation ###

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```


### Optimality Criteria Based on Pairwise Distances ###


#### Minimal Evolution: FastME ####

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```

### Algorithmic Methods Based on Pairwise Distances ###

#### Neighbor Joining and Related Methods ####

_... to be done_

```
#!/usr/bin/env ruby
require 'bio'

```







## Support Calculation? ##

### Bootstrap Resampling? ###



---


# Analyzing Phylogenetic Trees #

## PAML ##


## Gene Duplication Inference ##

_need to further test and then import GSoC 'SDI' work..._


## Others? ##



---


# Putting It All Together #

Example of a small "pipeline"-type program running a mininal phyogenetic analysis: starting with a set of sequences and ending with a phylogenetic tree.
