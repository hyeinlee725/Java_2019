public class Rectangle {
  int width;
  int height;
  public void setComputeArea(int width, int height){
    this.width=width;
    this.height=height;
  }
    public int getComputeArea(){
      return width*height;
    }
    public static void main(String[] args) {
      Rectangle r=new Rectangle(3,4);
      System.out.println("Rectangle: "+r.getComputeArea);
     }
  }
