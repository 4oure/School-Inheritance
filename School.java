import java.util.ArrayList;

public class School {
  int facultyNum;
  int studentNum;
  int budget;
  int religiousNum;

  // setters and getters {start}
  public int getBudget() {
    return budget;
  }

  public void setBudget(int b) {
    budget = b;
  }
  
  public void setFacultyNum(int f) {
    facultyNum = f;
  }

  public int getFacultyNum() {
    return facultyNum;
    
  }

  public void setStudentNum(int s) {
    studentNum = s;
  }

  public int getStudentNum() {
    return studentNum;
    
  }

  public void setReligiousNum(int r) {
    religiousNum = r;
  }

  public int getReligiousNum() {
    return religiousNum;
  }
  // setters and getters {end}

  // constructor

  public School(){
    
  }
  public School(int f, int s, int b, int r) {
    facultyNum = f;
    studentNum = s;
    budget = b;
    religiousNum = r;
  }


  // methods
  public void facultyToStudent() {
    System.out.println("The faculty to student ratio is " + getFacultyNum()/getStudentNum() + ".");
  }
  
  public void percentReligious() {
    System.out.println("The school is " + getReligiousNum()/getStudentNum()*100 + "%.");
  }
  
}