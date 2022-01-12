import staff.management.Manager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before

    public void before() {
        manager = new Manager("James", "JN245648A", 30000.00, "FRs");
    }

    @Test
    public void managerHasName(){
        assertEquals("James", manager.getName());
    }

    @Test
    public void managerHasNIN() {
        assertEquals("JN245648A", manager.getNationalInsurance());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void managerHasDepartment() {
        assertEquals("FRs", manager.getDeptName());
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, manager.payBonus(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.0);
        manager.raiseSalary(10000.00);
        assertEquals(40000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void cannotRaiseSalaryByNegative() {
        manager.raiseSalary(-30000.00);
        assertEquals(30000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canChangeName() {
        assertEquals("John", manager.setName("John"));
    }
    @Test
    public void cannotChangeNameToNull() {
        assertEquals("James", manager.setName(null));
    }
}
