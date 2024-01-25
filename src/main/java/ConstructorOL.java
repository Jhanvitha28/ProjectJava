
class Words {
    // Instance variable in the parent class
    int wordsVariable;

    // Constructor in the parent class
    public Words(int wordsVariable) {
        this.wordsVariable = wordsVariable;
    }
}


// Child class extending the parent class
class Letter extends Words {
    // Second instance variable in the child class
    int letterVariable;

    // Constructor in the child class to initialize both instance variables
    public Letter(int wordsVariable, int letterVariable) {
        // Call the constructor of the parent class
        super(wordsVariable);
        this.letterVariable = letterVariable;
    }

    // Overloaded constructor in the child class with one parameter
    // It initializes only the child class instance variable, calling the parent constructor implicitly
    public Letter(int letterVariable) {
        this(8, letterVariable); // Calls the constructor with both parameters, setting parentVariable to 0
    }
}

public class ConstructorOL {
    public static void main(String[] args) {
        // Creating an instance of the Child class using the constructor with both parameters
        Letter letter1 = new Letter(10, 20);

        // Creating an instance of the Child class using the constructor with one parameter
        Letter letter2 = new Letter(30);

        // Accessing the instance variables
        System.out.println("letter1: wordVariable = " + letter1.wordsVariable + ", letterVariable = " + letter1.letterVariable);
        System.out.println("letter2: wordVariable = " + letter2.wordsVariable + ", letterVariable = " + letter2.letterVariable);
    }
}
