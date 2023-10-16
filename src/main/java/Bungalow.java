public class Bungalow {
    boolean centralHeating;
    int size;
    public Bungalow(boolean centralHeating, int size) {
        this.centralHeating = centralHeating;
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean getCentralHeating() {
        return centralHeating;
    }

    public void setCentralHeating(boolean centralHeating) {
        this.centralHeating = centralHeating;
    }

    public int getSize() {
        return size;
    }
}
