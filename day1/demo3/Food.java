package jmu.day1.demo3;

public class Food {
    private int fId;
    private String fName;
    private int price;

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(int fId, String fName, int price) {
        this.fId = fId;
        this.fName = fName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "fId=" + fId +
                ", fName='" + fName + '\'' +
                ", price=" + price +
                '}';
    }
}
