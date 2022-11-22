import Vehicle.Vehicle;
import Vehicle.Helicopter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelicopterTest {
    private Helicopter helicopter;

    @BeforeEach
    public void setUp() {
        helicopter = new Helicopter("Helicopter", false, false, 2, 2);
    }

    @Test
    public void helicopterHasTwoWings() {
        Integer expected = 2;
        Integer actual = helicopter.getNumOfWheelsOrWings();
        assertEquals(expected, actual);
    }
}
