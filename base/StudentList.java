package student.base;
import java.util.ArrayList;

public class StudentList {

	private ArrayList<Student> list; //instance variable

	/**
	 *  Constructor
	 */
	public StudentList(){
		list = new ArrayList<Student>();
	}

	/**
	 *  a method to print off all ArrayList elements
	 */

	public void printList(){

		System.out.println("--Begin--");

		for(int i=0; i<list.size();i++){

			System.out.println(list.get(i));
		}
		System.out.println("--End--");

	}

	/**
	 *  A method to add a student to the list
	 *
	 *@param    The student
	 */
	public void addToList(Student s){
		list.add(s);

	}

	/**
	 *  A method to remove a student from the list
	 *
	 *@param    The student
	 */
	public void removeFromList(Student s){
		list.remove(s);
	}

}
