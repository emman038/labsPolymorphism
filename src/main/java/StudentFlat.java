public class StudentFlat extends Building{
    private int numberOfPartiesHosted;
    private int numberOfStudents;
    private int floors;
    public StudentFlat(int numberOfRooms, int dateOfConstruction, int value, int numberOfPartiesHosted, int numberOfStudents) {
        super(numberOfRooms, dateOfConstruction, value);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
        this.numberOfStudents = numberOfStudents;
        this.floors = 3;
    }

    public String addFloors(int numberOfFloors){
        if (this.floors >= 5){
            return "I can't add more floors. I have maxed out at 5 floors.";
        } else {
            this.floors += numberOfFloors;
            return "You've successfully added a new floor. My new number of floors is " + this.floors;
        }
    }

    public boolean hostedTooManyParties(){
        return this.numberOfPartiesHosted >= 10;
    }
    public void evictStudent(){
        if (hostedTooManyParties()){
            this.numberOfStudents -= 1;
        }
    }

    public int getNumberOfPartiesHosted() {
        return this.numberOfPartiesHosted;
    }

    public void setNumberOfPartiesHosted(int numberOfPartiesHosted) {
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
