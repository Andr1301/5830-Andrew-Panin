package Interfaces;

import java.util.List;

import Classes.Actor;
/*Интерфейс, управляющий посещением магазина */
public interface iMarcketBehaviour {
    /*Клиент входит в магазин */
    public void acceptToMarket(iActorBehaviour actor);
    /*Клиент уходит из магазина */
    public void releseFromMarket(List<Actor> actors);
    /*Управление действиями клиента внутри магазина */
    public void update();
}
