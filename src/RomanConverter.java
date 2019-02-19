 class RomanConverter {

     public int convertSymbol(char symbol) {
         return evaluateSymbol(symbol) ;
     }

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

     public int convert(String expression) {
         int lastSymbol = evaluateSymbol(expression.charAt(1));
         int firstSymbol = evaluateSymbol(expression.charAt(0));
         if(lastSymbol>firstSymbol)
             return lastSymbol-firstSymbol;
         return lastSymbol + firstSymbol;
     }
 }
