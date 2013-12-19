
package org.forester.util;

import java.util.HashMap;
import java.util.Map;

public final class TaxonomyUtil {

    public static String getTaxGroupByTaxCode( final String code ) {
        return _default_taxcode_taxgroup_map.get( code );
    }

    public static int getTaxIdFromFakeTaxCode( final String code ) {
        return FAKE_CODE_TO_ID_MAP.get( code );
    }

    public static boolean isHasTaxIdFromFakeTaxCode( final String code ) {
        return FAKE_CODE_TO_ID_MAP.containsKey( code );
    }
    private final static Map<String, String>  _default_taxcode_taxgroup_map = new HashMap<String, String>();
    static {
        _default_taxcode_taxgroup_map.put( "HUMAN", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "HOMSA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PANTR", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "GORGO", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PONAB", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "NOMLE", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "MACMU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PAPHA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "CALJA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "TARSY", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "MICMU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "OTOGA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "TUPBE", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "MOUSE", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "RAT", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "MESAU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "DIPOR", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "CAVPO", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "HETGA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "SPETR", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "OCHPR", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "RABIT", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "BOVIN", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "SHEEP", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "BALMU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "TURTR", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PIG", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "LAMPA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "HORSE", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "MYOLU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PTEVA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "AILME", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "CANFA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "FELCA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "ERIEU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "SORAR", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "LOXAF", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PROCA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "ECHTE", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "CHOHO", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "DASNO", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "MACEU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "SARHA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "MONDO", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "ORNAN", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "CHICK", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "MELGA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "ANAPL", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "TAEGU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "ALLMI", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PELSI", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "ANOCA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "XENLA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "XENTR", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "LATCH", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "ORYLA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "XIPMA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "GASAC", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "TAKRU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "TETNG", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "ORENI", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "GADMO", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "DANRE", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "CALMI", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PETMA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "CIOIN", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "CIOSA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "OIKDI", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "BRAFL", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "SACKO", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "STRPU", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "FICAL", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "OPHHA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PYTBI", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "LYTVA", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "PATMI", "deuterostomia" );
        _default_taxcode_taxgroup_map.put( "DROSE", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROSI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROME", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROYA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROER", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROAN", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROPE", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROPS", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROWI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROMO", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROVI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DROGR", "protostomia" );
        _default_taxcode_taxgroup_map.put( "AEDAE", "protostomia" );
        _default_taxcode_taxgroup_map.put( "ANOGA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CULPI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "BOMMO", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DANPL", "protostomia" );
        _default_taxcode_taxgroup_map.put( "ATTCE", "protostomia" );
        _default_taxcode_taxgroup_map.put( "ACREC", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CAMFO", "protostomia" );
        _default_taxcode_taxgroup_map.put( "APIME", "protostomia" );
        _default_taxcode_taxgroup_map.put( "NASVI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "TRICA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "ACYPI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "RHOPR", "protostomia" );
        _default_taxcode_taxgroup_map.put( "PEDHC", "protostomia" );
        _default_taxcode_taxgroup_map.put( "ARTSF", "protostomia" );
        _default_taxcode_taxgroup_map.put( "DAPPU", "protostomia" );
        _default_taxcode_taxgroup_map.put( "HOMAM", "protostomia" );
        _default_taxcode_taxgroup_map.put( "ANTGC", "protostomia" );
        _default_taxcode_taxgroup_map.put( "NARAN", "protostomia" );
        _default_taxcode_taxgroup_map.put( "SCUCO", "protostomia" );
        _default_taxcode_taxgroup_map.put( "STRMM", "protostomia" );
        _default_taxcode_taxgroup_map.put( "IXOSC", "protostomia" );
        _default_taxcode_taxgroup_map.put( "TETUR", "protostomia" );
        _default_taxcode_taxgroup_map.put( "MESMA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "LIMPO", "protostomia" );
        _default_taxcode_taxgroup_map.put( "HYPDU", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CAEBR", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CAERE", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CAEBE", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CAEEL", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CAEJA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "PRIPA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "BRUMA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "WUCBA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "TRISP", "protostomia" );
        _default_taxcode_taxgroup_map.put( "APLCA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "LOTGI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CRAGI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "PINFU", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CTEXX", "protostomia" );
        _default_taxcode_taxgroup_map.put( "HELRO", "protostomia" );
        _default_taxcode_taxgroup_map.put( "SCHMA", "protostomia" );
        _default_taxcode_taxgroup_map.put( "CLOSI", "protostomia" );
        _default_taxcode_taxgroup_map.put( "ECHMU", "protostomia" );
        _default_taxcode_taxgroup_map.put( "SCHMD", "protostomia" );
        _default_taxcode_taxgroup_map.put( "ACRDI", "cnidaria" );
        _default_taxcode_taxgroup_map.put( "NEMVE", "cnidaria" );
        _default_taxcode_taxgroup_map.put( "HMAXX", "cnidaria" );
        _default_taxcode_taxgroup_map.put( "HYDMA", "cnidaria" ); //TODO
        _default_taxcode_taxgroup_map.put( "TRIAD", "placozoa" );
        _default_taxcode_taxgroup_map.put( "MNELE", "ctenophora" );
        _default_taxcode_taxgroup_map.put( "AMPQE", "porifera" );
        _default_taxcode_taxgroup_map.put( "AMPQU", "porifera" ); //TODO
        _default_taxcode_taxgroup_map.put( "MONBE", "choanoflagellida" );
        _default_taxcode_taxgroup_map.put( "SALS5", "choanoflagellida" );
        _default_taxcode_taxgroup_map.put( "AMOPA", "ichthyophonida & filasterea" );
        _default_taxcode_taxgroup_map.put( "SARXX", "ichthyophonida & filasterea" );
        _default_taxcode_taxgroup_map.put( "SPHAR", "ichthyophonida & filasterea" ); //TODO
        _default_taxcode_taxgroup_map.put( "CAPO3", "ichthyophonida & filasterea" );
        _default_taxcode_taxgroup_map.put( "CAPOW", "ichthyophonida & filasterea" ); //TODO
        _default_taxcode_taxgroup_map.put( "AALXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "GIBZE", "dikarya" );
        _default_taxcode_taxgroup_map.put( "HYPVG", "dikarya" );
        _default_taxcode_taxgroup_map.put( "MAGGR", "dikarya" );
        _default_taxcode_taxgroup_map.put( "THIHA", "dikarya" );
        _default_taxcode_taxgroup_map.put( "THITE", "dikarya" );
        _default_taxcode_taxgroup_map.put( "CHAGB", "dikarya" );
        _default_taxcode_taxgroup_map.put( "NEUCR", "dikarya" );
        _default_taxcode_taxgroup_map.put( "BOTF4", "dikarya" );
        _default_taxcode_taxgroup_map.put( "SCLS1", "dikarya" );
        _default_taxcode_taxgroup_map.put( "PFIXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "MYCGM", "dikarya" );
        _default_taxcode_taxgroup_map.put( "MYCPJ", "dikarya" );
        _default_taxcode_taxgroup_map.put( "MPSXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "BCOXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "APPXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "APMXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "APSXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "COCSA", "dikarya" );
        _default_taxcode_taxgroup_map.put( "SETTU", "dikarya" );
        _default_taxcode_taxgroup_map.put( "PYRTR", "dikarya" );
        _default_taxcode_taxgroup_map.put( "PHANO", "dikarya" );
        _default_taxcode_taxgroup_map.put( "ASPFN", "dikarya" );
        _default_taxcode_taxgroup_map.put( "ASPNC", "dikarya" );
        _default_taxcode_taxgroup_map.put( "ASPCL", "dikarya" );
        _default_taxcode_taxgroup_map.put( "EMENI", "dikarya" );
        _default_taxcode_taxgroup_map.put( "NEOFI", "dikarya" );
        _default_taxcode_taxgroup_map.put( "COCIM", "dikarya" );
        _default_taxcode_taxgroup_map.put( "UNCRE", "dikarya" );
        _default_taxcode_taxgroup_map.put( "AJECG", "dikarya" );
        _default_taxcode_taxgroup_map.put( "TUBMM", "dikarya" );
        _default_taxcode_taxgroup_map.put( "NAUCC", "dikarya" );
        _default_taxcode_taxgroup_map.put( "YEAST", "dikarya" );
        _default_taxcode_taxgroup_map.put( "KLULA", "dikarya" );
        _default_taxcode_taxgroup_map.put( "ASHGO", "dikarya" );
        _default_taxcode_taxgroup_map.put( "CANAL", "dikarya" );
        _default_taxcode_taxgroup_map.put( "CANTT", "dikarya" );
        _default_taxcode_taxgroup_map.put( "DEBHA", "dikarya" );
        _default_taxcode_taxgroup_map.put( "YARLI", "dikarya" );
        _default_taxcode_taxgroup_map.put( "SCHJY", "dikarya" );
        _default_taxcode_taxgroup_map.put( "SCHOT", "dikarya" );
        _default_taxcode_taxgroup_map.put( "SCHPO", "dikarya" );
        _default_taxcode_taxgroup_map.put( "PNECA", "dikarya" );
        _default_taxcode_taxgroup_map.put( "AGABU", "dikarya" );
        _default_taxcode_taxgroup_map.put( "COPC7", "dikarya" );
        _default_taxcode_taxgroup_map.put( "LACBS", "dikarya" );
        _default_taxcode_taxgroup_map.put( "LACBI", "dikarya" ); //TODO
        _default_taxcode_taxgroup_map.put( "PLEOS", "dikarya" );
        _default_taxcode_taxgroup_map.put( "CPUXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "SERL9", "dikarya" );
        _default_taxcode_taxgroup_map.put( "JARXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "GLOTR", "dikarya" );
        _default_taxcode_taxgroup_map.put( "FPIXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "PPLXX", "dikarya" );
        _default_taxcode_taxgroup_map.put( "TRAVE", "dikarya" );
        _default_taxcode_taxgroup_map.put( "WOLCO", "dikarya" );
        _default_taxcode_taxgroup_map.put( "CERSU", "dikarya" );
        _default_taxcode_taxgroup_map.put( "DICSQ", "dikarya" );
        _default_taxcode_taxgroup_map.put( "HETAN", "dikarya" );
        _default_taxcode_taxgroup_map.put( "CRYNE", "dikarya" );
        _default_taxcode_taxgroup_map.put( "TREME", "dikarya" );
        _default_taxcode_taxgroup_map.put( "MALGO", "dikarya" );
        _default_taxcode_taxgroup_map.put( "USTMA", "dikarya" );
        _default_taxcode_taxgroup_map.put( "MELLP", "dikarya" );
        _default_taxcode_taxgroup_map.put( "PUCGR", "dikarya" );
        _default_taxcode_taxgroup_map.put( "RHOGR", "dikarya" );
        _default_taxcode_taxgroup_map.put( "SPORO", "dikarya" );
        _default_taxcode_taxgroup_map.put( "WALSC", "dikarya" );
        _default_taxcode_taxgroup_map.put( "MUCCI", "other fungi" );
        _default_taxcode_taxgroup_map.put( "PHYBL", "other fungi" );
        _default_taxcode_taxgroup_map.put( "RHIOR", "other fungi" );
        _default_taxcode_taxgroup_map.put( "MVNXX", "other fungi" );
        _default_taxcode_taxgroup_map.put( "CREXX", "other fungi" );
        _default_taxcode_taxgroup_map.put( "ALLMA", "other fungi" );
        _default_taxcode_taxgroup_map.put( "BATDJ", "other fungi" );
        _default_taxcode_taxgroup_map.put( "SPIPN", "other fungi" );
        _default_taxcode_taxgroup_map.put( "GONPR", "other fungi" );
        _default_taxcode_taxgroup_map.put( "PIRSE", "other fungi" );
        _default_taxcode_taxgroup_map.put( "ENCCU", "other fungi" );
        _default_taxcode_taxgroup_map.put( "ENCHA", "other fungi" );
        _default_taxcode_taxgroup_map.put( "VITCO", "other fungi" );
        _default_taxcode_taxgroup_map.put( "ENTBH", "other fungi" );
        _default_taxcode_taxgroup_map.put( "TRAHO", "other fungi" );
        _default_taxcode_taxgroup_map.put( "VAVCU", "other fungi" );
        _default_taxcode_taxgroup_map.put( "EDHAE", "other fungi" );
        _default_taxcode_taxgroup_map.put( "FALXX", "nucleariidae and fonticula group" );
        _default_taxcode_taxgroup_map.put( "DICDI", "amoebozoa" );
        _default_taxcode_taxgroup_map.put( "DICPU", "amoebozoa" );
        _default_taxcode_taxgroup_map.put( "DICFS", "amoebozoa" );
        _default_taxcode_taxgroup_map.put( "POLPA", "amoebozoa" );
        _default_taxcode_taxgroup_map.put( "ENTHI", "amoebozoa" );
        _default_taxcode_taxgroup_map.put( "ENTDS", "amoebozoa" );
        _default_taxcode_taxgroup_map.put( "FRAVE", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "PRUPE", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "CUCSA", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "SOYBN", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "MEDTR", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "MANES", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "RICCO", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "POPTR", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "ARALY", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "ARATH", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "THEHA", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "CARPA", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "CCLXX", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "CITSI", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "EUCGR", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "VITVI", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "SOLLC", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "SOLPI", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "SOLTU", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "TOBAC", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "MIMGU", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "AQUCA", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "SORBI", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "MAIZE", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "PANVG", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "SETIT", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "ORYSA", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "ORYSJ", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "BRADI", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "HORVD", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "MUSAM", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "PICAB", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "SELML", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "PHYPA", "embryophyta" );
        _default_taxcode_taxgroup_map.put( "OSTLU", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "ORCXX", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "OSTTA", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "MICPC", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "MICSR", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "ASCXX", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "CHLVA", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "CSUXX", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "CHLRE", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "VOLCA", "chlorophyta" );
        _default_taxcode_taxgroup_map.put( "CYAME", "rhodophyta" );
        _default_taxcode_taxgroup_map.put( "GALSU", "rhodophyta" );
        _default_taxcode_taxgroup_map.put( "CHOCR", "rhodophyta" );
        _default_taxcode_taxgroup_map.put( "CYAPA", "glaucocystophyceae" );
        _default_taxcode_taxgroup_map.put( "EMIHU", "hacrobia" );
        _default_taxcode_taxgroup_map.put( "GUITH", "hacrobia" );
        _default_taxcode_taxgroup_map.put( "PLACH", "alveolata" );
        _default_taxcode_taxgroup_map.put( "PLAF7", "alveolata" );
        _default_taxcode_taxgroup_map.put( "PLAYO", "alveolata" );
        _default_taxcode_taxgroup_map.put( "PLAVS", "alveolata" );
        _default_taxcode_taxgroup_map.put( "THEAN", "alveolata" );
        _default_taxcode_taxgroup_map.put( "THEPA", "alveolata" );
        _default_taxcode_taxgroup_map.put( "BABBO", "alveolata" );
        _default_taxcode_taxgroup_map.put( "EIMTE", "alveolata" );
        _default_taxcode_taxgroup_map.put( "TOXGO", "alveolata" );
        _default_taxcode_taxgroup_map.put( "CRYHO", "alveolata" );
        _default_taxcode_taxgroup_map.put( "CRYPV", "alveolata" );
        _default_taxcode_taxgroup_map.put( "CRYPI", "alveolata" );
        _default_taxcode_taxgroup_map.put( "CRYCO", "alveolata" );
        _default_taxcode_taxgroup_map.put( "THOHE", "alveolata" );
        _default_taxcode_taxgroup_map.put( "PARTE", "alveolata" );
        _default_taxcode_taxgroup_map.put( "TETTS", "alveolata" );
        _default_taxcode_taxgroup_map.put( "OTRXX", "alveolata" );
        _default_taxcode_taxgroup_map.put( "BLEJA", "alveolata" );
        _default_taxcode_taxgroup_map.put( "PERM5", "alveolata" );
        _default_taxcode_taxgroup_map.put( "ICHMG", "alveolata" );
        _default_taxcode_taxgroup_map.put( "FCYXX", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "PHATR", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "THAPS", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "THAOC", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "AURAN", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "ECTSI", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "PHYIN", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "PHYRM", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "PHYSO", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "PHYCI", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "PHYCP", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "HYAAE", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "PYTUL", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "AKEXX", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "SAGXX", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "ALIXX", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "BLAHO", "stramenopiles" );
        _default_taxcode_taxgroup_map.put( "BIGNA", "rhizaria" );
        _default_taxcode_taxgroup_map.put( "TRYB2", "excavata" );
        _default_taxcode_taxgroup_map.put( "TRYCR", "excavata" );
        _default_taxcode_taxgroup_map.put( "LEIMA", "excavata" );
        _default_taxcode_taxgroup_map.put( "LEIIN", "excavata" );
        _default_taxcode_taxgroup_map.put( "LEIBR", "excavata" );
        _default_taxcode_taxgroup_map.put( "BODSA", "excavata" );
        _default_taxcode_taxgroup_map.put( "NAEGR", "excavata" );
        _default_taxcode_taxgroup_map.put( "GIAIC", "excavata" );
        _default_taxcode_taxgroup_map.put( "GIALA", "excavata" ); //TODO
        _default_taxcode_taxgroup_map.put( "TRIVA", "excavata" );
        _default_taxcode_taxgroup_map.put( "TTRXX", "apusozoa" );
        _default_taxcode_taxgroup_map.put( "THETR", "apusozoa" ); //TODO //FIXME
        _default_taxcode_taxgroup_map.put( "METAC", "archaea" );
        _default_taxcode_taxgroup_map.put( "METBF", "archaea" );
        _default_taxcode_taxgroup_map.put( "METMA", "archaea" );
        _default_taxcode_taxgroup_map.put( "METBU", "archaea" );
        _default_taxcode_taxgroup_map.put( "METB6", "archaea" );
        _default_taxcode_taxgroup_map.put( "METHU", "archaea" );
        _default_taxcode_taxgroup_map.put( "METMJ", "archaea" );
        _default_taxcode_taxgroup_map.put( "METLZ", "archaea" );
        _default_taxcode_taxgroup_map.put( "METTP", "archaea" );
        _default_taxcode_taxgroup_map.put( "HALMA", "archaea" );
        _default_taxcode_taxgroup_map.put( "NATPH", "archaea" );
        _default_taxcode_taxgroup_map.put( "HALS3", "archaea" );
        _default_taxcode_taxgroup_map.put( "HALSP", "archaea" );
        _default_taxcode_taxgroup_map.put( "HALWD", "archaea" );
        _default_taxcode_taxgroup_map.put( "ARCFU", "archaea" );
        _default_taxcode_taxgroup_map.put( "METJA", "archaea" );
        _default_taxcode_taxgroup_map.put( "META3", "archaea" );
        _default_taxcode_taxgroup_map.put( "METMP", "archaea" );
        _default_taxcode_taxgroup_map.put( "METVS", "archaea" );
        _default_taxcode_taxgroup_map.put( "METS3", "archaea" );
        _default_taxcode_taxgroup_map.put( "METST", "archaea" );
        _default_taxcode_taxgroup_map.put( "METTH", "archaea" );
        _default_taxcode_taxgroup_map.put( "METKA", "archaea" );
        _default_taxcode_taxgroup_map.put( "PYRFU", "archaea" );
        _default_taxcode_taxgroup_map.put( "PYRKO", "archaea" );
        _default_taxcode_taxgroup_map.put( "PYRAB", "archaea" );
        _default_taxcode_taxgroup_map.put( "PYRHO", "archaea" );
        _default_taxcode_taxgroup_map.put( "THEON", "archaea" );
        _default_taxcode_taxgroup_map.put( "NANEQ", "archaea" );
        _default_taxcode_taxgroup_map.put( "NITMS", "archaea" );
        _default_taxcode_taxgroup_map.put( "THEAC", "archaea" );
        _default_taxcode_taxgroup_map.put( "THEVO", "archaea" );
        _default_taxcode_taxgroup_map.put( "PICTO", "archaea" );
        _default_taxcode_taxgroup_map.put( "PYRAR", "archaea" );
        _default_taxcode_taxgroup_map.put( "PYRCJ", "archaea" );
        _default_taxcode_taxgroup_map.put( "PYRAE", "archaea" );
        _default_taxcode_taxgroup_map.put( "PYRIL", "archaea" );
        _default_taxcode_taxgroup_map.put( "THENV", "archaea" );
        _default_taxcode_taxgroup_map.put( "CALMQ", "archaea" );
        _default_taxcode_taxgroup_map.put( "SULAC", "archaea" );
        _default_taxcode_taxgroup_map.put( "SULTO", "archaea" );
        _default_taxcode_taxgroup_map.put( "SULSO", "archaea" );
        _default_taxcode_taxgroup_map.put( "METS5", "archaea" );
        _default_taxcode_taxgroup_map.put( "AERPE", "archaea" );
        _default_taxcode_taxgroup_map.put( "STAMF", "archaea" );
        _default_taxcode_taxgroup_map.put( "THEPD", "archaea" );
        _default_taxcode_taxgroup_map.put( "HYPBU", "archaea" );
        _default_taxcode_taxgroup_map.put( "IGNH4", "archaea" );
        _default_taxcode_taxgroup_map.put( "KORCO", "archaea" );
        _default_taxcode_taxgroup_map.put( "ECOLI", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ECO57", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SHIFL", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SALTY", "bacteria" );
        _default_taxcode_taxgroup_map.put( "YERPE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PHOLU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PHOPR", "bacteria" );
        _default_taxcode_taxgroup_map.put( "VIBCH", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SHEDO", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PSEF5", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PSEPF", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PSEAE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHRSD", "bacteria" );
        _default_taxcode_taxgroup_map.put( "DECAR", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RALME", "bacteria" );
        _default_taxcode_taxgroup_map.put( "NITEU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "NITMU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "THIDE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ALHEH", "bacteria" );
        _default_taxcode_taxgroup_map.put( "HALHL", "bacteria" );
        _default_taxcode_taxgroup_map.put( "NITOC", "bacteria" );
        _default_taxcode_taxgroup_map.put( "THICR", "bacteria" );
        _default_taxcode_taxgroup_map.put( "IDILO", "bacteria" );
        _default_taxcode_taxgroup_map.put( "LEGPN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "XANAC", "bacteria" );
        _default_taxcode_taxgroup_map.put( "XYLFT", "bacteria" );
        _default_taxcode_taxgroup_map.put( "AGRT5", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RHIEC", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BRAJA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RHOPT", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RHOS1", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ROSDO", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CAUCR", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ACICY", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RHORU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "HAEIN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PASMU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "NEIME", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ACIFE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "DESPS", "bacteria" );
        _default_taxcode_taxgroup_map.put( "DESDE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SYNAS", "bacteria" );
        _default_taxcode_taxgroup_map.put( "GEOME", "bacteria" );
        _default_taxcode_taxgroup_map.put( "GEOSL", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ANADE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "MYXXA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ACIBL", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SOLUS", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RHOBA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "KINRD", "bacteria" );
        _default_taxcode_taxgroup_map.put( "KOCRD", "bacteria" );
        _default_taxcode_taxgroup_map.put( "MICPN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "STRCO", "bacteria" );
        _default_taxcode_taxgroup_map.put( "THEFY", "bacteria" );
        _default_taxcode_taxgroup_map.put( "MYCLE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "MYCTU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CORJK", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RHOOB", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RUBXD", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLAU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ROSCS", "bacteria" );
        _default_taxcode_taxgroup_map.put( "HERAU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SPHTD", "bacteria" );
        _default_taxcode_taxgroup_map.put( "DEIGD", "bacteria" );
        _default_taxcode_taxgroup_map.put( "DEIRA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "THET8", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ANAVT", "bacteria" );
        _default_taxcode_taxgroup_map.put( "NOSS7", "bacteria" );
        _default_taxcode_taxgroup_map.put( "NOSP7", "bacteria" );
        _default_taxcode_taxgroup_map.put( "ACAM1", "bacteria" );
        _default_taxcode_taxgroup_map.put( "MICAN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "TRIER", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SYNEL", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SYNY3", "bacteria" );
        _default_taxcode_taxgroup_map.put( "GLOVI", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PROMA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PROMP", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PROMM", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SYNS3", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLPB", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PROAE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PELLU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PROVI", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLP8", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLTE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLCH", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLTA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "FLAJO", "bacteria" );
        _default_taxcode_taxgroup_map.put( "GRAFK", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CYTH3", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BACFR", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BACTN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PORGI", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SALRD", "bacteria" );
        _default_taxcode_taxgroup_map.put( "AKKM8", "bacteria" );
        _default_taxcode_taxgroup_map.put( "METI4", "bacteria" );
        _default_taxcode_taxgroup_map.put( "LEPIC", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BACAN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BACC3", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BACSU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BACHD", "bacteria" );
        _default_taxcode_taxgroup_map.put( "GEOKA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "LISMO", "bacteria" );
        _default_taxcode_taxgroup_map.put( "STAAU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CLOP1", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CARHZ", "bacteria" );
        _default_taxcode_taxgroup_map.put( "THETN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "DESHA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "EUBR3", "bacteria" );
        _default_taxcode_taxgroup_map.put( "FERNB", "bacteria" );
        _default_taxcode_taxgroup_map.put( "THELT", "bacteria" );
        _default_taxcode_taxgroup_map.put( "THEMA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "MYCGE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "MYCPN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "MESFL", "bacteria" );
        _default_taxcode_taxgroup_map.put( "UREPA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BORBU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "TREPA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLPN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLFF", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CHLMU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RICTY", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BARHE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "PELUB", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RICB8", "bacteria" );
        _default_taxcode_taxgroup_map.put( "RICRO", "bacteria" );
        _default_taxcode_taxgroup_map.put( "FRATU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "STRPN", "bacteria" );
        _default_taxcode_taxgroup_map.put( "STRPY", "bacteria" );
        _default_taxcode_taxgroup_map.put( "LACLA", "bacteria" );
        _default_taxcode_taxgroup_map.put( "LACAC", "bacteria" );
        _default_taxcode_taxgroup_map.put( "BIFLO", "bacteria" );
        _default_taxcode_taxgroup_map.put( "FUSNU", "bacteria" );
        _default_taxcode_taxgroup_map.put( "DEHE1", "bacteria" );
        _default_taxcode_taxgroup_map.put( "DEHSB", "bacteria" );
        _default_taxcode_taxgroup_map.put( "NITSB", "bacteria" );
        _default_taxcode_taxgroup_map.put( "SULNB", "bacteria" );
        _default_taxcode_taxgroup_map.put( "CAMJE", "bacteria" );
        _default_taxcode_taxgroup_map.put( "HELPH", "bacteria" );
        _default_taxcode_taxgroup_map.put( "AQUAE", "bacteria" );
    }
    private final static Map<String, Integer> FAKE_CODE_TO_ID_MAP           = new HashMap<String, Integer>();
    static {
        FAKE_CODE_TO_ID_MAP.put( "CTEXX", 283909 );
        FAKE_CODE_TO_ID_MAP.put( "HMAXX", 6085 );
        FAKE_CODE_TO_ID_MAP.put( "SARXX", 72019 );
        FAKE_CODE_TO_ID_MAP.put( "AALXX", 398408 );
        FAKE_CODE_TO_ID_MAP.put( "PFIXX", 83344 );
        FAKE_CODE_TO_ID_MAP.put( "MPSXX", 692275 );
        FAKE_CODE_TO_ID_MAP.put( "BCOXX", 430998 );
        FAKE_CODE_TO_ID_MAP.put( "APPXX", 178873 );
        FAKE_CODE_TO_ID_MAP.put( "APMXX", 46634 );
        FAKE_CODE_TO_ID_MAP.put( "APSXX", 1042127 );
        FAKE_CODE_TO_ID_MAP.put( "CPUXX", 80637 );
        FAKE_CODE_TO_ID_MAP.put( "JARXX", 202697 );
        FAKE_CODE_TO_ID_MAP.put( "FPIXX", 40483 );
        FAKE_CODE_TO_ID_MAP.put( "PPLXX", 104341 );
        FAKE_CODE_TO_ID_MAP.put( "MVNXX", 1069443 );
        FAKE_CODE_TO_ID_MAP.put( "CREXX", 61392 );
        FAKE_CODE_TO_ID_MAP.put( "FALXX", 691883 );
        FAKE_CODE_TO_ID_MAP.put( "CCLXX", 85681 );
        FAKE_CODE_TO_ID_MAP.put( "ORCXX", 385169 );
        FAKE_CODE_TO_ID_MAP.put( "ASCXX", 763042 );
        FAKE_CODE_TO_ID_MAP.put( "CSUXX", 574566 );
        FAKE_CODE_TO_ID_MAP.put( "OTRXX", 1172189 );
        FAKE_CODE_TO_ID_MAP.put( "FCYXX", 186039 );
        FAKE_CODE_TO_ID_MAP.put( "AKEXX", 702273 );
        FAKE_CODE_TO_ID_MAP.put( "SAGXX", 876976 );
        FAKE_CODE_TO_ID_MAP.put( "ALIXX", 87102 );
        FAKE_CODE_TO_ID_MAP.put( "TTRXX", 529818 );
    }
}
