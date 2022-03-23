import student.base.*;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentDetails("michael", 'M', 1994);
        student2.setStudentDetails("Joanne", 'F', 2001);
        student3.setStudentDetails("Solo", 'M', 1975);



        Scanner reader = new Scanner(System.in);
        System.out.print("Is " + student1.getName() + " in today? "); 
         
        
        student1.setRegistered(reader.nextBoolean());
        student1.register(student1.getregistered());

    }
    
}
