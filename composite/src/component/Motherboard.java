package component;

import abstractComponent.IComponent;

import java.util.ArrayList;
import java.util.List;

public class Motherboard implements IComponent {

    private double totalCost;
    private double price = 299.98;

    List<IComponent> componentList = new ArrayList<IComponent>();

    @Override
    public double getCost() {
        for(IComponent component: componentList){
            totalCost += component.getCost();
        }
        return totalCost + price;
    }

    @Override
    public void addComponent(IComponent component) {
        componentList.add(component);
    }
}

