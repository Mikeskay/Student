package student.base;

public class StudentMarks {

  double[] marks = new double[7];

  public StudentMarks(){

      marks  = new double[7];
  }

  public int getSize(){
    return marks.length;
  }

  public double[] getMarks() {
       return marks;

}

public double getMark(int pos) {
     return marks[pos];

}

public void setMarks(int pos, double mark) {
        marks[pos] = mark;
    }

public double Mean(){
      double sum = 0;

      for(int i=0; i< this.marks.length; i++){
	         sum = sum + this.marks[i];
	      }


      double mean = sum/this.marks.length;

      return mean;
    }

    public int highestMarkIndex(){
      double max_value = -1.0;
      int max_index = -1;
      for(int i=0; i< this.marks.length; i++){
           if(this.marks[i] > max_value){
             max_value = this.marks[i];
             max_index = i;

           }
        }
        return max_index;

    }

    public int highestMarkIndex2(){
      double max_value = -1.0;
      int max_index = -1;
      for(int i=this.marks.length - 1; i >= 0; i--){
           if(this.marks[i] > max_value){
             max_value = this.marks[i];
             max_index = i;

           }
        }
        return max_index;

    }

  }
