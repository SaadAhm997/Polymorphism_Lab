import Vehicle.Vehicle;
import Vehicle.Bus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusTest {
    private Bus bus;

    @BeforeEach
    public void setUp() {
        bus = new Bus("Bus", true, true, 8, 35);
    }
    @Test
    public void busIsPublic(){
        Boolean expected = true;
        Boolean actual = bus.isForPublic();
        assertEquals(expected, actual);
    }
}