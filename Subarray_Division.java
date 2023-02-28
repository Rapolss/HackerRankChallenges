    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
        int count = 0;
    
        for (int i = 0; i <= (s.size()-m); i++){ //size - m limits the loop to the last number we can add and prevents over flowing
            int sum = 0;
            for (int j = i; j < i+m; j++){ // set j to i moving on to each part ofthe array
                sum += s.get(j);
            }
            if (sum == d){
                count++;
            } 
    
        }
        return(count);
    }
