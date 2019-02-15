import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanConverterTest {



    @Test
    public void testConvertSymbol(){
        RomanConverter romanConverter = new RomanConverter() ;
        assertEquality(1, romanConverter.convert("I"));
        assertEquality(5, romanConverter.convert("V"));
        assertEquality(10,romanConverter.convert("X"));
        assertEquality(50,romanConverter.convert("L"));
        assertEquality(100,romanConverter.convert("C"));
        assertEquality(500,romanConverter.convert("D"));
        assertEquality(1000,romanConverter.convert("M"));
    }

    private void assertEquality(int expected, int conversion) {
        Assertions.assertEquals(expected, conversion);
    }
}
