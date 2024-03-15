package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarcketBehaviour,iQueueBehaviour,iReturnOrder {

    private List<iActorBehaviour> queue;
    private List<iActorBehaviour> returnQueue;

    /**Конструктор класса маркет, создает 2 очереди: обычную и на возврат товаров
     * 
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
        this.returnQueue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.geActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        if(!actor.getReturnOrder()){
            this.queue.add(actor);
            System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
        }
        else{
            this.returnQueue.add(actor);
            System.out.println(actor.geActor().getName() + " клиент добавлен в очередь на ВОЗВРАТ товара");
        }
    }

    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        returnOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
            }
        }
        for (iActorBehaviour actor : returnQueue) {
            if(!actor.getReturnOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди НА ВОЗВРАТ");
            }
        }
        releseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент сделал заказ ");

            }
        }

    }
    @Override
    public void returnOrder() {
        for (iActorBehaviour actor : returnQueue) {
            System.out.println(actor.geActor().getName() + " клиент ВЕРНУЛ заказ ");
            actor.setReturnOrder(false);
        }
    }



}
    

