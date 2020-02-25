import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class CountWords {
  private Map<String, Integer> wc = new HashMap<String, Integer>();
  private ArrayList<Integer> numList = new ArrayList<Integer>();
  private ArrayList<String> charupperList = new ArrayList<String>();
  private ArrayList<String> charlowerList = new ArrayList<String>();
  Map getFrequences(String s) {
    String keyName = null;
    char[] letters = s.toCharArray();
    for(char c : letters) {
      int ascii = (int)c;
      if(ascii>=48 && ascii<=57) {
        keyName = "DIGITS";
        numList.add(Character.getNumericValue(c));
      }
      else if(ascii>=65 && ascii<=90) {
        keyName = "UPPERS";
        charupperList.add(Character.toString(c));
      }
      else if(ascii>=97 && ascii<=122) {
        keyName = "LOWERS";
        charlowerList.add(Character.toString(c));
      }
      if (wc.containsKey(keyName)) {
        wc.put(keyName,wc.get(keyName)+1);
      }
      else {
        wc.put(keyName,1);
      }
    }
    return wc;
  }
  public static void main(String[] args) {
    CountWords cw=new CountWords();
    String s = "7HongiDong";
    System.out.println(cw.getFrequences(s));
    System.out.printf("Number: %d\n", cw.numList.size());
    System.out.printf("Capital: %d\n", cw.charupperList.size());
    System.out.printf("Lower case: %d\n", cw.charlowerList.size());
  }
}
