
//Alumno: Angel Gabriel Llanos Pacheco
//Sección: C24A
//Curso: Construcción y Prueba de Software 

public class StudentController {
    private StudentModel model;
    private StudentVista view;
    private StudentReport report;

    public StudentController(StudentModel model, StudentVista view, StudentReport report) {
        this.model = model;
        this.view = view;
        this.report = report;
    }

    public void updateView() {
        String status = report.getPassStatus(model.getGrade());
        view.printStudentDetails(model.getName(), model.getGrade(), status);
    }

    // Punto de entrada rápido para probar
    public static void main(String[] args) {
        // Inicializamos los componentes
        StudentModel model = new StudentModel();
        model.setName("Naruto Uzumaki");
        model.setGrade(16.5);

        StudentVista view = new StudentVista();
        StudentReport report = new StudentReport();

        // Creamos el controlador y ejecutamos
        StudentController controller = new StudentController(model, view, report);
        controller.updateView();
    }
}