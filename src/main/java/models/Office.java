package models;

public class Office extends Building {
    private String companyName;
    private int income;
    private int outgoings;
    private int floors;
    public Office(int numberOfRooms, int dateOfConstruction, int value, String companyName, int income, int outgoings){
        super(numberOfRooms, dateOfConstruction, value);
        this.companyName = companyName;
        this.income = income;
        this.outgoings = outgoings;
        this.floors = 2;
    }

    public String addFloors(int numberOfFloors){
        return "You can't add another floor, get new office space if you want more room";
    }

    public int calculateProfit(){
        return this.income - this.outgoings;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getIncome() {
        return this.income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getOutgoings() {
        return this.outgoings;
    }

    public void setOutgoings(int outgoings) {
        this.outgoings = outgoings;
    }
}
