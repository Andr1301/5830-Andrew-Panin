package Interfaces;

import Classes.Actor;
/*Интерфейс, отвечающий за поведение клиента в магазине */
public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean val); 
    public void setMakeOrder(boolean val);
    public void setReturnOrder(boolean val);
    public boolean getReturnOrder(); 
    public Actor geActor();
}
