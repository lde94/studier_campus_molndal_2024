package sw;

public class Race {
    private Podracer racer1;
    private Podracer racer2;

    public Race(Podracer racer1, Podracer racer2) {
        this.racer1 = racer1;
        this.racer2 = racer2;
    }

    public void startRace(){
        System.out.println("Start podrace between " + racer1.getName() + " and " + racer2.getName() + "!");
        int round = 1;

        while(racer1.isFunctional() && racer2.isFunctional()){
            System.out.println("---- Round " + round + " ----");

            //Hastighetsökning
            racer1.speedBoost(Helper.randomInt());
            racer2.speedBoost(Helper.randomInt());
            Helper.sleepForMilliSeconds(2000);

            // Skada
            racer1.takeDamage(Helper.randomInt());
            racer2.takeDamage(Helper.randomInt());
            Helper.sleepForMilliSeconds(2000);

            racer1.status();
            racer2.status();

            round++;

            if (round > 100){
                break;
            }
            Helper.sleepForMilliSeconds(2000);
        }

        //Kontrollera vem som vann
        if (!racer1.isFunctional() && !racer2.isFunctional()){
            System.out.println("Both Podracers have crashed! There will be no winner.");
        } else if (!racer1.isFunctional()){
            System.out.println(racer1.getName() + " have crashed! " + racer2.getName() + " wins the race!");
        } else if (!racer2.isFunctional()) {
            System.out.println(racer2.getName() + " have crashed! " + racer1.getName() + " wins the race!");
        }

    }


}
