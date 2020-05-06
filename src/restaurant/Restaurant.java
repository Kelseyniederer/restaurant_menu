package restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args){
    MenuItem tofuScramble = new MenuItem("Brownies", 4.00, "Delicious and cruelty-free", "Entree");
    MenuItem tRavs = new MenuItem("Toasted Ravioli", 5.00, "An STL classic", "Appetizer");
    MenuItem specialBrownies = new MenuItem("Brownies", 10.00, "A Dessert that'll get ya silly", "Dessert");

    Menu.addMenuItem(tofuScramble);
    Menu.addMenuItem(tRavs);
    Menu.addMenuItem(specialBrownies);




    Menu.removeItem(specialBrownies);

//    Menu.printMenu();

    Menu.printMenuItem(tRavs);
    Menu.printMenu();
    Menu.isEqual(specialBrownies, tofuScramble);
    }
}
