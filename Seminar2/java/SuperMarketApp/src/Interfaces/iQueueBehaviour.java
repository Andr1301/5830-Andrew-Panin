package Interfaces;

/*Интерфейс, отвечающий за поведение клиентов в очереди */
public interface iQueueBehaviour {
    /*Вход в очередь */
    public void takeInQueue(iActorBehaviour actor);
    /*Выход из очереди */
    public void releaseFromQueue();
    /*Принимаем заказ клиента*/
    public void takeOrder ();
    /*Отдаем заказ клиенту */
    public void giveOrder ();
}
