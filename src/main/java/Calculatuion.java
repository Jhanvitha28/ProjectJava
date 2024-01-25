class Calculate1 {
    protected final int x = 8;

    protected final int radius(int input) {
        return  input * input;
    }
}
public class Calculatuion extends Calculate1 {
    public static void main(String args[]) {
        Calculatuion c = new Calculatuion();
        int result = c.radius(3);
        System.out.println(result);
    }
}
