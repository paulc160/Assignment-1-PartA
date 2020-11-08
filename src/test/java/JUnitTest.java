import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.time.LocalDate;  
import java.util.Calendar; 
public class JUnitTest {
    
    public static void main(String[] args) {
        JUnitTest junittest = new JUnitTest();
        junittest.transaction1();
    }
    public void transaction1(){
    Student student = new Student("John O'Shea","34","30/11/1988",56);
    Subject subject = new Subject("Programming",56);
    LocalDate date1 = LocalDate.of(2020,3,7);
    LocalDate date2 = LocalDate.of(2021,8,11);
    Course course = new Course("Computer Science",date1,date2);
    
    Student student2 = new Student("Patrick Mannion","55","30/11/1988",75);
    Subject subject2 = new Subject("Machine Learning",45);
    Course course2 = new Course("Electrical Engineering",date1,date2);
    
    student.addSubject(subject);
    student.addSubject(subject2);
    student.addCourse(course);
    student.addCourse(course2);
    
    course.addSubjects(subject);
    course.addSubjects(subject2);
    System.out.println("Test Scenario 1: ");
    System.out.println(course.toString());
    System.out.println(student.toString());
    
    
    
    }

   

   
}

   



