import java.text.DateFormat;
import java.util.Date;

public class DateandTime
{
  long totalMilliseconds = System.currentTimeMillis();
  public void printUTC(){
    long Years = totalMilliseconds/(1000L*60*60*24*365);
  	long Days = totalMilliseconds/(1000L*60*60*24)%365;
  	long Hours = totalMilliseconds/(1000L*60*60)%24;
  	long Minutes = totalMilliseconds/(1000L*60)%60;
  	long Seconds = totalMilliseconds/(1000L)%60;
      System.out.printf("Current_Year: %d\n Days: %d\n Hours: %d\n Minutes: %d\n Seconds: %d\n",
    Years, Days, Hours, Minutes, Seconds);
  }
  void printLocalTime() {
    System.out.println("Current Time: "+ new Date(totalMilliseconds));
  }
  void printDue() {
    System.out.println("Due: "+new Date(Integer.MAX_VALUE*1000L));
  }
  public static void main(String args[]){
    DateandTime d=new DateandTime();
    d.printUTC();
    d.printLocalTime();
    d.printDue();
  }
}
