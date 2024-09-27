package Date.com;

public enum EnumDemo {

    LAUNCH("launch"),PAGEVIEW("pageview"),EVENT("event");
    EnumDemo(String name){
        this.name = name;
    }
    private String name;
    public void show(){
        System.out.println(this.name);
        EnumDemo[] ee = values();
        for (int i = 0; i <ee.length ; i++) {
            System.out.println(ee[i]);
        }
    }

}
