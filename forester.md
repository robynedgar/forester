# forester Tutorial and Examples #


# Introduction #

Under development!

This contains documentation, tutorials, and examples for [forester](https://sites.google.com/site/cmzmasek/home/software/forester/).

Documentation for [Archaeopteryx](https://sites.google.com/site/cmzmasek/home/software/archaeopteryx/) can be found [here](https://sites.google.com/site/cmzmasek/home/software/archaeopteryx/documentation).

**All examples require jar-file "forester.jar" to be in the class-path.**

Download: http://code.google.com/p/forester/downloads/list

Author: [Christian Zmasek](https://sites.google.com/site/cmzmasek/), Sanford-Burnham Medical Research Institute


Copyright (C) 2013 Christian M Zmasek. All rights reserved.



# Reading and writing of phylogenetic trees #



```

package examples;

import java.io.File;
import java.io.IOException;

import org.forester.io.parsers.PhylogenyParser;
import org.forester.io.parsers.util.ParserUtils;
import org.forester.io.writers.PhylogenyWriter;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyMethods;
import org.forester.util.ForesterUtil;

public class Example {

    public static void main( final String[] args ) {
        // Reading-in of (a) tree(s) from a file.
        final File treefile = new File( "/path/to/tree.xml" );
        PhylogenyParser parser = null;
        try {
            parser = ParserUtils.createParserDependingOnFileType( treefile, true );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
        Phylogeny[] phys = null;
        try {
            phys = PhylogenyMethods.readPhylogenies( parser, treefile );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
        // Writing trees to a file.
        final File outfile = new File( "/path/to/out_tree.xml" );
        try {
            final PhylogenyWriter writer = new PhylogenyWriter();
            writer.toPhyloXML( phys, 0, outfile, ForesterUtil.LINE_SEPARATOR );
        }
        catch ( final Exception e ) {
            e.printStackTrace();
        }
    }
}

```



# Reading of phylogenetic trees and displaying them with Archaeopteryx #


```

package examples;

import java.io.File;
import java.io.IOException;

import org.forester.archaeopteryx.Archaeopteryx;
import org.forester.io.parsers.util.ParserUtils;
import org.forester.io.parsers.PhylogenyParser;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyMethods;

public class Example {

    public static void main( final String[] args ) {
        // Reading-in of (a) tree(s) from a file.
        final File treefile = new File( "/path/to/tree.xml" );
        PhylogenyParser parser = null;
        try {
            parser = ParserUtils.createParserDependingOnFileType( treefile, true );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
        Phylogeny[] phys = null;
        try {
            phys = PhylogenyMethods.readPhylogenies( parser, treefile );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
        // Display of the tree(s) with Archaeopteryx.
        Archaeopteryx.createApplication( phys );
    }
}

```




# Creating a new tree and displaying it with Archaeopteryx #


```

package examples;

import org.forester.archaeopteryx.Archaeopteryx;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyNode;

public class Example {

    public static void main( final String[] args ) {
        // Creating a new rooted tree with two external nodes.
        final Phylogeny phy = new Phylogeny();
        final PhylogenyNode root = new PhylogenyNode();
        final PhylogenyNode d1 = new PhylogenyNode();
        final PhylogenyNode d2 = new PhylogenyNode();
        root.setName( "root" );
        d1.setName( "descendant 1" );
        d2.setName( "descendant 2" );
        root.addAsChild( d1 );
        root.addAsChild( d2 );
        phy.setRoot( root );
        phy.setRooted( true );
        // Displaying the newly created tree with Archaeopteryx.
        Archaeopteryx.createApplication( phy );
    }
}

```






# Using iterators to visit tree nodes in certain orders #

```

package examples;

import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyNode;
import org.forester.phylogeny.iterators.PhylogenyNodeIterator;

public class Example {

    public static void main( final String[] args ) {
        // Creating a new rooted tree with four external nodes.
        final Phylogeny phy = new Phylogeny();
        final PhylogenyNode root = new PhylogenyNode();
        final PhylogenyNode d1 = new PhylogenyNode();
        final PhylogenyNode d2 = new PhylogenyNode();
        final PhylogenyNode d11 = new PhylogenyNode();
        final PhylogenyNode d12 = new PhylogenyNode();
        root.setName( "root" );
        d1.setName( "1" );
        d2.setName( "2" );
        d11.setName( "1-1" );
        d12.setName( "1-2" );
        root.addAsChild( d1 );
        root.addAsChild( d2 );
        d2.addAsChild( d11 );
        d2.addAsChild( d12 );
        phy.setRoot( root );
        phy.setRooted( true );
        // Using a variety of iterators to visit the nodes of the newly created tree.
        System.out.println( "post-order:" );
        for( final PhylogenyNodeIterator it = phy.iteratorPostorder(); it.hasNext(); ) {
            System.out.println( it.next().getName() );
        }
        System.out.println( "pre-order:" );
        for( final PhylogenyNodeIterator it = phy.iteratorPreorder(); it.hasNext(); ) {
            System.out.println( it.next().getName() );
        }
        System.out.println( "level-order:" );
        for( final PhylogenyNodeIterator it = phy.iteratorLevelOrder(); it.hasNext(); ) {
            System.out.println( it.next().getName() );
        }
        System.out.println( "external nodes only:" );
        for( final PhylogenyNodeIterator it = phy.iteratorExternalForward(); it.hasNext(); ) {
            System.out.println( it.next().getName() );
        }
    }
}

```









# Creating a basic gene tree (with branch lengths) #


```

package examples;

import org.forester.archaeopteryx.Archaeopteryx;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyNode;
import org.forester.phylogeny.data.Event;
import org.forester.phylogeny.data.Sequence;
import org.forester.phylogeny.data.Taxonomy;

public class Example {

    public static void main( final String[] args ) {
        // Creating a new rooted tree with two external nodes.
        final Phylogeny phy = new Phylogeny();
        final PhylogenyNode root = new PhylogenyNode();
        final PhylogenyNode d1 = new PhylogenyNode();
        final PhylogenyNode d2 = new PhylogenyNode();
        // Setting of distances.
        d1.setDistanceToParent( 1.2 );
        d2.setDistanceToParent( 2.4 );
        // Adding species information.
        final Taxonomy t1 = new Taxonomy();
        t1.setScientificName( "Nematostella vectensis" );
        d1.getNodeData().addTaxonomy( t1 );
        final Taxonomy t2 = new Taxonomy();
        t2.setScientificName( "Monosiga brevicollis" );
        d2.getNodeData().addTaxonomy( t2 );
        // Adding gene names.
        final Sequence s1 = new Sequence();
        s1.setName( "Bcl-2" );
        d1.getNodeData().addSequence( s1 );
        final Sequence s2 = new Sequence();
        s2.setName( "Bcl-2" );
        d2.getNodeData().addSequence( s2 );
        // Root is a speciation.
        final Event ev = new Event();
        ev.setSpeciations( 1 );
        ev.setDuplications( 0 );
        root.getNodeData().setEvent( ev );
        // Putting the tree together.
        root.addAsChild( d1 );
        root.addAsChild( d2 );
        phy.setRoot( root );
        phy.setRooted( true );
        // Displaying the newly created tree with Archaeopteryx.
        Archaeopteryx.createApplication( phy );
    }
}

```

# Writing a phylogenetic tree to a graphics file (e.g. png, jpg) #

```

package examples;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.forester.archaeopteryx.AptxUtil;
import org.forester.archaeopteryx.AptxUtil.GraphicsExportType;
import org.forester.archaeopteryx.Configuration;
import org.forester.archaeopteryx.Options;
import org.forester.archaeopteryx.TreeColorSet;

public class phylo2graphics {

    public static void main( final String[] args ) {
        try {
            final Configuration config = new Configuration();
            // Could also read a configuration file with:
            // Configuration config = new Configuration("my_configuration_file.txt", false, false, false);
            config.putDisplayColors( TreeColorSet.BACKGROUND, new Color( 255, 255, 255 ) );
            config.putDisplayColors( TreeColorSet.BRANCH, new Color( 0, 0, 0 ) );
            config.putDisplayColors( TreeColorSet.TAXONOMY, new Color( 0, 0, 0 ) );
            config.setPhylogenyGraphicsType( Options.PHYLOGENY_GRAPHICS_TYPE.RECTANGULAR );
            AptxUtil.writePhylogenyToGraphicsFile( new File( "my_tree.xml" ),
                                                   new File( "my_tree_graphics.png" ),
                                                   1000,
                                                   1000,
                                                   GraphicsExportType.PNG,
                                                   config );
            // If the tree 'phy' already exists, can also use this:
            AptxUtil.writePhylogenyToGraphicsFile( phy,
                                                   new File( "out.png" ),
                                                   1000,
                                                   1000,
                                                   GraphicsExportType.PNG,
                                                   config );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
    }
}

```

# Setting node/branch colors of a phylogenetic tree and writing it to a graphics file #

```

package examples;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.forester.archaeopteryx.AptxUtil;
import org.forester.archaeopteryx.AptxUtil.GraphicsExportType;
import org.forester.archaeopteryx.Configuration;
import org.forester.archaeopteryx.Options;
import org.forester.archaeopteryx.TreeColorSet;
import org.forester.io.parsers.PhylogenyParser;
import org.forester.io.parsers.util.ParserUtils;
import org.forester.phylogeny.Phylogeny;
import org.forester.phylogeny.PhylogenyMethods;
import org.forester.phylogeny.PhylogenyNode;
import org.forester.phylogeny.data.BranchColor;
import org.forester.phylogeny.data.BranchWidth;
import org.forester.phylogeny.iterators.PhylogenyNodeIterator;

public class phylo2coloredgraphics {

    public static void main( final String[] args ) {
        try {
            // Reading-in of a tree from a file.
            final File treefile = new File( "my_tree.nh" );
            final PhylogenyParser parser = ParserUtils.createParserDependingOnFileType( treefile, true );
            final Phylogeny phy = PhylogenyMethods.readPhylogenies( parser, treefile )[ 0 ];
            // Creating a node name -> color map.
            final Map<String, Color> colors = new HashMap<String, Color>();
            colors.put( "Primates", new Color( 255, 255, 0 ) );
            colors.put( "PANTR", new Color( 255, 0, 255 ) );
            colors.put( "HUMAN", new Color( 255, 0, 0 ) );
            colors.put( "RAT", new Color( 155, 0, 0 ) );
            colors.put( "MOUSE", new Color( 55, 155, 0 ) );
            colors.put( "CAVPO", new Color( 155, 155, 0 ) );
            colors.put( "LOTGI", new Color( 155, 155, 255 ) );
            // Setting colors.
            for( final PhylogenyNodeIterator it = phy.iteratorPostorder(); it.hasNext(); ) {
                final PhylogenyNode n = it.next();
                if ( colors.containsKey( n.getName() ) ) {
                    n.getBranchData().setBranchColor( new BranchColor( colors.get( n.getName() ) ) );
                    // To make colored subtrees thicker:
                    n.getBranchData().setBranchWidth( new BranchWidth( 4 ) );
                }
            }
            // Setting up a configuration object.
            final Configuration config = new Configuration();
            config.putDisplayColors( TreeColorSet.BACKGROUND, new Color( 255, 255, 255 ) );
            config.putDisplayColors( TreeColorSet.BRANCH, new Color( 0, 0, 0 ) );
            config.putDisplayColors( TreeColorSet.TAXONOMY, new Color( 0, 0, 0 ) );
            config.setPhylogenyGraphicsType( Options.PHYLOGENY_GRAPHICS_TYPE.RECTANGULAR );
            config.setTaxonomyColorize( false );
            config.setColorizeBranches( true );
            config.setUseBranchesWidths( true );
            config.setDisplayTaxonomyCode( false );
            // Writing to a graphics file.
            AptxUtil.writePhylogenyToGraphicsFile( phy,
                                                   new File( "out.png" ),
                                                   1300,
                                                   1300,
                                                   GraphicsExportType.PNG,
                                                   config );
        }
        catch ( final IOException e ) {
            e.printStackTrace();
        }
    }
}

```