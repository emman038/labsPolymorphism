import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuildingTest {

    Building bungalow;

    @BeforeEach
    public void setUp(){
        bungalow = new Bungalow(5, 2005, 100000, true, 10);
    }

    @Test
    public void canCalculateAge(){
        bungalow.calculateAge();
        LocalDate currentDate = LocalDate.now();
        int expected = currentDate.getYear() - bungalow.getDateOfConstruction();
        assertThat(bungalow.calculateAge()).isEqualTo(expected);
    }

    @Test
    public void canGetNumberOfRooms(){
        bungalow.setNumberOfRooms(6);
        assertThat(bungalow.getNumberOfRooms()).isEqualTo(6);
    }

    @Test
    public void canGetDateOfConstruction(){
        bungalow.setDateOfConstruction(6);
        assertThat(bungalow.getDateOfConstruction()).isEqualTo(6);
    }

    @Test
    public void canGetValue(){
        bungalow.setValue(110000);
        assertThat(bungalow.getValue()).isEqualTo(110000);
    }
}
