public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        String[] banner = {

            String.join("   ",
                "  *** ",
                "   *** ",
                " **",
                "       *** "
            ),

            String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"
            ),

            String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*      "
            ),

            String.join("   ",
                "*     *",
                "*     *",
                "** ",
                "      *** "
            ),

            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "      *"
            ),

            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "*     *"
            ),

            String.join("   ",
                "  *** ",
                "   *** ",
                "*      ",
                "   *** "
            )
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}