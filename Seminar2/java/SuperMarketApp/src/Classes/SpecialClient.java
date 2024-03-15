package Classes;

public class SpecialClient extends Actor {

    private int idVIP;

    /**Этот метод создает ВИП клиента
     * @param name Имя клиента
     * @param idVIP Идентификатор ВИП-клиента
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    /**Этот метод создает ВИП клиента
     * @param name Имя клиента
     * @param idVIP Идентификатор ВИП-клиента
     * @param isReturnOrder Цель посещения магазина
     */
    public SpecialClient(String name, int idVIP, boolean isReturnOrder) {
        super(name);
        this.idVIP = idVIP;
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

    public Actor geActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

}
