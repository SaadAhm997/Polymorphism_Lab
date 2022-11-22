import Vehicle.Vehicle;
import Vehicle.Train;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTest {
    private Train train;

    @BeforeEach
    public void setUp() {
        train = new Train("Train", false, true, 30, 100);
    }

    @Test
    public void trainIsOnRoad() {
        Boolean expected = false;
        Boolean actual = train.travelsOnRoad;
        assertEquals(expected, actual);
    }
}