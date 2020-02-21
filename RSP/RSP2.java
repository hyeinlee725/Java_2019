import java.util.Scanner;
public class RSP2 {
  static String res=null;
  static enum whatisRSP {가위, 바위, 보}
  public static String playRSP(String a, String b) {
    if(a.equals("가위")&&b.equals("보")||a.equals("바위")&&b.equals("가위")||a.equals("보")&&b.equals("바위")) {
      res="A가 이겼습니다.\n";
    }
    else if(a.equals("가위")&&b.equals("바위")||a.equals("바위")&&b.equals("보")||a.equals("보")&&b.equals("가위")) {
      res="B가 이겼습니다.\n";
    }
    else if(a.equals(b)){
      res="비겼습니다.\n";
    }
    else
      res="잘못 입력했습니다.\n";
    return res;
  }
  public static void main(String[] args) {
    RSP2 rsp=new RSP2();
    Scanner sc=new Scanner(System.in);
    System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
    whatisRSP a=whatisRSP.valueOf(rsp.playRSP(s1));
    System.out.print("A: ");
    String s1=sc.next();
    System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
    whatisRSP a=whatisRSP.valueOf(rsp.playRSP(s2));
    System.out.print("B: ");
    String s2=sc.next();
    System.out.printf("%s", playRSP(s1, s2));
  }
}
