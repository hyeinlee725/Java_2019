import java.util.Scanner;
public class CalculatorMain{
  public static void main(String[] args){
    double res = 0.0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    double n1=sc.nextDouble();
    System.out.print("Enter a operator: ");
    String op=sc.next();
    System.out.print("Enter another number: ");
    double n2=sc.nextDouble();
    System.out.printf("%.2f %s %.2f", n1, op, n2);
    if(op.equals("+"))
      res = n1+n2;
    else if(op.equals("-"))
      res = n1-n2;
    else if(op.equals("*"))
      res = n1*n2;
    else if(op.equals("/"))
      res = n1/n2;
    else
      System.out.println("Operation not supported");
    System.out.printf(" = %.2f", res);
  }
}
