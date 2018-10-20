import javax.swing.*;
  public class CourseImpl2{
    public static void main(String[] args) {
      Course curso1 = new Course();

      int opc=0;

      do {
          opc= Integer.parseInt(JOptionPane.showInputDialog(null," Nuevo Curso"+" \n"+"Ingresar alumno"+
          "\n" +"Eliminar alumno"+ "\n"+ "Mostrar alumno" ));
          switch(opc){
            case 1:
            String cn = JOptionPane.showInputDialog(null,"Nombre  Curso");
            curso1.setCourseName(cn);
              JOptionPane.showMessageDialog(null,curso1.getCourseName());


              break;
            case 2:
            String as= JOptionPane.showInputDialog(null,"Ingrese el alumno");
            curso1.addStudent(as);

            break;

            case 3:
            String Alum=JOptionPane.showInputDialog(null, "\n Ingrese el alumno para eliminar");
            curso1.dropStudent(Alum);


            break;
            case 4:
              JOptionPane.showMessageDialog(null,curso1.getStudents());
            break;

          }
      }while(true);

  }
}
