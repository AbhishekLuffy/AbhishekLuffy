package association;

public class Association {

    public static void main(String[] args) {
        Library lib = new Library("central");
        Student student = new Student("raj");

        student.studiesIn(lib);
    }
    
}
