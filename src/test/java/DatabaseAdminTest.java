import staff.techstaff.DatabaseAdmin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before

    public void before() {
        databaseadmin = new DatabaseAdmin("Steven", "JN245648B", 20000.00);
    }

    @Test
    public void databaseadminHasName(){
        assertEquals("Steven", databaseadmin.getName());
    }

    @Test
    public void databaseadminHasNIN() {
        assertEquals("JN245648B", databaseadmin.getNationalInsurance());
    }

    @Test
    public void databaseadminHasSalary(){
        assertEquals(20000.00, databaseadmin.getSalary(), 0.0);
    }



    @Test
    public void canPayBonus() {
        assertEquals(200.00, databaseadmin.payBonus(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(20000.00, databaseadmin.getSalary(), 0.0);
        databaseadmin.raiseSalary(10000.00);
        assertEquals(30000.00, databaseadmin.getSalary(), 0.0);
    }
}