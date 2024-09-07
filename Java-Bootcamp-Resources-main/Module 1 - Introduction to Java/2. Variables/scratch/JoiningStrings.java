

public class JoiningStrings {
    public static void main(String[] args) {

        int year = 2021;
        String announcement = "The winners of the " + year + " competition are: ";

        String winners = "John and Jane";


        String message = announcement.concat(winners); // Using the concat() method
        // or
        // String message = announcement + winners; // Using the + operator

        System.out.println(message);
    }
}
