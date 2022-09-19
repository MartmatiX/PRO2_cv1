package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {

    private List<PizzaMenuItem> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu(){
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(PizzaMenuItem pMI){
        menuItems.add(pMI);
        lastUpdate = LocalDateTime.now();
    }

    public void removeItem(PizzaMenuItem pMI){
        menuItems.remove(pMI);
        lastUpdate = LocalDateTime.now();
    }

    public void removeItem(String name){
        PizzaMenuItem toDelete = null;
        for (PizzaMenuItem p : menuItems){
            if (p.getName().equals(name)){
                toDelete = p;
            }
            break;
        }
        if (toDelete != null){
            menuItems.remove(toDelete);
            lastUpdate = LocalDateTime.now();
        }
    }

    public List<PizzaMenuItem> getMenuItems(){
        return menuItems;
    }

    public int countMenuItems(){
        return menuItems.size();
    }

    public LocalDateTime getLastUpdate(){
        return lastUpdate;
    }

    @Override
    public boolean equals(Object obj){
        return ((PizzaMenu)obj).countMenuItems() == countMenuItems();
    }

}
