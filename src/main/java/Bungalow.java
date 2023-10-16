public class Bungalow extends Building{
    boolean centralHeating;
    int size;
    public Bungalow(int numberOfRooms, int dateOfConstruction, int value, boolean centralHeating, int size) {
        super(numberOfRooms, dateOfConstruction, value);
        this.centralHeating = centralHeating;
        this.size = size;
    }

    public int costOfHeating(){
        if (getCentralHeating()){
            return 500;
        } else {
            return 50 * this.size;
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
