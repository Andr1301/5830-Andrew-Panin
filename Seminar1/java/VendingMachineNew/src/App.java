import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Service.CoinDispencer;
import Service.Display;
import Service.Holder;
import Service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

// Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
// Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
// В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello");
        Product item1 = new Product(100.0, 1, "lays");
        Product item2 = new Product(80.0, 2, "nuts");
        Product item3 = new Product(40.0, 3, "mars");
        Product item4 = new Bottle(14.5, 4, "Cola", 0.5f);
        Product item5 = new Bottle(20.5, 5, "Mineral", 0.5f);
        Product item6 = new HotDrink(50.0, 6, "Tea", 60);
        Product item7 = new HotDrink(70.0, 7, "Coffee", 65);

        List<Product> products = new ArrayList<>();
        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
        products.add(item5);
        products.add(item6);
        products.add(item7);

        Holder hold = new Holder();
        CoinDispencer coin = new CoinDispencer();
        Display display = new Display();
        VendingMachine vendingMachine = new VendingMachine(hold, coin, display, products);

        for (Product prod : vendingMachine.getListProduct()){
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }


}
