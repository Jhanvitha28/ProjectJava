public class Student {
    String name;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "My name is Jhanvitha";
        String studentName = x.getName();
        System.out.println("Student name: " + studentName);
        System.out.println("Student name: " + studentName);
    }
}
