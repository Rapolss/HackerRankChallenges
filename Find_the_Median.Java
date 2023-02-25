class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
    // Write your code here
    int length = arr.size();
    arr.sort(Comparator.naturalOrder());
    
    int median = arr.get((length)/2);
    return median;

    }

}