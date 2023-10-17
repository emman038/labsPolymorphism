import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RealEstateAgentTest {

    RealEstateAgent realEstateAgent;
    Bungalow bungalow;
    StudentFlat studentFlat;
    Office office;
    ArrayList<Building> portfolio;

    @BeforeEach
    public void setUp(){
        bungalow = new Bungalow(3,2005,500000, true, 10000);
        studentFlat = new StudentFlat(5,1998,100000, 10, 5);
        office = new Office(20,2020,1500000, "Dell", 10000, 5000);

        portfolio = new ArrayList<>(Arrays.asList(bungalow, studentFlat, office));

        realEstateAgent = new RealEstateAgent("Sky Blue", portfolio);
    }

    @Test
    public void canGetName(){
        realEstateAgent.setName("Towns");
        assertThat(realEstateAgent.getName()).isEqualTo("Towns");
    }

    @Test
    public void canGetPortfolio(){
        Bungalow bungalow2;
        StudentFlat studentFlat2;
        Office office2;
        ArrayList<Building> portfolio2;

        bungalow2 = new Bungalow(3,2005,500000, true, 10000);
        studentFlat2 = new StudentFlat(5,1998,100000, 10, 5);
        office2 = new Office(20,2020,1500000, "Dell", 10000, 5000);

        portfolio2 = new ArrayList<>(Arrays.asList(bungalow2, studentFlat2, office2));

        realEstateAgent.setPortfolio(portfolio2);
        assertThat(realEstateAgent.getPortfolio()).isEqualTo(portfolio2);
    }

    @Test
    public void canCalculateValueOfPortfolio(){
        assertThat(realEstateAgent.calculateValueOfPortfolio()).isEqualTo(2100000);
    }

    @Test
    public void canBuyBuilding(){
        Bungalow bungalow2 = new Bungalow(3,2005,500000, true, 10000);
        realEstateAgent.buyBuilding(bungalow2);
        assertThat(realEstateAgent.getPortfolio().size()).isEqualTo(4);
    }

    @Test
    public void canSellBuilding(){
        realEstateAgent.sellBuilding(office);
        assertThat(realEstateAgent.getPortfolio().size()).isEqualTo(2);
    }
}
