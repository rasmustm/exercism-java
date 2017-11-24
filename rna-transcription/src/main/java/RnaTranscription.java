import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class RnaTranscription
{

  private static String dnaBaseToRnaBase(char c)
  {
    Map<Character,String> transcription =
      new HashMap<Character,String>(){{
      put('G', "C");
      put('C', "G");
      put('T', "A");
      put('A', "U");
    }};

    return transcription.get(c);
  }

  public static String transcribe(String dnaStrand)
  {
    return dnaStrand.chars()
                    .mapToObj(c -> dnaBaseToRnaBase((char) c))
                    .collect(Collectors.joining());
  }

}
