import java.util.Scanner;

public class MarsExpedition {
    public static void main(String[] args) {
        MarsExpedition marsExpedition = new MarsExpedition();
        marsExpedition.doMarsExpedition();
    }

    public void doMarsExpedition(){
        Scanner input = new Scanner(System.in);

        //initialize
        System.out.println("Mars Expedition program 79854332 starting up....");
        System.out.println("...");
        //Thread.sleep(250);
        System.out.println("Booting");
        System.out.println("...");
        //Thread.sleep(400);
        System.out.println("Loading params");
        System.out.println("...");
        //Thread.sleep(600);
        System.out.println("Ready");

        System.out.println("Welcome user, What is your name?");
        String name = input.nextLine();

        //team lead
        System.out.println("Hello " + name + " ----- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");

        String init = input.nextLine();

        if (init.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that! You are a team leader for a reason!");
        } else {
            System.out.println("Too bad you are the team leader. You have to go!");
        }

        //team size input
        System.out.println("How many people do you require for your expedition team? (Int input required)");

        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members.");
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
        } else if ( teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job!");
        }

        //select snack
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Great choice! You will be bringing your " + snack + " with you.");


        //select vehicle
        System.out.println("Please choose an expedition vehicle from the list" +
                "\n1: Mars Rover" +
                "\n2: Hovercraft" +
                "\n3: Jet Car");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equals("1")) {
            vehicleChoice = "A Mars Rover";
        } else if (vehicleChoice.equals("2")) {
            vehicleChoice = "A Hovercraft";
        } else if (vehicleChoice.equals("3")) {
            vehicleChoice = "A Jet Car";
        } else {
            vehicleChoice = "Your feet";
        }

        System.out.println("Your expedition team is now set" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nYou will be exploring the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n10..." +
                "\n9..." +
                "\n8..." +
                "\nThis sure is taking a bit..." +
                "\n7..." +
                "\n6..." +
                "\n5..." +
                "\nDon't forget your " + snack + "." +
                "\n4..." +
                "\n3..." +
                "\n7..." +
                "\nJust kidding!" +
                "\n2..." +
                "\n1..." +
                "\nGO GO GO!!!!");

    }
}
