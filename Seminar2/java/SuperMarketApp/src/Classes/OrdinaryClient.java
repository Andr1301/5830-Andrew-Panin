package Classes;

public class OrdinaryClient extends Actor {
    /**Этот конструктор создает посетителя
     * @param name Имя
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /**Этот конструктор создает посетителя
     * @param name Имя
     * @param isReturnOrder Цель посещения(покупка или возврат)
     */
    public OrdinaryClient(String name, boolean isReturnOrder) {
        super(name);
        this.isReturnOrder = isReturnOrder;
    }

    public void setReturnOrder(boolean val) {
        super.isReturnOrder = val;
    }
    public boolean getReturnOrder() {
        return super.isReturnOrder;
    }
    
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder; 
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;        
    }
/*Возвращает этот экземпляр класса-наследника Actor*/
    public Actor geActor() {
        return this;
    }
/*Переопределение абстрактного метода из родительского класса*/
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}