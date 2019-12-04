package alvin.design.single;

public class Yobject{
    private static Yobject yobject = new Yobject();
    //私有构造方法，这样类就不会被实例化
    private Yobject(){

    }
    //获取可用的唯一对象
    public static Yobject getInstance(){
        return yobject;
    }
    public void showMessage(){
        System.out.println("Yobj单例了..............");
    }
}
