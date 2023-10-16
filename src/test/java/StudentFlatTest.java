import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    StudentFlat studentFlat;

    @BeforeEach
    public void setUp(){
        studentFlat = new StudentFlat(5, 2005, 100000,10, 5);
    }

    @Test
    public void canGetNumberOfPartiesHosted(){
        studentFlat.setNumberOfPartiesHosted(3);
        assertThat(studentFlat.getNumberOfPartiesHosted()).isEqualTo(3);
    }

    @Test
    public void canGetNumberOfStudents(){
        studentFlat.setNumberOfStudents(8);
        assertThat(studentFlat.getNumberOfStudents()).isEqualTo(8);
    }

    @Test
    public void canEvictStudent(){
        studentFlat.evictStudent();
        assertThat(studentFlat.getNumberOfStudents()).isEqualTo(4);
    }
}
