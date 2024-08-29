package tudee.task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DeadlineTest {

    private Deadline deadline;

    @BeforeEach
    void setUp() {
        deadline = new Deadline("Submit assignment", "2024-09-01");
    }

    @Test
    void testGetDateTime() {
        LocalDate expectedDate = LocalDate.parse("2024-09-01");
        assertEquals(expectedDate, deadline.getDateTime());
    }

    @Test
    void testToString() {
        String expectedString = "[D][ ] Submit assignment (by: Sep 1 2024)";
        assertEquals(expectedString, deadline.toString());
    }

    @Test
    void testToFileString() {
        String expectedFileString = "D | 0 | Submit assignment | 2024-09-01";
        assertEquals(expectedFileString, deadline.toFileString());
    }
}
