import java.util.*;

public class PangramChecker {

    public boolean isPangram(String input) {
      Set<Character> letters = new HashSet<Character>();
      
      for (char c : input.toCharArray())
        if (Character.isLetter(Character.toLowerCase(c)))
          letters.add(c);

      return (letters.size() >= 26);
    }

}
