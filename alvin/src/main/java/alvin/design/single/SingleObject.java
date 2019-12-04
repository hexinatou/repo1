package alvin.design.single;

public class SingleObject {
    //创建单例对象
    private static SingleObject singleObject = new SingleObject();
    //私有构造方法，这样类就不会被实例化
    private SingleObject(){

    }
    //获取可用的唯一对象
    public static SingleObject getInstance(){
        return singleObject;
    }
    public void showMessage(){
        System.out.println("单例了..............");
    }
}
