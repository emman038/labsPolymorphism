package models;

import interfaces.Councilable;

public class Bungalow extends Building implements Councilable {
    private boolean centralHeating;
    private int size;
    private int floors;
    public Bungalow(int numberOfRooms, int dateOfConstruction, int value, boolean centralHeating, int size) {
        super(numberOfRooms, dateOfConstruction, value);
        this.centralHeating = centralHeating;
        this.size = size;
        this.floors = 1;
    }

    public int countTax(){
        return this.floors * 500 * this.size;
    }

    public String addFloors(int numberOfFloors){
        if (this.floors >= 2){
            return "I can't add more floors";
        } else {
            this.floors += numberOfFloors;
            return "You've successfully added a new floor. My new number of floors is " + this.floors;
        }
    }

    public int costOfHeating(){
        if (getCentralHeating()){
            return 500;
        } else {
            return 50 * this.size;
        }
    }

    public int costOfHeating(int additionalCosts){
        if (getCentralHeating()){
            return 500 + additionalCosts;
        } else {
            return (50 + additionalCosts) * this.size;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean getCentralHeating() {
        return this.centralHeating;
    }

    public void setCentralHeating(boolean centralHeating) {
        this.centralHeating = centralHeating;
    }

    public int getSize() {
        return this.size;
    }
}
