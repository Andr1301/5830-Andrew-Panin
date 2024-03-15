package Classes;

import Interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder;
    
    /**Этот конструктор создает проверяющего
     */
    public TaxInspector() {
        this.name = "Tax Audit";
    }

    /**Этот конструктор создает проверяющего
     * @param isReturnOrder Цель посещения(покупка или возврат)
     */
    public TaxInspector(boolean isReturnOrder) {
        this.name = "Tax Audit";
        this.isReturnOrder = true;
    }

    public String getName()
    {
        return name;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder; 
    }

    public void setTakeOrder(boolean val) {
        isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        isMakeOrder = val;        
    }
        
    public void setReturnOrder(boolean val) {
        isReturnOrder = val;
    }
    public boolean getReturnOrder() {
        return isReturnOrder;
    }
    

    @Override
    public Actor geActor() {
        return new OrdinaryClient(name);
    }
    
}
