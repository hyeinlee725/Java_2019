import java.util.Scanner;

public class Study2 {
  static public String[] subject=new String[3];
  static public int[] credits=new int[3];
  static public String[] grade=new String[3];
  static public Double[] gradeDouble=new Double[3];

  public static void inputGrade() {
    Scanner sc=new Scanner(System.in);
    for(int i = 0; i < 3; i++) {
      System.out.printf("Input Subject[%d] : ", i+1);
      String s = sc.next();
      subject[i] = s;
      System.out.printf("Input credits[%d] : ", i+1);
      int c = sc.nextInt();
      credits[i] = c;
      System.out.printf("Input grade[%d] : ", i+1);
      String g = sc.next();
      grade[i] = g;
    }
  }

  public void gradeToDouble() {
    inputGrade();
    for(int i = 0; i < 3; i++) {
      if(grade[i].equals("A")) {
        gradeDouble[i] = 4.0;
      }
      else if(grade[i].equals("B")) {
        gradeDouble[i] = 3.0;
      }
      else if(grade[i].equals("C")) {
        gradeDouble[i] = 2.0;
      }
    }
  }

  public static void main(String[] args){
    Study2 st = new Study2();
    st.gradeToDouble();
    float return_GPAplus=0;
    for(int i = 0;i < 3; i++)
    {
        return_GPAplus += (double)credits[i] * gradeDouble[i];
    }
    System.out.printf("your GPA is: %f", return_GPAplus/(credits[0]+credits[1]+credits[2]));
  }
}
