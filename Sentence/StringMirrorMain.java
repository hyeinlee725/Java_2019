public class StringMirrorMain {
  static String mirror(String s) {
    char[] chArr=s.toCharArray();
    StringBuilder olleh=new StringBuilder();
    for(int i=chArr.length-1;i>=0;i--) {
      olleh.append(chArr[i]);
    }
    return olleh.toString();
  }
  public static void main(String[] args) {
    System.out.println(mirror("Sangmyung"));
  }
}
