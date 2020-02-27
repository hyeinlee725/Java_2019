import java.util.Scanner;

public class Study1 {
  private String name;
  private int age;
  public float GPA;

  public void setname(String name) {
    this.name = name;
  }
  public String getname() {
    return name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
  public float inputGPA(){
    System.out.print("Input GPA: ");
    Scanner sc = new Scanner(System.in);
    GPA = sc.nextFloat();
    return GPA;
  }
  public void lineup(String name, int age, float GPA){
    System.out.printf("Name: %5s\n Age: %5d\n GPA: %5.3f\n",name,age,GPA);
  }
  public static void main(String[] args) {
    Study1 s = new Study1();
    s.setname("Hyein");
    s.setAge((int)21);
    System.out.println("Name : " + s.getname());
    System.out.println("Age : " + s.getAge());
    s.lineup(s.getname(),s.getAge(),s.inputGPA());
  }
}
