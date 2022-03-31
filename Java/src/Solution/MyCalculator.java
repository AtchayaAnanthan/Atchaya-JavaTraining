package Solution;

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int number) {
         int j = 0;
         if(number >=1000) {
        	 return j;}
         
  
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                j = j + i;
            }
            
        
        }
        return j;
        
     
    }}