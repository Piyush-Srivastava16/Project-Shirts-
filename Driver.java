import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        service.load();
        System.out.println("=====> Welcomme to our shirt project <=======");
        String continueChoice;
        do {
            System.out.println("Press 1==> Add Shirt");
            System.out.println("Press 2==> View All Shirts");
            System.out.println("Press 3==> To Access all shirts on brand");
            System.out.println("Press 5==> To access shirts on price range");
            System.out.println("Press 6==> To access shirts on size and price range");
            System.out.println("Press 7==> To Sort on size Low To High");
            System.out.println("Press 8==> To Sort on size High To Low");
            System.out.println("Press 11==> To Sort on brand Low To High");
            System.out.println("Press 12==> To Sort on brand High To Low");
            System.out.println("Press 13==> To Sort on price Low To High and if price is same then sort on size low to high");
            System.out.println("Press 17==> To List all brands");
            System.out.println("Press 0==> Exit");
            System.out.println();

            System.out.print("Enter here : --> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.saveShirt();
                    System.out.println("Shirt are added ");
                    break;
                case 2:
                    service.viewAllShirts();
                    System.out.println("alll shirts are viewed ");
                    break;
                case 3:
                    service.accessShirtByBrand();
                    System.out.println("All  shirts are acces on Brand ");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    service.accessShirtsByPriceRange();
                    System.out.println("All shirts are ");
                    break;
                case 6:
                    service.sortOnSizeLowToHigh();
                    System.out.println("");
                case 7:
                    // service.accessShirtsBySizeAndPriceRange();
                    System.out.println("");
                    break;
                case 8:
                System.out.println("");
                break;
                case 11:
                System.out.println("");
                break;
                case 0:
                    System.out.println("==================Thank you for using our project=====================");
                    System.exit(0);
                    // break;

                default:
                    System.out.println("Invaild choice please try again");
            }
            System.out.println("PRESS YES TO CONTINUE (YES/NO)");
            continueChoice = sc.next();
        } while (continueChoice.equalsIgnoreCase("yes"));

    }
}