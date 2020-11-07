
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Course {
    public String CourseName;
    public DateTime startDate;
    public DateTime endDate;
    public ArrayList<Subject> subjects;
    
    public Course(String name){
        CourseName = name;
        subjects = new ArrayList<>();
   
   }
   
   public void addSubjects(Subject subject){
        subjects.add(subject);
    }
   
    public String getCourseName(){
       return CourseName;
   }
   
     public void setCourseName(String CourseName){
       this.CourseName = CourseName;
   }
   
    public DateTime getStartDate(){
     return startDate;
    }
    
    public void setStartDate(int year, int month, int day){
     String inpDate = "" + year + "-" + month + "-" + day;
    }
    
    public void setEndDate(int year, int month, int day){
     String inpDate2 = "" + year + "-" + month + "-" + day;
    }
    
    
     public DateTime getEndDate(){
     return endDate;
    }
    
    public String toString(){
        String out = "\n";
        
        out += "Course Name: " +CourseName;
        out += "\n";
        out += "Start Date: " +startDate;
        out += "\n";
        out += "End Date: " +endDate;
        out += "\n";
        out += "Modules associated with course: ";
        out += "\n";
       for (Subject subject: subjects){
            out+="Module Name:" + subject.modname + "\n" + "Module ID: " + subject.ModuleID + "\n" + "\n";
        }
        out += "\n";
       
        
        
        
        
        return out;
    }
}
