import java.util.ArrayList;

public class RealEstateAgent {
    private String name;
    private ArrayList<Building> portfolio;
    public RealEstateAgent(String name, ArrayList<Building> portfolio) {
        this.name = name;
        this.portfolio = portfolio;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Building> getPortfolio() {
        return this.portfolio;
    }

    public void setPortfolio(ArrayList<Building> portfolio) {
        this.portfolio = portfolio;
    }
}
