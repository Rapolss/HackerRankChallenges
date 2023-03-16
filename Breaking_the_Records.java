class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int length = scores.size();
        int minScore = 0;
        int maxScore = 0;
        int maxPoint = 0;
        int minPoint = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
                
        for (int i = 0; i < length; i++){
            if (i == 0){
                minScore = scores.get(0);
                maxScore = scores.get(0);
                continue;
            }
            
            if (scores.get(i) > maxScore){
                maxPoint++;
                maxScore = scores.get(i);
            } else if(scores.get(i) < minScore){
                minPoint++;
                minScore = scores.get(i);
            }
        
        }
        
        ans.add(maxPoint);
        ans.add(minPoint);
        return ans;
    }

}