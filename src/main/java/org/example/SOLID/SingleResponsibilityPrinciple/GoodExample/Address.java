package org.example.SOLID.SingleResponsibilityPrinciple.GoodExample;

public class Address {
    private Integer postalCode;
    private String city;
    private String streetName;
    private Integer houseNumber;

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

    public Address(Integer postalCode, String city, String streetName, Integer houseNumber) {
        this.postalCode = postalCode;
        this.city = city;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }
}
