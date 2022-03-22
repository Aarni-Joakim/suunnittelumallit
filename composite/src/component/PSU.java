package component;

import abstractComponent.IComponent;

public class PSU implements IComponent {

    private double price = 99.98;

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

