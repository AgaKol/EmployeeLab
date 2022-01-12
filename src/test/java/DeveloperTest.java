import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;


import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before

    public void before() {
        developer = new Developer("James", "JN245648A", 30000.00);
    }

    @Test
    public void managerHasName(){
        assertEquals("James", developer.getName());
    }

    @Test
    public void managerHasNIN() {
        assertEquals("JN245648A", developer.getNationalInsurance());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(30000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, developer.payBonus(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(30000.00, developer.getSalary(), 0.0);
        developer.raiseSalary(10000.00);
        assertEquals(40000.00, developer.getSalary(), 0.0);
    }
}
