import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToDecimalConverterTest {

    private RomanToDecimalConverter converter = new RomanToDecimalConverter() ;

    /*

     Theses tests were deleted ( Redundancy of Tests , Tested methods became private in the class at the end )

    @Test
    public void testSingleSymbolEvaluation(){
        assertEquality(1, converter.evaluateSymbol('I'));
        assertEquality(5, converter.evaluateSymbol('V'));
        assertEquality(10,converter.evaluateSymbol('X'));
        assertEquality(50,converter.evaluateSymbol('L'));
        assertEquality(100,converter.evaluateSymbol('C'));
        assertEquality(500,converter.evaluateSymbol('D'));
        assertEquality(1000,converter.evaluateSymbol('M'));
    }

    @Test
    public void testCoupleOfSymbolsEvaluation(){
        assertEquality(6,converter.evaluateCoupleOfSymbols("VI"));
        assertEquality(11,converter.evaluateCoupleOfSymbols("XI"));
        assertEquality(4,converter.evaluateCoupleOfSymbols("IV"));
        assertEquality(9,converter.evaluateCoupleOfSymbols("IX"));
    }

    */

    @Test
    public void testConvert(){
        assertEquality(2000, converter.convert("MM"));
        assertEquality(2005, converter.convert("MMV"));
        assertEquality(2006, converter.convert("MMVI"));
        assertEquality(2004, converter.convert("MMIV"));
        assertEquality(2014, converter.convert("MMXIV"));
        assertEquality(1944, converter.convert("MCMXLIV"));

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
