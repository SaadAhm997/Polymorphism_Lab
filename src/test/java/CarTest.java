import Vehicle.Vehicle;
import Vehicle.Car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("car");
    }

    @Test
    public void carInterfaceTest() {
        String expected = car.rideCar("right now!");
        assertThat(expected).isEqualTo("It's time to ride the car right now!");
    }
}