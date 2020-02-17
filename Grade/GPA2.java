import java.util.Scanner;

public class GPA2{
  private String subject;
  private  int credits;
  private  String grade;
  private  double sum;
  private  int tmp;
  public void inputGPA2(String subject, int credits, String grade){
    for(int i=0; i<3; i++){
      Scanner s = new Scanner(System.in);
      System.out.printf("[%d] Enter your subject, credits, grade: ", i+1);
      subject = s.next();
      credits = s.nextInt();
      grade = s.next();
      System.out.printf("[%d] %3s, %2d, %2s\n", i+1, subject, credits, grade);
      setGPA2(credits, grade, sum, tmp);
  }
  getGPA2(sum, tmp);
}
public void initData(double sum, int tmp){
  sum = 0;
  tmp = 0;
}
  public void setGPA2(int credits, String grade, double sum, int tmp){

  if(grade.equals("A"))
    this.sum = this.sum+4.0*credits;
  else if(grade.equals("B"))
    this.sum = this.sum+3.0*credits;
  else if(grade.equals("C"))
    this.sum = this.sum+2.0*credits;
    this.tmp = this.tmp +credits;
}
  public void getGPA2(double sum, int tmp){
    System.out.printf("My GPA2: %f\n",(sum/tmp));
  }

  public static void main(String [] args){
  GPA2 g = new GPA2();
  g.initData(g.sum, g.tmp);
  g.inputGPA2(g.subject, g.credits, g.grade);
}
}
