package inheritancetest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    Truck truck = new Truck("Tata", 16, 200, 200);

    @Test
    void getCapacity() {
        assertEquals(truck.getCapacity(), 250);
    }

    @Test
    void Honk() {
        assertNotEquals(truck.honk(), "Make way");
    }

    @Test
    void getId() {
        assertEquals(truck.getId(), "Tata");
    }

    @Test
    void getNumWheels() {
        assertEquals(truck.getNumWheels(), 16);
    }


    @Test
    void isRunning() {
        assertFalse(truck.isRunning());
    }

    @Test
    void turnOn() {
        truck.turnOn();
        assertTrue(truck.isRunning());
    }

    @Test
    void turnOff() {
        truck.turnOff();
        assertFalse(truck.isRunning());
    }

    @Test
    void getSpeed() {
        assertEquals(truck.getSpeed(), 0);
    }

    @Test
    void getMaxSpeed() {
        assertEquals(truck.getMaxSpeed(), 200);
    }
}