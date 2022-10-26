package org.example.DesignPatterns.StructuralPatterns.Facade;

public class House {
    public Door entranceDoor;
    public HeatingSystem heatingSystem;
    public Kettle kettle;
    public KitchenCupboard kitchenCupboard;
    public Window[] windows;

    public HouseFacade houseFacade;

    public void getToHouseOnColdDay() {
        houseFacade.onGetToHouseOnColdDay();
    }

    public class HouseFacade {
        public void onGetToHouseOnColdDay() {
            entranceDoor.open();
            // walk in
            entranceDoor.close();
            for (Window window : windows) {
                window.close();
            }
            heatingSystem.set(5);
            kitchenCupboard.takeMug();
            kitchenCupboard.takeTea();
            kitchenCupboard.takeSugar();
            kettle.pourWater();
            kettle.boilWater();
            // make tea
            // drink tea
        }
    }
}
