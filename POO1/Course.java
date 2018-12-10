
public class Course{
  private String courseName;
  private String [] students = new String [100];
  private int numberOfStudents = 0;

  public String getCourseName(){
    return this.courseName;
  }

public void setCourseName(String courseName){
  this.courseName = courseName;
}

public void addStudent (String student){
  this.students[numberOfStudents] = student;
  this.numberOfStudents ++;
}

public void dropStudent (String student){
  //tarea para ustedes
  int index = findStudent(student);
		if (index >= 0) {
			dropStudent(index);
		}
		else {
			System.out.println(student + " is not in the course: " + courseName);
		}
}


private void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		for (int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index) {
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numberOfStudents--;
	}

public String[]getStudents(){
  return this.students;
}

public int getNumberOfStudents(){
  return this.numberOfStudents;
}

private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
}
