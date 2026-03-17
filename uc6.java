public class uc6 {

    // Method to create the pattern for letter O
    public static String[] getOPattern() {
        return new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
    }

    // Method to create the pattern for letter P
    public static String[] getPPattern() {
        return new String[] {
            " *****   ",
            " **  **  ",
            " **  **  ",
            " *****   ",
            " **      ",
            " **      ",
            " **      ",
            " **      "
        };
    }

    // Method to create the pattern for letter S
    public static String[] getSPattern() {
        return new String[] {
            " ******  ",
            " **      ",
            " **      ",
            " *****   ",
            "     **  ",
            "     **  ",
            "     **  ",
            " ******  "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Store patterns in String arrays
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}
