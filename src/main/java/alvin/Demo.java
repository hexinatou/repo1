package alvin;


import alvin.design.proxy.CinemaStatic;
import alvin.design.proxy.RealMovie;

public class Demo {
    public static void main(String[] args) {
        try {
    //            SimpleWorkFactory.getWork("stu").dowork();
////            ArrayList
//            StuFactory stuFactory = new StuFactory();
//            stuFactory.getWork().dowork1();
            CinemaStatic cinemaStatic = new CinemaStatic(new RealMovie());
            cinemaStatic.play();
            System.out.println("hhhh");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
