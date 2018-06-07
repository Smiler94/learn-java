import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String args[]) {
        DateDemo dateDemo = new DateDemo();

        dateDemo.getDate();
        dateDemo.getTime();
        dateDemo.formatDate();
        dateDemo.parseDate();
        dateDemo.diffTime();
        dateDemo.Calendar();
    }

    private void getDate() {
        Date date = new Date();

        System.out.println(date.toString());
    }

    private void getTime() {
        Date date = new Date();

        System.out.println(date.getTime());
    }

    private void formatDate() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("Current Date is :" + ft.format(date));
    }

    private void parseDate() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        String date = "2018-06-07";

        Date t;

        try {
            t = ft.parse(date);
            System.out.println("parse result :" + t);
        } catch (ParseException e) {
            System.out.println("unparseable");
        }
    }

    private void diffTime() {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(5*6*10);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Diff is : "+diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    private void Calendar() {
        Calendar c1 = Calendar.getInstance();

        c1.set(2018, 1, 25);

        System.out.println("Year : " + c1.get(Calendar.YEAR));
        System.out.println("Month : " + c1.get(Calendar.MONTH));
        System.out.println("DATE : " + c1.get(Calendar.DATE));

        c1.add(Calendar.DATE, 10);
        System.out.println("10 days later Month : " + c1.get(Calendar.MONTH));
        System.out.println("10 days later DATE : " + c1.get(Calendar.DATE));
    }

    //TODO GregorianCalendar
}
