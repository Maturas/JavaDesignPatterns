package org.example.DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

/*
    An example Chain of Responsibility, representing a process of cooking eggs on a frying pan.
    Each action is dependent on the successful completion of the previous one.
 */
public class ChainOfCookingEggs {
    public static void cookEggs() {
        ChainMethod takeFryingPan = () -> {
            System.out.println("Taking frying pan and putting it on the oven.");
            return true;
        };
        ChainMethod startFire = () -> {
            System.out.println("Starting fire on the oven.");
            return true;
        };
        ChainMethod putOil = () -> {
            System.out.println("Putting oil on the frying pan and waiting for it to get hot.");
            return true;
        };
        ChainMethod putEggsOnFryingPan = () -> {
            System.out.println("Putting eggs on the frying pan and waiting for them to fry.");
            return true;
        };
        ChainMethod turnOffFire = () -> {
            System.out.println("Turning off fire on the oven.");
            return true;
        };
        ChainMethod putEggsOnPlate = () -> {
            System.out.println("Putting eggs on a plate.");
            return true;
        };

        // Note: this is a very primitive way of creating a chain
        ChainLink startLink = new ChainLink(takeFryingPan,
                new ChainLink(startFire,
                        new ChainLink(putOil,
                                new ChainLink(putEggsOnFryingPan,
                                        new ChainLink(turnOffFire,
                                                new ChainLink(putEggsOnPlate))))));

        // Start execution of the chain
        startLink.execute();
    }
}
