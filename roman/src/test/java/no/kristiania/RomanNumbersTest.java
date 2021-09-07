package no.kristiania;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {

    private final RomanNumbers romanNumbers;

    public RomanNumbersTest() {
        romanNumbers = new RomanNumbers();
    }

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", romanNumbers.toRoman(1));
    }
}
