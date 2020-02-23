public class MultiplicationTableMain {
  public static void main(String[] args) {
    MultiplicationTable mt=new MultiplicationTable();
    mt.doMultiplication();
  }
}
class MultiplicationTable {
  int[] dan = {1,2,3,4,5,6,7,8,9};
  public void doMultiplication() {
    for(int i=0;i<dan.length;i++) {
      System.out.printf("\n%dDan: ", dan[i]);
      for(int j=0;j<dan.length;j++) {
        System.out.printf("%2d *%2d=%2d ", dan[i], dan[j], dan[i]*dan[j]);
      }
    }
  }
}
