import java.time.LocalDate;

public abstract class Building {
    int numberOfRooms;
    int dateOfConstruction;
    int value;

    public Building(int numberOfRooms, int dateOfConstruction, int value){
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
        this.value = value;
    }

    public int calculateAge(){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - this.dateOfConstruction;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getDateOfConstruction() {
        return dateOfConstruction;
    }

    public void setDateOfConstruction(int dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
