package shops;

import items.ISell;
import items.accessories.DrumSticks;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private ArrayList<ISell> sold;

    public Shop(String name) {
        this.name = name;
        stock = new ArrayList<>();
        sold = new ArrayList<>();
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

    public Double calculateTotalPotentialProfit() {
        Double potentialProfit = 0.0;
        for (ISell product : stock) {
            potentialProfit += product.calculateMarkup();
        }
        return potentialProfit;
    }

    public Double calculateTotalProfit() {
        Double profit = 0.0;
        for (ISell product : sold) {
            profit += product.calculateMarkup();
        }
        return profit;
    }

    public int soldCount() {
        return sold.size();
    }

    public void sellProduct(ISell product) {
        stock.remove(product);
        sold.add(product);
    }
}
