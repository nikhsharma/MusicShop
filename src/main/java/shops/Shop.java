package shops;

import items.ISell;
import items.accessories.DrumSticks;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addStock(ISell product) {
        stock.add(product);
    }


    public void removeStock(DrumSticks product) {
        stock.remove(product);
    }
}
