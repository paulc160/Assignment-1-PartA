

import java.util.ArrayList;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.time.LocalDate;  
import java.util.Calendar; 

public class Course {
    public String CourseName;
    private LocalDate startDate;
    private LocalDate endDate;
    public ArrayList<Subject> subjects;
   
    public Course(String name,LocalDate startDate,LocalDate endDate){
        CourseName = name;
        subjects = new ArrayList<>();
        this.startDate = startDate;
        this.endDate = endDate;
	
   
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
   
    public String getStartDate(LocalDate startDate){
     String pattern = "dd/MM/yyyy";
     DateFormat df = new SimpleDateFormat(pattern);
     String dateasstring = df.format(startDate);
     return dateasstring;
     
    }
  
    public String getEndDate(LocalDate endDate){
     String pattern = "dd/MM/yyyy";
     DateFormat df1 = new SimpleDateFormat(pattern);
     String dateasstring1 = df1.format(startDate);
     return dateasstring1;
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