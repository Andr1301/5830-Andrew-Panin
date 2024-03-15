package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder = false;

    public Actor(String name) {
        this.name = name;
    }
    public Actor(String name, boolean isReturnOrder) {
        this.name = name;
        this.isReturnOrder = isReturnOrder;
    }

    public abstract String getName();
    public abstract void setName(String name);
    //public abstract void setReturnOrder(boolean isReturnOrder);
    @Override
    public String toString() {
        return "Actor [name=" + name + ", isTakeOrder=" + isTakeOrder + ", isMakeOrder=" + isMakeOrder
                + ", isReturnOrder=" + isReturnOrder + "]";
    }
}





