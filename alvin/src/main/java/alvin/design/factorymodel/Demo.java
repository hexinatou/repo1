package alvin.design.factorymodel;


public class Demo {
    public static void main(String[] args) {
        try {
            //简单工厂
    //            SimpleWorkFactory.getWork("stu").dowork();
////            ArrayList
            //工厂方法
//            StuFactory stuFactory = new StuFactory();
//            stuFactory.getWork().dowork1();
//            stuFactory.getwork2().dowork2();
            StuWork stuWork = (StuWork) Class.forName("alvin.design.factorymodel.StuWork").newInstance();
            stuWork.dowork1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
