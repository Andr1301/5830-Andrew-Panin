import Classes.ActionClient;
import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

// 1) Добавить класс, описывающий акционного клиента. Включить поле название акции, id клиента и количество участников в акции(поле статическое)
// 2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.
// 3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.

// (задача со *)
// 1) Реализовать отказ в обслуживании для акционного клиента при превышении участников акции
// 2) Сохранить в файл лог работы магазина, включая возвраты товара(реализовать возврат нескольких товаров)

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new OrdinaryClient("masha");
        iActorBehaviour client3 = new SpecialClient("prezident", 1);
        iActorBehaviour client4 = new TaxInspector();
        iActorBehaviour client5 = new OrdinaryClient("VICTOR", true); //ВОЗВРАТ
        iActorBehaviour client6 = new TaxInspector(true); //ВОЗВРАТ
        iActorBehaviour client7 = new ActionClient("sasha", "2+1", 1234);


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);


        magnit.update();
    }
}
