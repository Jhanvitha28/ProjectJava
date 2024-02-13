package exceptionHandling;

public class Exceptions {


    public Exceptions(String message) {
    }

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