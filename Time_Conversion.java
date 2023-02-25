class Result{

    public static String timeConversion(String s){
    //Write your code here
        String hour = s.substring(0,2);
        int hour_int = Integer.parseInt(hour);
        String remaining_Time = s.substring(2,8);
        String converted_Time = "";

        if(s.contains("AM") && hour_int == 12){
            hour = "00";
        } else if (s.contains("PM") && hour_int < 12){
            hour_int += 12;
            hour = String.valueOf(hour_int);
        } else {
            hour = hour;
        }
        
        converted_Time= hour + remaining_Time;


        return converted_Time;


    }








}