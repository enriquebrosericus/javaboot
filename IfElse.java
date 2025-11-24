public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        if (biologyGrade > chemistryGrade) {
            System.out.println("Java: Yes, you scored better in biology.");
        } else {
            System.out.println("Java: No, you did not score better in biology.");
        }
        // Add if-else statement here

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        if ( sales > costs ){
            System.out.println("big money");
        } else {
            System.out.println("Sorry, you didn't make sweet moolah");

        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        if ( temperature < targetTemperature){
            System.out.println("Temp is colder than target");
        } else {
            System.out.println("No, it's not colder than target");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        if (currentSpeed < speedLimit) {
            System.out.println("You ARE driving under the limit.");
        } else {
            System.out.println("SLOW DOWN!!");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        if ( age < retirementAge) {
            System.out.println("GET BACK TO WORK!!");
        } else {
            System.out.println("You're free!!!");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        if ( myGrade == bestGrade ){
            System.out.println("You got the best!");
        } else {
            System.out.println("Better luck next time.");
        }
        // Add if-else statement here

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        if ( word.equals(secondWord)){
            System.out.println("They are the same.");
        } else {
            System.out.println("No, dawg.");
        }
        // Add if-else statement here

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different, Eric");
        if (!thirdWord.equals(fourthWord)){
            System.out.println("They are different.");
        } else {
            System.out.println("They are the same words.");
        }
        // Add if-else statement here
    }
}
