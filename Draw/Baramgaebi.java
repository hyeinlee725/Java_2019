import ch.aplu.turtle.*;
public class Baramgaebi {
  static Turtle t1=new Turtle();
  static void makeSwirlSquare(int size, int bigger, int turns, double degree) {
    int nBigger=2;
    for(int i=0; i<turns; i++) {
      if(i%nBigger!=0) {
        size+=bigger;
      }
      t1.forward(size);
      t1.right(degree);
    }
  }
  public static void main(String[] args) {
    makeSwirlSquare(30,10,30,90.0);
  }
}
