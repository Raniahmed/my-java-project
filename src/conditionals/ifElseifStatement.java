package conditionals;

public class ifElseifStatement {

    public static void main(String[] args) {
        String[] months = {"Not a Month", "January", "February", "March", "April", "May", "Jun", "July", "August"
                , "September", "October", "November", "December"};
        int month = 12;
        String season;

         if (month == 12 || month == 1 || month == 2)
            season = "Winter";
         else if(month == 3 || month == 4 || month ==5)
            season = "Spring";
         else if (month == 6 || month == 7 || month == 8)
            season = "summer";
         else if (month == 9 || month == 10 || month == 11)
            season = "Automn";
         else
             season = "Not a season";

        System.out.println(months[month] + " is in the:" + season + "");

    }
}
