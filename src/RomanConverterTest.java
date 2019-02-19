import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanConverterTest {

    private RomanConverter romanConverter = new RomanConverter() ;


    @Test
    public void testConvertSymbol(){
        assertEquality(1, romanConverter.convertSymbol('I'));
        assertEquality(5, romanConverter.convertSymbol('V'));
        assertEquality(10,romanConverter.convertSymbol('X'));
        assertEquality(50,romanConverter.convertSymbol('L'));
        assertEquality(100,romanConverter.convertSymbol('C'));
        assertEquality(500,romanConverter.convertSymbol('D'));
        assertEquality(1000,romanConverter.convertSymbol('M'));
    }

    @Test
    public void testConvertExpression(){
        assertEquality(6,romanConverter.convert("VI"));
        assertEquality(11,romanConverter.convert("XI"));
        assertEquality(4,romanConverter.convert("IV"));
        assertEquality(9,romanConverter.convert("IX"));
        assertEquality(2006,romanConverter.convert("MMVI"));
    }




    private void assertEquality(int expected, int conversion) {
        Assertions.assertEquals(expected, conversion);
    }
}
