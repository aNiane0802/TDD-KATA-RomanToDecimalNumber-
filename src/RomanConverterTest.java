import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanConverterTest {

    private RomanConverter romanConverter = new RomanConverter() ;

    /*

     Theses tests were deleted ( Redundancy of Tests , Tested methods became private in the class at the end )

    @Test
    public void testSingleSymbolEvaluation(){
        assertEquality(1, romanConverter.evaluateSymbol('I'));
        assertEquality(5, romanConverter.evaluateSymbol('V'));
        assertEquality(10,romanConverter.evaluateSymbol('X'));
        assertEquality(50,romanConverter.evaluateSymbol('L'));
        assertEquality(100,romanConverter.evaluateSymbol('C'));
        assertEquality(500,romanConverter.evaluateSymbol('D'));
        assertEquality(1000,romanConverter.evaluateSymbol('M'));
    }

    @Test
    public void testCoupleOfSymbolsEvaluation(){
        assertEquality(6,romanConverter.evaluateCoupleOfSymbols("VI"));
        assertEquality(11,romanConverter.evaluateCoupleOfSymbols("XI"));
        assertEquality(4,romanConverter.evaluateCoupleOfSymbols("IV"));
        assertEquality(9,romanConverter.evaluateCoupleOfSymbols("IX"));
    }

    */

    @Test
    public void testConvert(){
        assertEquality(2000,romanConverter.convert("MM"));
        assertEquality(2005,romanConverter.convert("MMV"));
        assertEquality(2006,romanConverter.convert("MMVI"));
        assertEquality(2004,romanConverter.convert("MMIV"));
        assertEquality(2014,romanConverter.convert("MMXIV"));
        assertEquality(1944,romanConverter.convert("MCMXLIV"));

    }

    /*

    Had some false assumptions about the substring method so I wrote tests to have concrete feedback

    @Test
    public void testSubstring(){
        String madrid = "Madrid" ;
        Assertions.assertEquals("Mad",madrid.substring(0,3));
        Assertions.assertEquals("id",madrid.substring(4,6));
        Assertions.assertEquals('r',madrid.charAt(3));
    }

    */


    private void assertEquality(int expected, int conversion) {
        Assertions.assertEquals(expected, conversion);
    }
}
