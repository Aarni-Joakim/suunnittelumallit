package component;

import abstractComponent.IComponent;

import java.util.ArrayList;
import java.util.List;

public class Case implements IComponent {

    private List<IComponent> componentList = new ArrayList<IComponent>();
    private double totalCost;
    private double price = 109.99;

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

