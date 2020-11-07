import java.util.ArrayList;
public class Student {
   private String name;
   private String age;
   private String DOB;
   private int StudentID;
   private String Username;
   private ArrayList<Subject> subjects;
   private ArrayList<Course> courses;
  
   
   public Student(String StudentName,String age,String DOB,int id){
       name = StudentName;
       StudentID = id;
       this.age = age;
       this.DOB = DOB;
       subjects = new ArrayList<>();
       courses = new ArrayList<>();
      
       
    }
   
   public String getName(){
       return name;
   }
   
   public String getAge(){
       return age;
   }
   
    public String getDOB(){
       return DOB;
   }
    
    public int getSID(){
       return StudentID;
   }
    
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
   
   public void addCourse(Course course){
        courses.add(course);
    }
   
    public String getUsername(String name, String age){
       String Username = name+age;
       return Username;
   }
    
    public void setName(String name){
       this.name = name;
   }
   
    public void setAge(String age){
       this.age = age;
   }
   
    public void setDOB(String DOB){
       this.DOB = DOB;
   }
   @Override
   public String toString(){
        String out = "\n";
        out += "List of Students: ";
        out += "\n";
        out += "ID: " + StudentID;
        out += "\n";
        out += "Username: " + getUsername(name,age);
        out += "\n";
        out += "Modules: ";
       for (Subject subject: subjects){
            out+=subject + "\n";
        }
        out += "\n";
        out += "Courses Registered For: ";
        out += "\n";
        for (Course course: courses){
            out+=course.CourseName + "\n";
        }
        
        
        
        
        return out;
   
    
    
   
   
}
}