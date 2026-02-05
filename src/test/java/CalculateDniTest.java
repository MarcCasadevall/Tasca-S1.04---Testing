import ex2.CalculateDni;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateDniTest {
    @ParameterizedTest
    @CsvSource({
            "46952805, H",
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B"
    })
    void calculateWord_validDni_returnsCorrectLetter(int dni, String expectedLetter) {
        assertEquals(expectedLetter, CalculateDni.calculateWord(dni));
    }

    @Test
    void calculateWord_negativeNumber_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.calculateWord(-5);
        });
    }

    @Test
    void calculateWord_tooLargeNumber_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.calculateWord(100_000_000);
        });
    }
}
