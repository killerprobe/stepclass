/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This program displays the word "OOPS" as a banner using
 * inline array initialization and String.join() method.
 *
 * @author Developer
 * @version 5.0
 */

public class uc5 {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for letters O, O, P, S
        String[] lines = {

            String.join("   ",
                    " *** ",
                    " *** ",
                    " ***** ",
                    " ***** "
            ),

            String.join("   ",
                    "*   *",
                    "*   *",
                    "*     ",
                    "*     "
            ),

            String.join("   ",
                    "*   *",
                    "*   *",
                    "***** ",
                    "***** "
            ),

            String.join("   ",
                    "*   *",
                    "*   *",
                    "*     ",
                    "    * "
            ),

            String.join("   ",
                    "*   *",
                    "*   *",
                    "*     ",
                    "    * "
            ),

            String.join("   ",
                    " *** ",
                    " *** ",
                    "*     ",
                    "***** "
            )
        };

        // Use a loop to print each line of the banner
        // to create the visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
}