package alvin.design.factorymodel;

public class StuFactory implements MethodWorkFactory {
    @Override
    public Work getWork() {
        return new StuWork();
    }

    @Override
    public Work2 getwork2() {
        return new StuWork2();
    }
}
