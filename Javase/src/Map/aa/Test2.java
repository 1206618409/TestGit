package Map.aa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        /**2、假如有以下email数据
         “aa@sohu.com,bb@163.com,cc@sina.com,..”现需要把
         email中的用户部分和邮件地址部分分离，分离后以键值对应的
         方式放入HashMap？*/
        String s = "aa@sohu.com,bb@163.com,cc@sina.com";
        String[] str = s.split(",");
       /* for (String s1:str){
            System.out.print(s1);
        }*/
        Map<String,String> map = new HashMap<>();
        for (int i = 0;i<str.length;i++){
            String email = str[i];
            String username = email.substring(0,email.indexOf('@'));
            String ek = email.substring(3);
            map.put(username,ek);
        }
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key+"-->"+value);
        }

    }
}
