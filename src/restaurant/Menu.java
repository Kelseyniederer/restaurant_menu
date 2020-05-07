package restaurant;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Menu {

    private static Date lastUpdated = new Date();
    private static ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public static void addMenuItem(MenuItem anItem){
        menuItems.add(anItem);
    }

    public static void removeItem(MenuItem anItem){
        if (menuItems.contains(anItem)){
                    menuItems.remove(anItem);


        } else {
            System.out.println("That item isn't currently on the menu");
        }

    }

    public static void printMenuItem(MenuItem anItem){
        System.out.println(anItem.toString());
    }

    public static void printMenu(){
        for (MenuItem item : menuItems){
            System.out.println(item.toString());
        }
        System.out.println("This menu was last updated on: " + lastUpdated);


    }

    public static void isEqual(MenuItem item1, MenuItem item2){
        if (item1.equals(item2)){
            System.out.println("These menu items are equal");
        }
        else{
            System.out.println("These menu items are not equal");
        }
    }


}
