import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before

    public void before() {
        director = new Director("James", "JN245648A", 30000.00, "FRs", 100000000.00);
    }

    @Test
    public void managerHasName(){
        assertEquals("James", director.getName());
    }

    @Test
    public void managerHasNIN() {
        assertEquals("JN245648A", director.getNationalInsurance());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(30000.00, director.getSalary(), 0.0);
    }

    @Test
    public void managerHasDepartment() {
        assertEquals("FRs", director.getDeptName());
    }

    @Test
    public void canPayBonus() {
        assertEquals(600.00, director.payBonus(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(30000.00, director.getSalary(), 0.0);
        director.raiseSalary(10000.00);
        assertEquals(40000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(100000000.00, director.getBudget(), 0.0);
    }
}
