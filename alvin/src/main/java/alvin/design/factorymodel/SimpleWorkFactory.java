package alvin.design.factorymodel;

public class SimpleWorkFactory {
    public static Work getWork(String name){
        Work work;
        if ("stu".equals(name)){
            work = new StuWork();
        }else {
            work = new TeaWork();
        }
        return work;
    }
}
