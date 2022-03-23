package student.test;

import student.base.StudentMarks;
import java.util.*;

public class StudentMarksTest{

  public static void main(String[] args) {
      double mark;
      StudentMarks student_marks = new StudentMarks();
      Scanner input = new Scanner(System.in);
      for (int i = 0; i<student_marks.getSize(); i++){
        System.out.println("Insert the mark:  ");
        mark = input.nextDouble();
        student_marks.setMarks(i, mark);

      }

      int max_index = student_marks.highestMarkIndex();

      System.out.println("Max mark is " + " at index " + max_index);
    //  System.out.println("Max mark is "+ student_marks.marks[max_index]+" at index "+max_index);

      max_index = student_marks.highestMarkIndex2();

      System.out.println("Max mark is " + " at index " + max_index);
   //   System.out.println("Max mark is "+ student_marks.marks[max_index]+" at index "+max_index);

  }
}
