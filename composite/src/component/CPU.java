package component;

import abstractComponent.IComponent;

public class CPU implements IComponent {

    private double price = 699.56;
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

