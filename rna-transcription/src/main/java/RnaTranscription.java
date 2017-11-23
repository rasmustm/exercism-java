import java.util.*;

public class RnaTranscription
{

  public static String transcribe(String dnaStrand)
  {
    String rnaStrand = "";

    Map<Character,Character> transcription =
      new HashMap<Character,Character>(){{
      put('G', 'C');
      put('C', 'G');
      put('T', 'A');
      put('A', 'U');
    }};

    for (char c : dnaStrand.toCharArray())
      rnaStrand = rnaStrand + transcription.get(c);

    return rnaStrand;
  }

}
