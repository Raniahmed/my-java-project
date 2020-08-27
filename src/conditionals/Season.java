package conditionals;

public class Season {

    public static void main(String[] args) {
        String[] months = {" ", "January", "February", "March", "April", "May", "Jun", "July", "August"
                            , "September", "October", "November", "December"};
        for (int month = 1; month <= 12; month++){
            String season = "";
            switch (month){
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Autumn";
                    break;
            }
            if(months[month].equals("September")) { // month == 9
                System.out.println(months[month] + " is in " + season);
            }
        }
    }
}
