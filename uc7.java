
public class uc7 {
    
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;
        
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        
        public char getCharacter() {
            return character;
        }
        
        public String[] getPattern() {
            return pattern;
        }
    }
    public static void main(String[] args) {
        
        CharacterPatternMap letterO = new CharacterPatternMap('O', new String[] {
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
        CharacterPatternMap letterP = new CharacterPatternMap('P', new String[] {
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
        CharacterPatternMap letterS = new CharacterPatternMap('S', new String[] {
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
        
        CharacterPatternMap[] wordToPrint = {letterO, letterO, letterP, letterS};
        
        for (int i = 0; i < 9; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            for (CharacterPatternMap letter : wordToPrint) {
                lineBuilder.append(letter.getPattern()[i]);
            }
            
            System.out.println(lineBuilder.toString());
        }
    }
}