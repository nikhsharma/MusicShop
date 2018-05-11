package items;

public abstract class Item {
    
    Double buyPrice;
    Double sellPrice;
    String description;

    public Item(Double buyPrice, Double sellPrice, String description) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }
}

