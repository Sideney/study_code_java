package jmu.designPatten.AbstractFactory;

public class MagicFactory implements AbstractFactory{
    @Override
    public AbstractBlock getEmpty() {
        return new MagicEmpty();
    }

    @Override
    public AbstractBlock getPrison() {
        return new MagicPrison();
    }

    @Override
    public AbstractBlock getPark() {
        return new MagicPark();
    }
}
