 class RomanToDecimalConverter {

     private int evaluateSymbol(char symbol) {
         if(symbol == 'V')
             return 5 ;
         if(symbol == 'X')
             return 10 ;
         if(symbol == 'L')
             return 50;
         if(symbol == 'C')
             return 100 ;
         if(symbol == 'D')
             return 500 ;
         if (symbol == 'M')
             return 1000;
         return 1;
     }

     private int evaluateCoupleOfSymbols(String expression) {
         int lastSymbol = evaluateSymbol(expression.charAt(1));
         int firstSymbol = evaluateSymbol(expression.charAt(0));
         if(lastSymbol>firstSymbol)
             return lastSymbol-firstSymbol;
         return lastSymbol + firstSymbol;
     }

     public int convert(String expression) {
         int expressionLength = expression.length();
         if(expressionLength ==3)
             return evaluateCoupleOfSymbols(expression.substring(expressionLength-2,expressionLength))+evaluateSymbol(expression.charAt(expressionLength-3));
         if(expressionLength >3)
             return evaluateCoupleOfSymbols(expression.substring(expressionLength-2,expressionLength))+convert(expression.substring(0,expressionLength-2)) ;
         return evaluateCoupleOfSymbols(expression) ;
     }
 }
