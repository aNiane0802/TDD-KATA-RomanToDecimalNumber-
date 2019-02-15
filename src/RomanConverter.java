 class RomanConverter {

     public int convert(String symbol) {
         if(symbol.equals("V"))
             return 5 ;
         if(symbol.equals("X"))
             return 10 ;
         if(symbol.equals("L"))
             return 50;
         if(symbol.equals("C"))
             return 100 ;
         if(symbol.equals("D"))
             return 500 ;
         if (symbol.equals("M"))
             return 1000;
         return 1;
     }
 }
