import java.util.Scanner;

public class MarsExpedition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

        System.out.println("Hello " + name + " ----- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");

        String init = input.nextLine();

        if (init.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that! You are a team leader for a reason!");
        } else {
            System.out.println("Too bad you are the team leader. You have to go!");
        }
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
    }
}
