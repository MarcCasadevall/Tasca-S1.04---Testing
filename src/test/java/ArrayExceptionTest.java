import ex3.ArrayException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayExceptionTest {
    @Test
    void causeException_throwsArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayException.causeException();
        });
    }
}
