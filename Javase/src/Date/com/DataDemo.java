package Date.com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        //System.out.println(date.getYear());
        //System.out.println(date.getTime());

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将Date类按照规范转换为字符串格式
        String str = dateFormat.format(date);
        System.out.println(str);
        //将字符串转换为对应的日期
        Date date2 = dateFormat.parse(str);
        System.out.println(date2);
        System.out.println("-------------------------------------");

        //获取的是当前系统的时间
        Calendar calendar =  Calendar.getInstance();
        System.out.println(calendar);
        //获取指定时间的日历类
        calendar.setTime(date2);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MARCH)+1);
        //System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

    }
}
