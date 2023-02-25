import java.util.ArrayList;
import java.util.Comparator;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long sum_Min =0;
        long sum_Max =0;
        arr.sort(Comparator.naturalOrder());
        
        for(int i = 1; i < arr.size(); i++){
            sum_Max += arr.get(i);
        }
        for(int j = 0; j < (arr.size()-1); j++){
            sum_Min += arr.get(j);
        }
    
        System.out.printf("%d %d", sum_Min, sum_Max);

        

    }
}