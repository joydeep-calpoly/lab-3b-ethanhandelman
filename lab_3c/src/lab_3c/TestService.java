package lab_3c;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class TestService {

    @Test
    public void testGetDBID(){
        final int DB_ID = 90;
        Database dbMock = Mockito.mock(Database.class);
        when(dbMock.getUniqueId()).thenReturn(DB_ID);
        Service tester = new Service(dbMock);
        assertEquals(tester.getDatabaseID(), "Using database with id: " + DB_ID, "Expected ID not returned");
    }

    @Test
    public void testGetDBID2(){
        final int DB_ID = 20;
        Database dbMock = Mockito.mock(Database.class);
        when(dbMock.getUniqueId()).thenReturn(DB_ID);
        Service tester = new Service(dbMock);
        assertEquals(tester.getDatabaseID(), "Using database with id: " + DB_ID, "Expected ID not returned");
    }
    @Test
    public void testIsAvailable(){
        final int DB_ID = 20;
        Database dbMock = Mockito.mock(Database.class);
        when(dbMock.getUniqueId()).thenReturn(DB_ID);
        when(dbMock.isAvailable()).thenReturn(true);
        Service tester = new Service(dbMock);
        assertEquals(tester.getDatabaseID(), "Using database with id: " + DB_ID, "Expected ID not returned");
        assertTrue(tester.query("test query"), "Expected true");
    }
}
