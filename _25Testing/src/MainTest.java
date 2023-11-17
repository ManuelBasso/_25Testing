import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;


class MainTest {
    private final Main testing = new Main();


    @Test
    void changeDate_with_month_equal_1() {
        OffsetDateTime result = testing.changeDate(OffsetDateTime.parse("2010-01-05T13:00:00Z"));
        assertEquals(OffsetDateTime.parse("2010-12-12T13:00:00Z"), result);
    }

    @Test
    void changeDate_with_february28() {
        OffsetDateTime result = testing.changeDate(OffsetDateTime.parse("2010-02-28T13:00:00Z"));
        assertEquals(OffsetDateTime.parse("2011-02-04T13:00:00Z"), result);
    }

    @Test
    void changeDate_null() {
        OffsetDateTime result = testing.changeDate(null);
        assertNull(result);
    }

}