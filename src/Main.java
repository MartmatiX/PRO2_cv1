import models.PizzaMenu;
import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hello again!");

        int num = 10;
        int num2 = 20;

        if (num == num2){
            System.out.println("num == num2");
        }else if (num < num2){
            System.out.println("num < num2");
        }

        boolean b1 = num == num2;
        System.out.println(b1);
        boolean b2 = false;

        String s1 = "text";
        String s2 = "text2";

        if (s1.equals(s2)){
            System.out.println("s1 == s2");
        }

        PizzaMenuItem item1 = new PizzaMenuItem(190, "Hawai", "pineaple pizza");
        PizzaMenuItem item2 = new PizzaMenuItem(190, "Hawai", "pineaple pizza");

        PizzaMenuItem item3 = item1;

        if(item1!=item2){
            System.out.println("item1 is not equal with item2");
        }

        if (item1 == item3){
            System.out.println("item1 is equal to item3");
        }

        item3.setPrice(200);
        System.out.println(item1.getPrice());

        System.out.println(item1);

        List<PizzaMenuItem> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(new PizzaMenuItem(170, "Polo", "Chicken pizza"));

        for (PizzaMenuItem p : pizzaItems) {
            System.out.println(p);
        }

        PizzaMenuItem itemFromList = pizzaItems.get(1);
        System.out.println(itemFromList);

        System.out.println("--------------------------");

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addMenuItem(new PizzaMenuItem(150, "Hawai", "Pineaple pizza"));
        menu1.addMenuItem(new PizzaMenuItem(160, "Polo", "Chicken pizza"));
        menu1.addMenuItem(new PizzaMenuItem(220, "Tuna", "Something fishy"));

        System.out.println("Number of items: " + menu1.countMenuItems());
        System.out.println("Time of last update: " + menu1.getLastUpdate());
        for (PizzaMenuItem pMI : menu1.getMenuItems()){
            System.out.println(pMI.toString());
        }

        PizzaMenu menu2 = new PizzaMenu();
        menu2.addMenuItem(new PizzaMenuItem(150, "Hawai", "Pineaple pizza"));
        menu2.addMenuItem(new PizzaMenuItem(160, "Polo", "Chicken pizza"));
        menu2.addMenuItem(new PizzaMenuItem(220, "Tuna", "Something fishy"));

        System.out.println("--------------------------");

        if (menu1.equals(menu2)){
            System.out.println("menu1 equals menu2");
        }

        System.out.println("--------------------------");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

}
