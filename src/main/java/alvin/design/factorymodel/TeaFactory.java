package alvin.design.factorymodel;

public class TeaFactory implements MethodWorkFactory {
    @Override
    public Work getWork() {
        return new TeaWork();
    }

    @Override
    public Work2 getwork2() {
        return new StuWork2();
    }
}
