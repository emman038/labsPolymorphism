public class StudentFlat extends Building{
    public int numberOfPartiesHosted;
    public int numberOfStudents;
    public StudentFlat(int numberOfRooms, int dateOfConstruction, int value, int numberOfPartiesHosted, int numberOfStudents) {
        super(numberOfRooms, dateOfConstruction, value);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
        this.numberOfStudents = numberOfStudents;
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
