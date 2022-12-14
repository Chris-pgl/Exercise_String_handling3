
public class Main {
    public static void main(String[] args) {
        String array[] = {
                "I want ",
                "to learn ",
                "how to code! "
        };

        String array2[] = {
            array[0].trim(),
            array[1].trim(),
            array[2].trim(),
        };



        int statement1 = array2[0].compareTo(" I want ");
        int statement2 = array2[1].compareToIgnoreCase("To learn");
        //int statement2 = array2[1].toLowerCase().compareTo("To learn".toLowerCase());
        boolean result1 =  !(statement1 > statement2);
        System.out.println(result1);


    }
}
