import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToDecimalConverterTest {

    private RomanToDecimalConverter romanToDecimalConverter = new RomanToDecimalConverter() ;

    /*

     Theses tests were deleted ( Redundancy of Tests , Tested methods became private in the class at the end )

    @Test
    public void testSingleSymbolEvaluation(){
        assertEquality(1, romanToDecimalConverter.evaluateSymbol('I'));
        assertEquality(5, romanToDecimalConverter.evaluateSymbol('V'));
        assertEquality(10,romanToDecimalConverter.evaluateSymbol('X'));
        assertEquality(50,romanToDecimalConverter.evaluateSymbol('L'));
        assertEquality(100,romanToDecimalConverter.evaluateSymbol('C'));
        assertEquality(500,romanToDecimalConverter.evaluateSymbol('D'));
        assertEquality(1000,romanToDecimalConverter.evaluateSymbol('M'));
    }

    @Test
    public void testCoupleOfSymbolsEvaluation(){
        assertEquality(6,romanToDecimalConverter.evaluateCoupleOfSymbols("VI"));
        assertEquality(11,romanToDecimalConverter.evaluateCoupleOfSymbols("XI"));
        assertEquality(4,romanToDecimalConverter.evaluateCoupleOfSymbols("IV"));
        assertEquality(9,romanToDecimalConverter.evaluateCoupleOfSymbols("IX"));
    }

    */

    @Test
    public void testConvert(){
        assertEquality(2000, romanToDecimalConverter.convert("MM"));
        assertEquality(2005, romanToDecimalConverter.convert("MMV"));
        assertEquality(2006, romanToDecimalConverter.convert("MMVI"));
        assertEquality(2004, romanToDecimalConverter.convert("MMIV"));
        assertEquality(2014, romanToDecimalConverter.convert("MMXIV"));
        assertEquality(1944, romanToDecimalConverter.convert("MCMXLIV"));

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
