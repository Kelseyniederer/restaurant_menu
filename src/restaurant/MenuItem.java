package restaurant;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;
import java.util.Calendar;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private String newItem;
    private Date creationDate = new Date();


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

//    public void setName(String name) {
//        name = name;
//    }

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
        return creationDate;
    }

    public void newItem(){
        Date newTest = new Date();
//        if  (){
        System.out.println(creationDate.getTime());
//        }
//        else{
//            newItem = "She's been here a while";
//        }
    }

    public String toString(){

        return "\n***** \nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "\nCategory: " + category + "\nDate Created: " + creationDate + "\n" + newItem;
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
