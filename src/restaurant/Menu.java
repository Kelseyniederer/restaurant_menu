package restaurant;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Menu {

    private Date lastUpdated;
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

    public static void printMenu(){
        for (MenuItem item : menuItems){
            System.out.println(item.toString());
        }
    }


}
