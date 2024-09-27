package Date.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestCalender {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字代表年份");
        int y = s.nextInt();
        System.out.println("请输入一个数字代表月份");
        int m= s.nextInt();
        System.out.println("请输入一个数字代表某天");
        int d = s.nextInt();
        String str = y+"-"+m+"-"+d;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MARCH)+1);
        //System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)-1);
        //System.out.println("今天是:"+Calendar.YEAR+"年"+Calendar.MARCH)+1+"月"+Calendar.DAY_OF_MONTH+"日");

    }
}
