import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Davey", "JB123456", 25000, "Sales");
    }

    @Test
    public void canGetName(){
        assertEquals("Davey", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JB123456", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(100);
        assertEquals(25100, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(25250, manager.getSalary(), 0.01);
    }


}
