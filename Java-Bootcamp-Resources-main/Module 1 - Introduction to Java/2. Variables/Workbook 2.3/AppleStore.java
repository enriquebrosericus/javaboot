public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).
        // when i click run, it's not printing the Eric has stuff - help!



        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;

        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double salePrice=.40;


        System.out.println("One customer walked in. He bought 4 apples!");
        profit = salePrice*4;
        numOfApples -=4;
        numOfCustomers++;

        System.out.println("Another customer walked in. He bought 20 apples!");
        profit += salePrice*20;
        numOfApples -=20;
        numOfCustomers++;

        System.out.println("Another customer walked in. She bought 200 apples!");
        profit += salePrice*200;
        numOfApples -=200;
        numOfCustomers++;

        System.out.println("Wow! So far, you made: $"+profit);
        System.out.println( numOfCustomers+" customers love your apples.");
        System.out.println("Eric has"+ numOfApples + " apples left.");

        //why isn't this printing?

        //when i click run, it printed this:  3 customers love your apples.
        //You have 276 apples left. We'll sell more tomorrow!

        


        // Compare your result to what's on Learn the Part.  
        
    }

}
