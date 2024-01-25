
class University {
    void UniversityFacilities() {
        System.out.println("Fully Equipped Rec Center");
    }
}

class UniversityFacilities1 extends University {
    @Override
    void UniversityFacilities() {
        System.out.println("New Rec Center");
    }
    public static void main(String args[]) {
        University w = new UniversityFacilities1();
        w.UniversityFacilities();
    }
}
