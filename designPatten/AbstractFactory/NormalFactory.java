package jmu.designPatten.AbstractFactory;

public class NormalFactory implements AbstractFactory{
    @Override
    public AbstractBlock getEmpty() {
        return new NormalEmpty();
    }

    @Override
    public AbstractBlock getPrison() {
        return new NormalPrison();
    }

    @Override
    public AbstractBlock getPark() {
        return new NormalPark();
    }
}
