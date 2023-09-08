/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javasql_ex6;

import Model.Student;
import Model.StudentTable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Phoom1645
 */

/* 64050191 Phoomrapee Srifah */
public class JavaSQL_Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std1 = new Student(1, "John", 4.0);
        Student std2 = new Student(2, "Marry", 2.0);
        
        //Create Data
        StudentTable.insertStudent(std1);
        StudentTable.insertStudent(std2);
        
        //Update Data
        Student std3 = new Student(1, "Phoom", 3.0);
        Student std4 = new Student(2, "Girl", 4.0);
        StudentTable.updateStudent(std3);
        StudentTable.updateStudent(std4);
        
        //Delete Data
        StudentTable.removeStudent(std3);
        StudentTable.removeStudent(std4);
        
        //Show on terminal
//        List<Student> stdList = StudentTable.findAllStudent();
//        printAllStudent(stdList);
    }
    
    public static void printAllStudent(List<Student> studentList) {
        for(Student std : studentList) {
           System.out.print(std.getId() + " ");
           System.out.print(std.getName() + " ");
           System.out.println(std.getGpa() + " ");
       }
    }
    
    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaSQL_Ex6PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
