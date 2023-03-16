class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        arr.sort(Comparator.naturalOrder());
        
        
        ArrayList<Integer> ans = new ArrayList<Integer>(); //create a new array where we need to add the count for each bird
        int indexAns = 0;
                
        for (int i = 0; i < 5; i++){ //we created 5 counts for each bird, We count everytime a bird from the array is equal to the current number. We store 
            int count = 0;
            for(int j = 0; j < arr.size(); j++ ){ // We count everytime a bird from the array is equal to the current number. note that index 0 is type1
                if (arr.get(j)==(i+1)){
                    count++;
                }
            }
            ans.add(count); //we store the count to the array of that type.
        }
    
        for (int j = 0; j < 5; j++){// we go through each count of the types
            if(ans.get(indexAns) < ans.get(j)){ // if the the value of the current maxValue is lwoer than the newer one.
                indexAns = j; //we replace the reference to the bigger value.
            }
        }
        return (indexAns+1); // since type 1 is stored at index 0, + 1 is added to compensate.

        indexAns = ans.indexOf(Collections.max(ans)); //shorter version instead of using a for loop.
        return (indexAns+1);
    
    }

}