import java.util.Date;
public class DateTestMain {
    long totalMilliseconds = System.currentTimeMillis();
    void printUTC() {
	long nowYears = totalMilliseconds/(1000L*60*60*24*365);
	long nowDays = totalMilliseconds/(1000L*60*60*24)%365;
	long nowHours = totalMilliseconds/(1000L*60*60)%24;
	long nowMinutes = totalMilliseconds/(1000L*60)%60;
	long nowSeconds = totalMilliseconds/(1000L)%60;
        System.out.printf("Current time is Y%d %d %d:%d:%d GMT\n", nowYears,nowDays,nowHours,nowMinutes,nowSeconds);
    }
    void printLocalTime() {
        System.out.println("Current Time: " + new Date(totalMilliseconds));
    }
    void printDue() {
	System.out.println("Due: "+new Date(Integer.MAX_VALUE*1000L));
    }
    public static void main(String[] args) {
	DateTestMain d=new DateTestMain();
        d.printUTC();
        d.printLocalTime();
	d.printDue();
    }
}
