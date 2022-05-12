package c13.bean;

public class Count {
    private int count = 0;
    public Count(){
        System.out.println("创建了一个新的 Count 对象");
    }

    public int getCount() {
        return ++count;
    }
}
