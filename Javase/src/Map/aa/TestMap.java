package Map.aa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        /**1、使用List,map容器存放如下数据，并从map中取出“李四”
         姓名：张三 年龄：18 体重：90 地址：北京
         姓名：李四 年龄：28 体重：50 地址：上海
         */
        Map<String,String> map = new HashMap<>();
        map.put("姓名", "张三");
        map.put("年龄", "18");
        map.put("体重", "90");
        map.put("地址", "北京");
        Map<String,String> map2 = new HashMap<>();
        map2.put("姓名", "李四");
        map2.put("年龄", "28");
        map2.put("体重", "50");
        map2.put("地址", "上海");
        List<Map<String,String>> list = new ArrayList<>();
        list.add(map);
        list.add(map2);
        for (Map<String, String> m:list){
            if ("李四".equals(m.get("姓名"))){
                System.out.println(m.get("姓名"));
            }
        }
    }
}
