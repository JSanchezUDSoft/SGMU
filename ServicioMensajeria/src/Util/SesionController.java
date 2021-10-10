
package Util;

public class SesionController {
    private static String k_tipdoc;
    private static String k_numdoc;

    public SesionController() {
    }

    public static String getK_tipdoc() {
        return k_tipdoc;
    }

    public static void setK_tipdoc(String k_tipdoc) {
        SesionController.k_tipdoc = k_tipdoc;
    }

    public static String getK_numdoc() {
        return k_numdoc;
    }

    public static void setK_numdoc(String k_numdoc) {
        SesionController.k_numdoc = k_numdoc;
    }
    
    
}
