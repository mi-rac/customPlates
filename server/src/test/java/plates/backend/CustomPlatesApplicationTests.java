package plates.backend;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomPlatesApplicationTests
{
    @Autowired
    private PlatesRepository platesController;
    @Test
    void contextLoads() {
        assertThat(platesController).isNotNull();
    }

}
