package Employee;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Manager manager = new Manager("Ajay Kumar", 20, true);

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Ajay Kumar", "Ajay Kumar");
    }

    @org.junit.jupiter.api.Test
    void getPayRate() {
        assertEquals(20, 20);
    }

    @org.junit.jupiter.api.Test
    void pay() {
        manager.isSalaried = false;
        assertEquals(20 * manager.getPayRate(), manager.pay(20));
        manager.isSalaried = true;
        assertEquals(manager.getPayRate(), manager.pay(20));
    }

    @org.junit.jupiter.api.Test
    void getSalaried() {
        assertEquals(manager.isSalaried, manager.getSalaried());
    }
}