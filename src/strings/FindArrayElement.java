package strings;

/*
* String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
   Verify if "JOHN" is present at index 1.
* */



public class FindArrayElement {
    public static void main(String[] args) {

        String[] names = {"Mohammed","John","Ferdous","Abul","Ratna",};
        boolean found = false;
        int index = 1;

        System.out.println(" At Index 1  present : " + names[1]);

        for(int i = 0;i<=names.length-1;i++){
            if(i==index && names[i].equalsIgnoreCase("JOHN") ){
                found=true;
                break;
            }

        }
        if(found){
            System.out.println("Name is present:" + index);
        }else {
            System.out.println("Name is not present");
        }

    }
}
