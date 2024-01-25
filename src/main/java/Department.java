abstract class Department {
    public abstract int getDepartmentSize();

}
class Sdepartment extends Department{
    int size;
    public Sdepartment(int size) {
        this.size = size;
    }
    public int getDepartmentSize(){
        return size;

    }
    public static void main(String[] args){
        Sdepartment s1=new Sdepartment(5);
        System.out.println(s1.getDepartmentSize());
    }

}