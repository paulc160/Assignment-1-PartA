

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pconn
 */
public class Subject {
    public String modname;
    public int ModuleID;
  
    
    public Subject(String modname,int id){
        ModuleID = id;
        this.modname = modname;
        
    
   }
    
   public String getModName(){
       return modname;
   }
   
    public void setModName(String modname){
       this.modname = modname;
   }
   
    @Override
     public String toString(){
        String out = "\n";
        out += "Module Name:" +modname;
        out += "\n";
        out+= "Module ID:" +ModuleID;
        out += "\n";
        return out;
   
    
    
   
   
}
}