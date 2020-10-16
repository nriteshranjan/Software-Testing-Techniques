package inheritancetest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = new Car("Honda", 4, 200);

    @Test
    void getCapacity() {
        assertEquals(car.getCapacity(), 4);
    }

    @Test
    void Honk() {
        assertNotEquals(car.honk(), "Make way");
    }

    @Test
    void getId() {
        assertEquals(car.getId(), "Honda");
    }

    @Test
    void getNumWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    void isRunning() {
        assertFalse(car.isRunning());
    }

    @Test
    void turnOn() {
        car.turnOn();
        assertTrue(car.isRunning());
    }

    @Test
    void turnOff() {
        car.turnOff();
        assertFalse(car.isRunning());
    }

    @Test
    void getSpeed() {
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    void getMaxSpeed() {
        assertEquals(car.getMaxSpeed(), 200);
    }
}