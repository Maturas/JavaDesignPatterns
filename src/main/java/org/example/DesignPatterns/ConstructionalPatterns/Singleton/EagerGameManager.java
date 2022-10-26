package org.example.DesignPatterns.ConstructionalPatterns.Singleton;

/*
    An example of an Eager Singleton, which is present throughout the entire application runtime.
 */
public class EagerGameManager {
    private static EagerGameManager instance;
    private String currentLevel;
    private Integer currentAmountOfPlayers;

    /*
        A private constructor makes it impossible to create a new instance outside this class
     */
    private EagerGameManager() { }

    /*
        Initializes the singleton, should be run in main()
     */
    public static void init() {
        instance = new EagerGameManager();
    }

    /*
        Access to the GameManager's singleton
     */
    public static EagerGameManager getInstance() {
        return instance;
    }

    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Integer getCurrentAmountOfPlayers() {
        return currentAmountOfPlayers;
    }

    public void setCurrentAmountOfPlayers(Integer currentAmountOfPlayers) {
        this.currentAmountOfPlayers = currentAmountOfPlayers;
    }
}
