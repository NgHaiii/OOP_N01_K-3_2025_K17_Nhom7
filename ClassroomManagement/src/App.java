public class App{
    public static void main(String[] args) throws Exception {
        //tinh chu vi, dien tich
        rectangle r1 = new rectangle();
		r1.getInformation();
		r1.display();
        //number
        Number n1 = new Number(); 
        Number n2 = new Number();
        n1.i = 2; 
        n2.i = 5; 
        n1 = n2;
        n1.i = 10;
        System.out.println(n2.i);
        System.out.println(n1.i);
        //passObject
        Number n = new Number(); 
        n.i = 14; 
        PassObject.f(n);
        System.out.println(n.i);

               // Tạo đối tượng ClassRoom
        ClassRoom classRoom = new ClassRoom("C001", "Lớp Lập Trình Java");

        // Tạo đối tượng Student
        Student student = new Student("S001", "Nguyễn Văn A");

        // Tạo đối tượng Teachers
        Teachers teacher = new Teachers("T001", "Lê Thị B");

        // Tạo đối tượng Score
        Score score = new Score("S001", "Lập Trình Java", 95.5);

        // In thông tin của ClassRoom
        System.out.println("Classroom ID: " + classRoom.getClassId());
        System.out.println("Classroom Name: " + classRoom.getClassName());

        // In thông tin của Student
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());

        // In thông tin của Teacher
        System.out.println("Teacher ID: " + teacher.getTeacherId());
        System.out.println("Teacher Name: " + teacher.getTeacherName());

        // In thông tin của Score
        System.out.println("Student ID: " + score.getStudentId());
        System.out.println("Subject: " + score.getSubject());
        System.out.println("Score: " + score.getScore());
    }
}
