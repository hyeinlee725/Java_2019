import java.util.Scanner;
public class StringRepeat1 {
  public static StringBuffer repeat(char ch, int times){
    StringBuffer s=new StringBuffer();
    for(int i = 0; i < times; i++)
    s.append(ch);
    return s;
  }
  public static void main(String[] args){
    System.out.print("Enter a number to repeat: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    StringBuffer s=repeat('*', n);
    System.out.printf("%s\n",s);
  }
}
