package items;

public abstract class Item {

    Double buyPrice;
    Double sellPrice;

    public Item(Double buyPrice, Double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }
}
