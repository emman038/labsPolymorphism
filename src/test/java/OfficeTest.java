import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    public void setUp(){
        office = new Office(5, 2005, 100000,"Sky Blue", 10000, 5000);
    }

    @Test
    public void canGetCompanyName() {
        office.setCompanyName("Head Quarters");
        assertThat(office.getCompanyName()).isEqualTo("Head Quarters");
    }

    @Test
    public void canGetIncome() {
        office.setIncome(12000);
        assertThat(office.getIncome()).isEqualTo(12000);
    }

    @Test
    public void canGetOutgoings() {
        office.setOutgoings(7000);
        assertThat(office.getOutgoings()).isEqualTo(7000);
    }

    @Test
    public void canCalculateProfit(){
        assertThat(office.calculateProfit()).isEqualTo(5000);
    }
}
