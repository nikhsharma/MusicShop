package shops;

import items.ISell;
import items.Item;
import items.accessories.DrumSticks;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private ArrayList<ISell> sold;
    private Double money;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.sold = new ArrayList<>();
        this.money = 0.0;
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

    public Double getMoney() {
        return money;
    }

    public void addToMoney(Double amount) {
        this.money += amount;
    }

    public Double withdrawMoney(Double amount) {
        if (money > amount) {
            this.money -= amount;
            return amount;
        }
        return null;
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

    public Double calculateIncome() {
        Double income = 0.0;
        for (ISell product : sold) {
             income += ((Item) product).getSellPrice();
        }
        return income;
    }

    public int soldCount() {
        return sold.size();
    }

    public void sellProduct(ISell product) {
        if (stock.contains(product)) {
            stock.remove(product);
            sold.add(product);
        }
    }

    public Double endOfDay() {
        Double income = calculateIncome();
        addToMoney(income);
        this.sold.clear();
        return income;
    }
}
