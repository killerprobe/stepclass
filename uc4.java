public class uc4 {

    public static void main(String[] args) {

        // 1. Create a String array to store all lines of the banner
        String[] bannerLines = {
            String.join(" ","   ****    ","   ****    ","**********  ","**********"),
            String.join(" "," **     ** "," **     ** ","*********** ","**********"),
            String.join(" ","**       **","**       **","**        **","**        "),
            String.join(" ","**       **","**       **","**        **","**        "),
            String.join(" ","**       **","**       **","**       ** ","**********"),
            String.join(" ","**       **","**       **","**********  ","**********"),
            String.join(" ","**       **","**       **","***         ","        **"),
            String.join(" "," **     ** "," **     ** ","***         ","        **"),
            String.join(" ","   ****    ","   ****    ","***         ","**********"),
        };

        // 2. Use a for-each loop to print each element sequentially
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}