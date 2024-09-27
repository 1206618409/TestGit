package Date.com;

public class Test {
    public static void main(String[] args) {
        EnumDemo ee = EnumDemo.LAUNCH;
        ee.show();
        String name = EnumDemo.PAGEVIEW.name();
        System.out.println(name);
    }

}
