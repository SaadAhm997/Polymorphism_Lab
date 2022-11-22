import Vehicle.Vehicle;
import Vehicle.Aeroplane;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AeroplaneTest {
    private Aeroplane aeroplane;

    @BeforeEach
    public void setUp() {
        aeroplane = new Aeroplane("Aeroplane", false, true, 2, 100);
    }

    @Test
    public void aeroplaneFitsHundredPeople() {
        Integer expected = 100;
        Integer actual = aeroplane.getMaxOccupancy();
        assertEquals(expected, actual);
    }
}
