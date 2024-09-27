package itcast.domain;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i <100000 ; i++) {
            a = a++;
        }
        int o = 0;
        o--;
//        System.out.println(a);
//        System.out.println(o);
//        System.out.println(3&5);
//        System.out.println(3|5);
//        System.out.println(3^5);
//        System.out.println(~5);
        //System.out.println(1^1^2);

        /*for ( int i = 100;  i<=200;++i) {
            if (i%3==1 && i%4==2 && i%5==2)
            System.out.println(i);

        }*/
        for (int i = 2; i <=100 ; i++) {
            boolean b = false;
            for (int j = 2; j <i/2 ; j++) {
                if (i%j==0){
                    System.out.println(i+"不是素数");
                    b = true;
                    break;
                }
            }
            if (b == false){
                System.out.println(i+"是素数");
            }
        }

    }
}
