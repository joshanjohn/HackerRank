
public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String militaryTime = "";   // to store new military time

        // splitting the each part of time at semi colon
        String[] parts = s.split(":", 3);   

        int hours = Integer.parseInt(parts[0]); // getting integer hours 
        int minutes = Integer.parseInt(parts[1]);   // getting integer minutes 
        int seconds = Integer.parseInt(parts[2].substring(0, 2)); // getting integer seconds 

        // converting am or pm to upperCase 
        String timeData = parts[2].substring(2).toUpperCase();  

        if (timeData.equals("AM")) {
            //checking if time is am 
            if (hours == 12) {
                // checking is the hour is 12 
                // replacing the 12 hour with 00
                militaryTime = "00:" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
                return militaryTime;
            } else {
                // if it's not 12 nour
                // just return the time withour am or pm 
                militaryTime = String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":"
                        + String.format("%02d", seconds);
                return militaryTime;
            }

        } else {
            // if it's pm
            if (hours == 12) {
                //checking if hour is 12
                // if so it just return simply without am or om 
                militaryTime = String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":"
                        + String.format("%02d", seconds);
                        return militaryTime;
            } else {
                // if it's not 12 hour 
                hours += 12;    // add 12 to hour to convert into 24 hr 
                militaryTime = String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":"
                        + String.format("%02d", seconds);
                return militaryTime;
            }
        }
    }

}
