package component;

import abstractComponent.IComponent;

public class SSD implements IComponent {

    private double price = 89.98;

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

