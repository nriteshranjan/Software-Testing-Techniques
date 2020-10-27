package Employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupervisorTest {

    Supervisor supervisor = new Supervisor("Kanishk Yadav", 200);

    @Test
    void getName() {
        assertEquals(supervisor.name, supervisor.getName());
    }

    @Test
    void getPayRate() {
        assertEquals(supervisor.payRate, supervisor.getPayRate());
    }

    @Test
    void pay() {
        assertEquals(20 * supervisor.payRate, supervisor.pay(20));
    }
}