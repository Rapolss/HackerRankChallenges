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
        a.sort(Comparator.naturalOrder()); // unnescary but improves search time by joining like terms near each other
        
        
        System.out.print(length);
        for (int i = 0; i < length; i++){// first loop and is basis for the reference
            for (j = 0; j < length; j++){ // comparing loop
                if(j != i && a.get(i) == a.get(j)){ // ends the loop if similar is found that is not the same index.
                    break;
                }
            }
            
            if (j == length){ // if j is finished without finding similar term, output  answer.
                ans = a.get(i);
            }
        } 
        return ans;
        }


            // int length = a.size();
            // int ans = 0;
            // int j = 0;
            // a.sort(Comparator.naturalOrder());
            
            
            // System.out.print(length);
            // for (int i = 0; i < length; i++){
        
                
            //     for (int a_comparison : a){ // instead of a basic for loop, we used an array loop
            //         if (j != i && a_comparison == a.get(i)){
            //             break;
            //         }
            //         j++;
            //     }
                
                
            //     if (j == length){
            //         ans = a.get(i);
            //     }
            //     j = 0;
            // } 
         
         
         
         
         
            return ans;
            }
        
        }
    
    }
}
