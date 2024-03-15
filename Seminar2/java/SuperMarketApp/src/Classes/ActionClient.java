package Classes;

public class ActionClient extends Actor{

    private int actionId;
    private String actionName;
    static private int actionClientCapacity = 3;

/**
 * Этот конструктор создает акционного клиента
 * @param name Имя клиента
 * @param actionId Идентификатор участника акции
 */
    public ActionClient(String name, String actionName, int actionId) {
        super(name);
        this.actionId = actionId;
        this.actionName = actionName;
    }
/**
 * Этот конструктор создает акционного клиента
 * @param name Имя клиента
 * @param actionId Идентификатор участника акции
 * @param isReturnOrder Цель посещения(покупка или возврат)
 */
    public ActionClient(String name, int actionId, boolean isReturnOrder) {
        super(name);
        this.actionId = actionId;
        this.isReturnOrder = isReturnOrder;
    }
        
    public void setReturnOrder(boolean val) {
        super.isReturnOrder = val;
    }
    public boolean getReturnOrder() {
        return super.isReturnOrder;
    }

    public int getActionId(){
        return this.actionId;
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
