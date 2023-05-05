public class Mars {


    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Enterprise";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(2);


        System.out.println("");
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println("Food left: " + meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;
        System.out.println("Population: " + shipPopulation);
        System.out.println("Food left: " + meals);

        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Ocean")) {
            System.out.println("Bbzzzzt landing in The Ocean");
        } else {
            System.out.println("ERROR!!!! Flight plan already set. Landing on the Hill");
        }
        new GuessingGame();
        new MarsExpedition();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)){
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
