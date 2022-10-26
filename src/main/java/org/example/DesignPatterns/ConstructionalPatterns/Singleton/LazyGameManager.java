package org.example.DesignPatterns.ConstructionalPatterns.Singleton;

/*
    An example of a Lazy Singleton, which initialized upon first reference from the application.
 */
public class LazyGameManager {
    private static LazyGameManager instance;
    private String currentLevel;
    private Integer currentAmountOfPlayers;

    /*
        A private constructor makes it impossible to create a new instance outside this class
     */
    private LazyGameManager() { }

    /*
        Access to the GameManager's singleton
     */
    public static LazyGameManager getInstance() {
        if (instance == null) {
            instance = new LazyGameManager();
        }

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
