package component;

import abstractComponent.IComponent;

public class GPU implements IComponent {

    private double price = 899.98;

    @Override
    public double getCost() {
        return price;
    }

    @Override
    public void addComponent(IComponent component) {
        throw new RuntimeException
                ("Cannot add a shape to simple shapes ...");
    }
}

