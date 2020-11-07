/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class JUnitTest {
    
    public static void main(String[] args) {
        JUnitTest junittest = new JUnitTest();
        junittest.transaction1();
    }
    public void transaction1(){
    Student student = new Student("John O'Shea","34","30/11/1988",56);
    Subject subject = new Subject("Programming",56);
    Course course = new Course("Computer Science");
    
    Student student2 = new Student("Patrick Mannion","55","30/11/1988",75);
    Subject subject2 = new Subject("Machine Learning",45);
    Course course2 = new Course("Electrical Engineering");
    
    
    student.addSubject(subject);
    student.addSubject(subject2);
    student.addCourse(course);
    student.addCourse(course2);
    
    course.setStartDate(2020, 01, 22);
    course.setEndDate(2021, 01, 22);
    course.addSubjects(subject);
    course.addSubjects(subject2);
    System.out.println("Test Scenario 1: ");
    System.out.println(course.toString());
    System.out.println(student.toString());
    
    
    
    }

   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}


