import java.util.Scanner;
public class RSP2 {
  static String res=null;
  static enum whatisRSP {����, ����, ��}
  public static String playRSP(String a, String b) {
    if(a.equals("����")&&b.equals("��")||a.equals("����")&&b.equals("����")||a.equals("��")&&b.equals("����")) {
      res="A�� �̰���ϴ�.\n";
    }
    else if(a.equals("����")&&b.equals("����")||a.equals("����")&&b.equals("��")||a.equals("��")&&b.equals("����")) {
      res="B�� �̰���ϴ�.\n";
    }
    else if(a.equals(b)){
      res="�����ϴ�.\n";
    }
    else
      res="�߸� �Է��߽��ϴ�.\n";
    return res;
  }
  public static void main(String[] args) {
    RSP2 rsp=new RSP2();
    Scanner sc=new Scanner(System.in);
    System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
    whatisRSP a=whatisRSP.valueOf(rsp.playRSP(s1));
    System.out.print("A: ");
    String s1=sc.next();
    System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.");
    whatisRSP a=whatisRSP.valueOf(rsp.playRSP(s2));
    System.out.print("B: ");
    String s2=sc.next();
    System.out.printf("%s", playRSP(s1, s2));
  }
}
