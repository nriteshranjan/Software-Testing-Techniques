package Employee;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupervisorTest {
    
    public Supervisor supervisor = new Supervisor("Kanishk Yadav", 200);

    @BeforeClass
    void setUp() {
        supervisor.setDeptName("Analyst");
    }

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

    @AfterClass
    void getDeptName() {
        assertEquals("Analyst", supervisor.getDeptName());
    }
}