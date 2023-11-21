import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;


class MainTest {
    private final Main testing = new Main();


    @Test
    void addYear_from_2010() {
        OffsetDateTime result = testing.addYear(OffsetDateTime.parse("2010-01-05T13:00:00Z"));
        assertEquals(OffsetDateTime.parse("2011-01-05T13:00:00Z"), result);
    }

    @Test
    void changeDate_null() {
        OffsetDateTime result = testing.addYear(null);
        assertNull(result);
    }
    @Test
    void subtractMonth() {
        OffsetDateTime result = testing.subtractMonth(OffsetDateTime.parse("2010-01-05T13:00:00Z"));
        assertEquals(OffsetDateTime.parse("2009-12-05T13:00:00Z"), result);
    }

    @Test
    void subtractMonth_null() {
        OffsetDateTime result = testing.subtractMonth(null);
        assertNull(result);
    }

    @Test
    void add7days_from_05012010() {
        OffsetDateTime result = testing.add7days(OffsetDateTime.parse("2010-01-05T13:00:00Z"));
        assertEquals(OffsetDateTime.parse("2010-01-12T13:00:00Z"), result);
    }

    @Test
    void add7days_null() {
        OffsetDateTime result = testing.add7days(null);
        assertNull(result);
    }

}