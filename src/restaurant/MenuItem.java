package restaurant;
import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private String newItem;
    private Date creationDate;


    public MenuItem (String name, Double price, String description, String category){
       this.name = name;
       this.price = price;
       this. description = description;
       this.category = category;

   }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date setCreationDate() {
        creationDate = new Date();
        return  creationDate;
    }

    public String isNew() {
        Date date = new Date();
        int checkDate = date.getMonth() + 1;
        int creationMonth = creationDate.getMonth();
        if (checkDate - creationMonth > 0){
            newItem = "This is a new item";
        }
        else {
            newItem = "She's been here a while";
        }
        return newItem;
    }

    public String toString(){

        return "\n***** \nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "\nCategory: " + category + "\nDate Created: " + setCreationDate() + "\n" + isNew();
    }
    public boolean equals(MenuItem toBeCompared){
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()){
            return false;
        }
        MenuItem anItem = (MenuItem) toBeCompared;
        return anItem.getName() == name;
    }
}
