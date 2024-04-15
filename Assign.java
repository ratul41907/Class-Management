/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sfr1;
import java.util.*;
/**
 *
 * @author USER
 */
/*
Student id - 231
sfr1 id - 131
srb id - 141
mla id - 151
mdy if - 161
password is same for both students and teachers - 123
*/
public class Assign {
     static int coursesnum; //no of courses to be taken                                                        
     static String id; // verifies id
     static String pass; // password for both teacher and students
     static String Teacher; //for teacher segment
     static String opi; // opi is taken for opinion whether one is teacher or student
     static String StudentName = ""; //name of the student
     
     static String teacherid1;
   //  static int studentcount1=1; // if the student count wasnt static it used to become zero everytime after the code or method ends, due to being static it keeps updated, studentcount increases
     static int courseclashcount=0; //tooka a variable for clashing of course and initialized as zero
     static java.util.Date d = new java.util.Date();
     static int s,sl;
     
     static int menuno;
     static String[] Course = new  String[100]; //{"CSE 215","CSE 173","MAT 250","EEE 141","CSE 215L"};
    public static void main(String[] args) {
        //student(); //called method should be static, only static ca be called from static
        

        System.out.print("Do you wanna get Logged as Teacher or Student?, Enter S for student, T for teacher: ");
        Scanner a = new Scanner(System.in);
        opi = a.nextLine(); // gets opinion whether he/she is a teacher of a student
        
        if(opi.toUpperCase().equals("T")) //used touppercase method as it turns small letters to capital and used .equals to compare them, didn't used == as it gave a logic error for me
        {
           
            Teacher(); 
        }
        if(opi.toUpperCase().equals("S"))
        {
           
            student(); 
        }   

         
    }

    public static void Teacher()
    {
        System.out.println(" _______________________________________________________________________________________");
        System.out.println("|                                         RDS                                           |");
        System.out.println(" ---------------------------------------------------------------------------------------");
        
        Scanner i = new Scanner(System.in); //scanner for id and pass
        
        System.out.print("Enter ID: "); 
        teacherid1 = i.nextLine(); //if the name was not static it would show an error as this method is static
        System.out.println("");
        System.out.print("Enter Password: "); // pass- 123
        pass = i.nextLine();
        System.out.println("");
        if(teacherid1.equals("131") && pass.equals("123")) //.equals to compare strings
        {
            
            
                sfr1();
        }        
        else if(teacherid1.equals("141") && pass.equals("123"))
        {
            srb();
        }
        else if(teacherid1.equals("151") && pass.equals("123"))
        {
            mla();
        }
        else if(teacherid1.equals("161") && pass.equals("123"))
        {
            mdy();
        }
        else
        {
            System.out.println("Password and User id doesn't match,try again!");
            System.exit(0); //terminates the code
        }
    }
    public static void student() //method used to log in the portal for the students
    {
        
        
        System.out.println(" _______________________________________________________________________________________");
        System.out.println("|                                         RDS                                           |");
        System.out.println(" ---------------------------------------------------------------------------------------");
        
        Scanner i = new Scanner(System.in); //scanner for id and pass
        
        System.out.print("Enter Name: ");
        StudentName = i.nextLine();
        System.out.print("Enter ID: "); // ID- 231
        id = i.nextLine(); //if the name was not static it would show an error as this method is static
        System.out.println("");
        System.out.print("Enter Password: "); // pass- 123
        pass = i.nextLine();
        System.out.println("");
        if(id.equals("231") && pass.equals("123")) // compared strings using .wqual methos instead of ==, using == causes a logic error,using == my code jumped to the next statement instead
        {
            courses();
        }        
        if(!id.equals("231") && !pass.equals("123"))
            System.out.println("Try AGain!");
            System.exit(0); //it is used to terminate the code
            
      
    }
    public static void courses()
    {
        //java.util.Date d = new java.util.Date();
        //System.out.println("                                    "+d.toString());
        System.out.println("                                                  Menu                                              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        Scanner inp = new Scanner(System.in);
        System.out.println(" 1.Check Course List and Choose Course");
        System.out.println(" 2.Log in as A Teacher Again");
        System.out.println(" 3.Log In as A Student Again"); // to drop any course you have to log in again
        System.out.println(" 4.Exit");
        
        System.out.print("Enter Here: ");
        menuno = inp.nextInt();
        
        if(menuno==1){
        System.out.println("");
        System.out.println("                                   Available Courses                                   ");
        System.out.println("   SL |   Course           Section                 Teacher                              Time        ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        System.out.println("|   1  |  CSE 215      |       3            |        SFR1                |               10:00 AM   | ");
        System.out.println("|   2  |  CSE 173      |       4            |        SRB                 |               10:00 AM   | ");
        System.out.println("|   3  |  MAT 250      |       5            |        MLA                 |               11:00 AM   | ");
        System.out.println("|   4  |  EEE 141      |       12           |        MDY                 |               11:00 AM   | ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        
        System.out.println("                                    "+d.toString()); // displays current time and date
        Scanner sc = new Scanner (System.in); //scanner for courses
        System.out.print("How Many Courses You Wanna Take?: ");
        coursesnum = sc.nextInt();
        sc.nextLine();
        System.out.println("Choose Courses: "); //you have to choose number of courses, it asks about how many courses you wanna take
        
        for(int i=0;i<coursesnum;i++)
        {
            System.out.println("Enter "+(i+1)+" no Course: ");
            Course[i] = sc.nextLine().toUpperCase().trim(); //used touppercase to prevent uper lower case problem, and use trim to prvent problems regarding spaces in strings
            
            if ((Course[i].contains("CSE 215") && Course[i].contains("CSE 173")) || (Course[i].contains("MAT 250") && Course[i].contains("EEE 141"))) 
        {
            courseclashcount++;
               break;
        }
            
            
        
        }
        if(courseclashcount>0)
        {
        System.out.println("Warning!,Course time clash detected. Please choose a different course."); 
            System.exit(0); //It ends the program as time clashed, you have to log in again
        }
        else
            listed(); // else it moves to listed method if count is not greater than 0
        }
                else if(menuno==2)
                Teacher();
        
        else if(menuno==3)
            student();
        
        else if(menuno==4)
            System.exit(0);
        
    
}
    public static void listed()
    {
        System.out.println("                                            "+StudentName);
        System.out.println("             "+id+"                                                               "+d.toString());
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        System.out.println("           Course           Section                 Teacher                              Time        ");
        for(int i=0;i<coursesnum;i++)
        {
            if (Course[i].contains("CSE 215"))
                    {
        System.out.println("|        CSE 215      |        3            |         SFR1                |               10:00 AM  | ");                
                    }
            else if (Course[i].contains("CSE 173"))
                    {
        System.out.println("|        CSE 173      |        4            |         SRB                 |               10:00 AM  | ");                
                    }
            else if (Course[i].contains("MAT 250"))
                    {
        System.out.println("|        MAT 250      |        5            |         MLA                 |               11:00 AM  | ");                
                    }
            else if (Course[i].contains("EEE 141"))
                    {
        System.out.println("|        EEE 141      |        12           |         MDY                 |               11:00 AM  | ");                
                    }

        }
                Scanner inp = new Scanner(System.in);
        System.out.println(" 1.Log in As A Teacher and Check Course List: ");
        System.out.println(" 2.Exit: ");
        System.out.print("Enter Here: ");
        menuno = inp.nextInt();
        if(menuno==1)
        {
            Teacher();
        }
        else if(menuno==2)
        {
            System.exit(0);
        }
    }
    //given below methods are for every facu;ties from where they can access students details
    public static void sfr1()
    {
        
        System.out.println("                                                  Menu                                              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        Scanner inp = new Scanner(System.in);
        System.out.println(" 1.Checkh Students List");
        System.out.println(" 2.Log in as A Teacher Again");
        System.out.println(" 3.Log In as A Student Again");
        System.out.println(" 4.Exit");
        
        System.out.print("Enter Here: ");
        menuno = inp.nextInt();
        if(menuno==1){
        System.out.println("                                                  SFR1");
        System.out.println("             "+teacherid1+"                                                               "+d.toString());
        System.out.println("             CSE 215                                                                      "+"Section 3");
        System.out.println("");
        System.out.println("   SL |         Name                                 |                                  ID              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        
        for(int i=0;i<coursesnum;i++)
        {
            if(Course[i].toUpperCase().contains("CSE 215"))
            System.out.printf(" %d          %s                                                                  %s               \n",(i+1),StudentName,id);   
        }
     
        }
        else if(menuno==2)
                Teacher();
        
        else if(menuno==3)
            student();
        
        else if(menuno==4)
            System.exit(0);
        
    }
    
    public static void mla()
    {
             System.out.println("                                                  Menu                                              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        Scanner inp = new Scanner(System.in);
        System.out.println(" 1.Checkh Students List");
        System.out.println(" 2.Log in as A Teacher Again");
        System.out.println(" 3.Log In as A Student Again");
        System.out.println(" 4.Exit");
        
        System.out.print("Enter Here: ");
        menuno = inp.nextInt();
        if(menuno==1){
        System.out.println("                                                   MLA");
        System.out.println("             "+teacherid1+"                                                               "+d.toString());
        System.out.println("             MAT 250                                                                      "+"Section 5");
        System.out.println("");
        System.out.println("   SL |         Name                                 |                                  ID              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        
        for(int i=0;i<coursesnum;i++)
        {
            if(Course[i].toUpperCase().contains("MAT 250"))
            System.out.printf(" %d          %s                                                                  %s               \n",(i+1),StudentName,id);   
        }
     
        }
        else if(menuno==2)
                Teacher();
        
        else if(menuno==3)
            student();
        
        else if(menuno==4)
            System.exit(0);   
    }
    public static void mdy()
    {
               System.out.println("                                                  Menu                                              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        Scanner inp = new Scanner(System.in);
        System.out.println(" 1.Checkh Students List");
        System.out.println(" 2.Log in as A Teacher Again");
        System.out.println(" 3.Log In as A Student Again");
        System.out.println(" 4.Exit");
        
        System.out.print("Enter Here: ");
        menuno = inp.nextInt();
        if(menuno==1){
        System.out.println("                                                   MDY");
        System.out.println("             "+teacherid1+"                                                               "+d.toString());
        System.out.println("             EEE 141                                                                     "+"Section 12");
        System.out.println("");
        System.out.println("   SL |         Name                                 |                                  ID              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        
        for(int i=0;i<coursesnum;i++)
        {
            if(Course[i].toUpperCase().contains("EEE 141"))
            System.out.printf(" %d          %s                                                                  %s               \n",(i+1),StudentName,id);   
        }     
        }
        else if(menuno==2)
                Teacher();
        
        else if(menuno==3)
            student();
        
        else if(menuno==4)
            System.exit(0); 
    }
    public static void srb()
    {
               System.out.println("                                                  Menu                                              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        Scanner inp = new Scanner(System.in);
        System.out.println(" 1.Checkh Students List");
        System.out.println(" 2.Log in as A Teacher Again");
        System.out.println(" 3.Log In as A Student Again");
        System.out.println(" 4.Exit");
        
        System.out.print("Enter Here: ");
        menuno = inp.nextInt();
        if(menuno==1){
        System.out.println("                                                   SRB");
        System.out.println("             "+teacherid1+"                                                               "+d.toString());
        System.out.println("             CSE 173                                                                      "+"Section 4");
        System.out.println("");
        System.out.println("   SL |         Name                                 |                                  ID              ");
        System.out.println(" ---------------------------------------------------------------------------------------------------");
        
        for(int i=0;i<coursesnum;i++)
        {
            if(Course[i].toUpperCase().contains("CSE 173"))
            System.out.printf(" %d          %s                                                                  %s               \n",(i+1),StudentName,id);   
        }
     
        }
        else if(menuno==2)
                Teacher();
        
        else if(menuno==3)
            student();
        
        else if(menuno==4)
            System.exit(0); 
    }

    }
  

