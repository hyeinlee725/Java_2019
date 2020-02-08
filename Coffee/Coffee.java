public class Coffee{
  String origin;
  String roast;
  int grade;
  void roast(){
    System.out.println("roasting coffee from"+origin);
  }
  void grind(){
    System.out.println("grinding coffee from"+origin);
  }
  void brew(){
    System.out.println("brewing coffee from"+origin);
  }
  public static void main(String[] args) {
      Coffee Mandheling = new Coffee();
      Mandheling.origin = "South_EastAsia";
      Mandheling.roast = "Light";
      Mandheling.grade = 1;
      Mandheling.roast();
      System.out.println(Mandheling.origin +" " + Mandheling.roast+" " + Mandheling.grade+" ");
  }
}
