import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Service { //
    List<Shirt> Shirts = new ArrayList<>();// Shirts meanns List
    Scanner sc = new Scanner(System.in);

    public void load() {
        Shirts.add(new Shirt("Arrow", "Red", 2200.3, 32));
        Shirts.add(new Shirt("Armani", "Red", 2200.3, 32));
        Shirts.add(new Shirt("H&M", "Red", 2300.3, 32));
        Shirts.add(new Shirt("Gucci", "Red", 1200.3, 32));
        Shirts.add(new Shirt("Ar", "Red", 200.3, 31));
        Shirts.add(new Shirt("ow", "Red", 2200.3, 30));
    }

    
    // SAVE shirts method
    public void saveShirt() {
        System.out.println("Enter shirt brand");
        String brand = sc.nextLine();

        System.out.println("Enter shirt color");
        String color = sc.nextLine();

        System.out.println("Enter shirt price");
        double price = Double.parseDouble(sc.nextLine());

        System.out.println("Enter shirt size");
        int size = Integer.parseInt(sc.nextLine());

        Shirt newShirt = new Shirt(brand, color, price, size);
        Shirts.add(newShirt);
    }


     // // View all shirts
      public void viewAllShirts() {
        if (Shirts.isEmpty()) {
            System.out.println("NOt shirt available");
            return;
        } else {
            for (Shirt x : Shirts) {
                System.out.println(x);
            }
        }

    }

    
    // Acces the Shirt By brand
    public void accessShirtByBrand() {
        System.out.println("ENTER THE BRAND NAME TO SEARCH");
        String brand = sc.nextLine();
        int x = 0; // x=0 --> not found boolean found = false
        for (Shirt s : Shirts) {
            if (s.brand.equalsIgnoreCase(brand)) {
                System.out.println(s);
                x = 1; // x=1-->Found found = true
            }
        }
        if (x == 0) {
            System.out.println("No Shirts Found for the Brand " + brand);
        } else
            System.out.println("All Shirts accessed Sucessfully for brand  :" + brand);
    }


// Access Shirt by Price Range 
public void accessShirtsByPriceRange(){
    System.out.println("ENTER THE MINIMUM PRICE : ");
    double minPrice=Integer.parseInt(sc.nextLine());
    System.out.println("ENTER THE MAXIMUM PRICE ");
    double maxPrice=Integer.parseInt(sc.nextLine());

    int x=0;
    for (Shirt s : Shirts) {
        if (s.price>=minPrice && s.price<=maxPrice) {
            System.out.println(s);
            x=1;
        }
    }
  if (x==0) {
    System.out.println("No Shirt found in the price Range "+minPrice +"to"+maxPrice);
  }
  else
    System.out.println("ALL Shirts acccessed Successfuly in the price Range :"+minPrice +"to"+maxPrice);
}

public void sortOnSizeLowToHigh(){
    List <Shirt>temp=new ArrayList<>(Shirts);
    temp.sort(Comparator.comparingInt(s->s.size));
    for (Shirt s : temp) {
        System.out.println(s);
    }
    System.out.println("Shirts sorted by Size from low to high successfully ");
}
public void accessShirtsBySizeAndPriceRange(){
    System.out.println("Enter the Shirt price ");
    int size = Integer.parseInt(sc.nextLine());
    System.out.println("Enter minimun Price ");
     double miniPrice = Double.parseDouble(sc.nextLine());
     System.out.println("Enter maximum  price ");
}
   
}

