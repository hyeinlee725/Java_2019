public class Dice{
  private int number = 0;
  public void roll()
  {
    this.number = (int)(Math.random()*6 +1);
  }
  public int getNumber()
  {
    return number;
  }
  public static void main(String[] args)
  {
    Dice a=new Dice();
    Dice b=new Dice();
    a.roll();
    b.roll();
    System.out.println("A: "+a.getNumber());
    System.out.println("B: "+b.getNumber());
  }
}
