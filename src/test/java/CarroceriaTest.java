import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroceriaTest {

    @Test
    void shouldCreateSedanHB20() {
        Carro carro = new HB20(new Sedan());
        assertEquals("Sedan", carro.getCarroceria().getTipo());
    }

    @Test
    void shouldCreateSedanOnyx() {
        Carro carro = new Onyx(new Sedan());
        assertEquals("Sedan", carro.getCarroceria().getTipo());
    }
}