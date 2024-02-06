package exceptionHandling;

public class Exception {

    public static int convertInteger(String s){
        int i=0;
        try{
            i=Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("Cannot convert this string to number :"+s);
        }
        return i;
    }

}