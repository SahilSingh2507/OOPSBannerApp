
    
    import java.util.HashMap;

public class OOPSBannerAppUC8 {

    // Create HashMap for character patterns
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " * ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " * "
        });

        charMap.put('P', new String[]{
                "** ",
                "*   *",
                "*   *",
                "** ",
                "*    ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[]{
                " **",
                "*    ",
                "*    ",
                " * ",
                "    *",
                "    *",
                "** "
        });

        charMap.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return charMap;
    }

    // Display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int height = charMap.get('O').length;

        for (int i = 0; i < height; i++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[i]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}

