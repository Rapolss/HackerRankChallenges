public class Lonely_Integer {
    class Result {

        /*
         * Complete the 'lonelyinteger' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY a as parameter.
         */
    
        public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int length = a.size();
        int ans = 0;
        int j = 0;
        a.sort(Comparator.naturalOrder());
        
        
        System.out.print(length);
        for (int i = 0; i < length; i++){
    
            for (j = 0; j < length; j++){
                if(j != i && a.get(i) == a.get(j)){
                    break;
                }
            }
            
            if (j == length){
                ans = a.get(i);
            }
        } 
     
     
     
     
     
        return ans;
        }
    
    }
}
