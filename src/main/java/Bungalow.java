public class Bungalow {
    boolean centralHeating;
    int size;
    public Bungalow(boolean centralHeating, int size) {
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
