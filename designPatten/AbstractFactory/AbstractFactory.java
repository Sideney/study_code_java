package jmu.designPatten.AbstractFactory;

public interface AbstractFactory {
    AbstractBlock getEmpty();
    AbstractBlock getPrison();
    AbstractBlock getPark();
}
