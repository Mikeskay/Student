package student.test;

import student.base.Student;
import student.base.StudentList;

public class StudentListTest {


	public static void main(String[] args) {

		// Create an instance of the class
		StudentList studentList = new StudentList();

		//create 3 student objects
		Student s1 = new Student("John Smith", "js@qmul.ac.uk", 2008);
		Student s2 = new Student("Tom Will", "tw@qmul.ac.uk", 2007);
		Student s3 = new Student("Michae Kolawole", "kolawolm@qmul.ac.uk", 2019);
		//add the three students to the list
		studentList.addToList(s1);
		studentList.addToList(s2);
		studentList.addToList(s3);

		// Print the list
		studentList.printList();
		System.out.println(" ");	

		// Remove the student "Tom Will"
		studentList.removeFromList(s2);

		// Print the list again
		studentList.printList();
	}


}
