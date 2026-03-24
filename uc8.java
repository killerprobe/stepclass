import java.util.HashMap;
import java.util.Map;

public class uc8 {
    
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {
        
        for (int i = 0; i < 9; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            for (char ch : word.toCharArray()) {
                
                String[] pattern = patternMap.get(ch);
                
                lineBuilder.append(pattern[i]);
            }
            
            System.out.println(lineBuilder.toString());
        }
    }
    public static void main(String[] args) {
        
        Map<Character, String[]> patternMap = new HashMap<>();
        
        patternMap.put('O', new String[] {
            "    ***    ",
            "  **   **  ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "  **   **  ",
            "    ***    "
        });
        patternMap.put('P', new String[] {
            " *******    ",
            " **     **  ",
            " **      ** ",
            " **     **  ",
            " *******    ",
            " **         ",
            " **         ",
            " **         ",
            " **         "
        });
        patternMap.put('S', new String[] {
            "    ***** ",
            "  **      ",
            "**        ",
            " **       ",
            "   ***    ",
            "      **  ",
            "       ** ",
            "     **   ",
            "*****     "
        });
        
        renderBanner("OOPS", patternMap);
    }
}