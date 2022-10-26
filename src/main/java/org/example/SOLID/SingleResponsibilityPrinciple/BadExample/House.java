package org.example.SOLID.SingleResponsibilityPrinciple.BadExample;

import java.util.List;

/*
    This is an example of breaking the Single Responsibility Principle
    This single class attempts to represent a house, its address and the people who live in it, with a single object
 */
public class House {
    private Integer postalCode;
    private String city;
    private String streetName;
    private Integer houseNumber;

    private String wallColor;
    private String roofColor;
    private Integer wallInsulationThickness;
    private Integer amountOfRooms;
    private Boolean hasGarage;

    private List<String> inhabitantsFirstNames;
    private List<String> inhabitantsLastNames;
    private List<Integer> inhabitantsYearsOfBirth;

    public House(Integer postalCode, String city, String streetName, Integer houseNumber, String wallColor, String roofColor, Integer wallInsulationThickness, Integer amountOfRooms, Boolean hasGarage, List<String> inhabitantsFirstNames, List<String> inhabitantsLastNames, List<Integer> inhabitantsYearsOfBirth) {
        this.postalCode = postalCode;
        this.city = city;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.wallColor = wallColor;
        this.roofColor = roofColor;
        this.wallInsulationThickness = wallInsulationThickness;
        this.amountOfRooms = amountOfRooms;
        this.hasGarage = hasGarage;
        this.inhabitantsFirstNames = inhabitantsFirstNames;
        this.inhabitantsLastNames = inhabitantsLastNames;
        this.inhabitantsYearsOfBirth = inhabitantsYearsOfBirth;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public String getRoofColor() {
        return roofColor;
    }

    public void setRoofColor(String roofColor) {
        this.roofColor = roofColor;
    }

    public Integer getWallInsulationThickness() {
        return wallInsulationThickness;
    }

    public void setWallInsulationThickness(Integer wallInsulationThickness) {
        this.wallInsulationThickness = wallInsulationThickness;
    }

    public Integer getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms(Integer amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public List<String> getInhabitantsFirstNames() {
        return inhabitantsFirstNames;
    }

    public void setInhabitantsFirstNames(List<String> inhabitantsFirstNames) {
        this.inhabitantsFirstNames = inhabitantsFirstNames;
    }

    public List<String> getInhabitantsLastNames() {
        return inhabitantsLastNames;
    }

    public void setInhabitantsLastNames(List<String> inhabitantsLastNames) {
        this.inhabitantsLastNames = inhabitantsLastNames;
    }

    public List<Integer> getInhabitantsYearsOfBirth() {
        return inhabitantsYearsOfBirth;
    }

    public void setInhabitantsYearsOfBirth(List<Integer> inhabitantsYearsOfBirth) {
        this.inhabitantsYearsOfBirth = inhabitantsYearsOfBirth;
    }
}
