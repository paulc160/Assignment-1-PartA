import java.util.ArrayList;
public class Student {
   private String name;
   private String age;
   private String DOB;
   private int StudentID;
   private String Username;
   private String modules;
   private String Courses;
   
   public Student(String StudentName,String age,String DOB,int id){
       name = StudentName;
       StudentID = id;
       this.age = age;
       this.DOB = DOB;
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
    
     public String getModules(){
       return modules;
   }
    
    public String getCourses(){
       return Courses;
   }
    
    public String getUsername(String name, String age){
       String Username = name+age;
       return Username;
   }
   
     public void setModules(String modules){
       this.modules = modules;
   }
   
     public void setCourses(String Courses){
       this.Courses = Courses;
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
        out += "Student: ";
        out += "\n";
        out += "ID: " + StudentID;
        out += "\n";
        out += "Username: " + getUsername(name,age);
        out += "\n";
        out += "Modules: " + modules;
        out += "\n";
        out += "Courses: " + Courses;
        out += "\n";
        
        return out;
   
    
    
   
   
}
}