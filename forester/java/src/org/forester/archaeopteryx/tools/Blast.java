// $Id:
// FORESTER -- software libraries and applications
// for evolutionary biology research and applications.
//
// Copyright (C) 2008-2009 Christian M. Zmasek
// Copyright (C) 2008-2009 Burnham Institute for Medical Research
// All rights reserved
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
//
// Contact: phylosoft @ gmail . com
// WWW: www.phylosoft.org/forester

package org.forester.archaeopteryx.tools;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JApplet;

import org.forester.archaeopteryx.AptxUtil;
import org.forester.archaeopteryx.TreePanel;
import org.forester.phylogeny.PhylogenyNode;
import org.forester.util.ForesterUtil;
import org.forester.ws.wabi.RestUtil;

public class Blast {

    final static Pattern identifier_pattern_1 = Pattern.compile ("^([A-Za-z]{2,5})[|=:]([0-9A-Za-z\\.]{4,40})\\s*$");
    final static Pattern identifier_pattern_2 = Pattern.compile ("^([A-Za-z]{2,5})[|=:]([0-9A-Za-z\\.]{4,40})[|,; ].*$");
    
    public Blast() {
    }


    public static void NcbiBlastWeb( String query, JApplet applet, TreePanel p ) {

      //http://www.ncbi.nlm.nih.gov/blast/Blast.cgi?CMD=Web&PAGE=Proteins&DATABASE=swissprot&QUERY=gi|163848401
        
        
        StringBuilder uri_str = new StringBuilder();
        uri_str.append( "http://www.ncbi.nlm.nih.gov/blast/Blast.cgi?CMD=Web&DATABASE=nr&PAGE=Proteins&QUERY=" );
        uri_str.append( query );
        try {

            AptxUtil.launchWebBrowser( new URI( uri_str.toString() ), applet != null, applet, "_aptx_blast" );
        }
        catch ( final IOException e ) {
            AptxUtil.showErrorMessage( p, e.toString() );
            e.printStackTrace();
        }
        catch ( final URISyntaxException e ) {
            AptxUtil.showErrorMessage( p, e.toString() );
            e.printStackTrace();
        }

    }
    public static String obtainQueryForBlast( final PhylogenyNode node ) {
        String query = "";
        if ( !ForesterUtil.isEmpty( node.getNodeData().getSequence().getMolecularSequence() ) ) {
            query = node.getNodeData().getSequence().getMolecularSequence();
        }
        else if ( node.getNodeData().getSequence().getAccession() != null && !ForesterUtil.isEmpty( node.getNodeData().getSequence().getAccession().getValue() ) ) {
            if ( !ForesterUtil.isEmpty( node.getNodeData().getSequence().getAccession().getSource() ) ) {
                query = node.getNodeData().getSequence().getAccession().getSource() + "%7C";
            }
            query += node.getNodeData().getSequence().getAccession().getValue();
        }
        else if ( !ForesterUtil.isEmpty( node.getNodeData().getSequence().getName() ) ) {
            String name = node.getNodeData().getSequence().getName();
            final Matcher matcher1 = identifier_pattern_1.matcher( name );
            final Matcher matcher2 = identifier_pattern_2.matcher( name );
            String group1 = "";
            String group2 = "";
            
            if ( matcher1.matches() ) {
                group1 =  matcher1.group( 1 );
                group2 =  matcher1.group( 2 );
                System.out.println( "1 1=" + group1 );

                System.out.println( "1 2=" + group2 );
            }
            if ( matcher2.matches() ) {
                group1 =  matcher2.group( 1 );
                group2 =  matcher2.group( 2 );
                System.out.println( "2 1=" + group1 );

                System.out.println( "2 2=" + group2 );
            }
            if (!ForesterUtil.isEmpty( group1 ) && !ForesterUtil.isEmpty( group2 )) {
                query = group1  + "%7C" + group2;
            }

        }
       
        
        System.out.println( query );

        return query;
    }


    public void ddbjBlast( final String geneName ) {
        // Retrieve accession number list which has specified gene name from searchByXMLPath of ARSA. Please click here for details of ARSA.
        /*target: Sequence length is between 300bp and 1000bp.
        Feature key is CDS.
        Gene qualifire is same as specified gene name.*/
        String queryPath = "/ENTRY/DDBJ/division=='HUM' AND (/ENTRY/DDBJ/length>=300 AND "
            + "/ENTRY/DDBJ/length<=1000) ";
        queryPath += "AND (/ENTRY/DDBJ/feature-table/feature{/f_key = 'CDS' AND ";
        queryPath += "/f_quals/qualifier{/q_name = 'gene' AND /q_value=='" + geneName + "'}})";
        String query = "service=ARSA&method=searchByXMLPath&queryPath=" + queryPath
        + "&returnPath=/ENTRY/DDBJ/primary-accession&offset=1&count=100";
        //Execute ARSA
        String arsaResult = null;
        try {
            arsaResult = RestUtil.getResult( query );
        }
        catch ( final IOException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        final String[] arsaResultLines = arsaResult.split( "\n" );
        //Get hit count
        final int arsaResultNum = Integer.parseInt( arsaResultLines[ 0 ].replaceAll( "hitscount       =", "" ).trim() );
        //If there is no hit, print a message and exit
        if ( arsaResultNum == 0 ) {
            System.out.println( "There is no entry for gene:" + geneName );
            return;
        }
        //Retrieve DNA sequence of top hit entry by using getFASTA_DDBJEntry of GetEntry.
        //Retrieve DNA sequence of first fit.
        final String repAccession = arsaResultLines[ 2 ];
        query = "service=GetEntry&method=getFASTA_DDBJEntry&accession=" + repAccession;
        String dnaSeq = null;
        try {
            dnaSeq = RestUtil.getResult( query );
        }
        catch ( final IOException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println( "Retrieved DNA sequence is: " + dnaSeq );
        //Execute blastn by using searchParam of Blast with step2's sequence. Specified option is -e 0.0001 -m 8 -b 50 -v 50. It means "Extract top 50 hit which E-value is more than 0.0001.". The reference databases are specified as follows. ddbjpri(primates) ddbjrod(rodents) ddbjmam(mammals) ddbjvrt(vertebrates ) ddbjinv(invertebrates).
        //Execute blastn with step3's sequence
        query = "service=Blast&method=searchParam&program=blastn&database=ddbjpri ddbjrod ddbjmam ddbjvrt "
            + "ddbjinv&query=" + dnaSeq + "&param=-m 8 -b 50 -v 50 -e 0.0001";
        String blastResult = null;
        try {
            blastResult = RestUtil.getResult( query );
        }
        catch ( final IOException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // Extract both accession number and similarity score from BLAST result.
        // This step does not use Web API and extract the part of result or edit the result. Please click here to see the details of each column in the BLAST tab delimited format which is generated by -m 8 option.
        final String blastResultLines[] = blastResult.split( "\n" );
        final Vector<String[]> parsedBlastResult = new Vector<String[]>();
        for( final String blastResultLine : blastResultLines ) {
            final String cols[] = blastResultLine.split( "\t" );
            final String accession = cols[ 1 ].substring( 0, cols[ 1 ].indexOf( "|" ) );
            final String[] result = { accession, cols[ 2 ] };
            parsedBlastResult.add( result );
        }
        // Retrieve species name by using searchByXMLPath of ARSA. If the plural subjects whose species
        // name are same are in the result, the highest similarity score is used.
        //Retrieve species from accession number.
        final Hashtable<String, String> organismAccession = new Hashtable<String, String>();
        for( int i = 0; i < parsedBlastResult.size(); i++ ) {
            final String[] parsed = parsedBlastResult.elementAt( i );
            query = "service=ARSA&method=searchByXMLPath&queryPath=/ENTRY/DDBJ/primary-accession=='" + parsed[ 0 ]
                                                                                                               + "'&returnPath=/ENTRY/DDBJ/organism&offset=1&count=100";
            String organism = null;
            try {
                organism = RestUtil.getResult( query );
            }
            catch ( final IOException e ) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            final String[] organismLines = organism.split( "\n" );
            organism = organismLines[ 2 ];
            //If same organism name hits, use first hit.
            if ( !organismAccession.containsKey( organism ) ) {
                organismAccession.put( organism, parsed[ 0 ] + "\t" + parsed[ 1 ] );
            }
        }
        // Print result.
        // Print Result
        System.out.println( "DDBJ entries: " + arsaResultNum );
        System.out.println( "Representative accession: " + repAccession );
        System.out.println( "Organism name\tDDBJ accession number\tSequence similarity" );
        final String[] keys = new String[ organismAccession.size() ];
        final Enumeration<String> enu = organismAccession.keys();
        int count = 0;
        while ( enu.hasMoreElements() ) {
            keys[ count ] = enu.nextElement();
            ++count;
        }
        Arrays.sort( keys );
        for( final String key : keys ) {
            System.out.println( key + "\t" + organismAccession.get( key ) );
        }
    }
}
