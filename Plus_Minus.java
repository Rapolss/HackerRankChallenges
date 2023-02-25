class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        float count_Positive = 0;
        float count_Negative = 0;
        float count_Zero = 0;
        
        
        
        for (int x : arr){
            if (x > 0){
                count_Positive++;
            } else if (x < 0){
                count_Negative++;
            } else if (x == 0){
                count_Zero++;
            }
        }
        
        System.out.println(count_Positive/arr.size());
        System.out.println(count_Negative/arr.size());
        System.out.println(count_Zero/arr.size());
        

    }

}