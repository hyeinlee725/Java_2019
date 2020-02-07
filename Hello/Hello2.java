public class Hello2{
  private String toWhom="world";
  void setWhom(String whom){
    toWhom=whom;
  }
  void sayHello(){
    System.out.println("helllo"+toWhom);
  }
  public static void main(String[] args){
    Hello2 h=new Hello2();
    h.setWhom("LHI");
    h.sayHello();
  }
}
