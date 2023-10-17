import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    Bungalow  bungalow;

    @BeforeEach
    public void setUP(){
        bungalow = new Bungalow(5, 2005, 100000, true, 10);
    }

    @Test
    public void canGetSize(){
        bungalow.setSize(9);
        assertThat(bungalow.getSize()).isEqualTo(9);
    }

    @Test
    public void canGetCentralHeating(){
        bungalow.setCentralHeating(false);
        assertThat(bungalow.getCentralHeating()).isEqualTo(false);
    }

    @Test
    public void canCostOfHeating(){
        bungalow.setCentralHeating(false);
        assertThat(bungalow.costOfHeating()).isEqualTo(500);
    }

    @Test
    public void canCostOfHeating__WithArgument(){
        bungalow.setCentralHeating(false);
        assertThat(bungalow.costOfHeating(10)).isEqualTo(600);
    }
}
