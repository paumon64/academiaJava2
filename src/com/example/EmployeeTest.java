/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author paumon64
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee emp =  new  Employee();
        
        emp.setEmpId(1000);
        emp.setName("john smiths");
        emp.setSsn("pt234567");
        emp.setSalary(12000.00);
        
<<<<<<< HEAD
        Employee emp2 = new Manager (1002, "Joan Kern", "012-23-4567", 110450.54, "Sales");
          
        System.out.println("Nome empregado com dep name "+emp2.getDetails());
        
        
//        System.out.println("ID "+emp.getEmpId());
//        System.out.println("name  "+emp.getName());
//        System.out.println("SS number "+emp.getSsn());
//        System.out.println("salary "+emp.getSalary());
        
        System.out.println("Empregado "+emp.getDetails());

        emp.riseSalary(222.0);
        
        System.out.println("Employee new salary "+emp.getDetails());
        
        
=======
        emp.printEmployee();
        
        /**
        System.out.println("ID "+emp.getEmpId());
        System.out.println("name  "+emp.getName());
        System.out.println("SS number "+emp.getSsn());
        System.out.println("salary "+emp.getSalary());
        
        **/
        
        emp.riseSalary(222.0);
        
        System.out.println("new salary "+emp.getSalary());
        

>>>>>>> f2b9d453168e477cf2270e9bdfa80c8cb4dab032
        
        Manager mgr = new Manager ();
        
        mgr.setEmpId(99999);
        mgr.setName("Lois Lane");
        mgr.setSsn("us9876543");
        mgr.setSalary(100000.00);
        mgr.setDepName("marketing");
        
        /**
        System.out.print(mgr.getName());
<<<<<<< HEAD
        System.out.println(" manager of department "+mgr.getDepName());
        **/
=======
        System.out.println(" manager of department "+mgr.getDepName()); 
        
        **/
        
        mgr.printEmployee();
>>>>>>> f2b9d453168e477cf2270e9bdfa80c8cb4dab032
        
        System.out.println("Novo manager " +mgr.getDetails());
        
        Admin adm = new Admin();
        
        adm.setName("Siri");
        adm.setService("helpdesk");
        
        System.out.println(adm.getName()+" is at "+adm.getService());
        
        Director dir = new Director();
        
        dir.setName("Glen Jones");
        dir.setRegion("North");
        dir.setDepName("Sales");
        
<<<<<<< HEAD
        
        
        
        
     //   System.out.println("nome "+dir.getName()+" "+dir.getDepName()+" "+dir.getSalary());
        
=======
         dir.printEmployee();
>>>>>>> f2b9d453168e477cf2270e9bdfa80c8cb4dab032
        
       // System.out.println("nome "+dir.getName()+" "+dir.getDepName()+" "+dir.getSalary());
        
        // Test the EmployeeStockPlan class
        EmployeeStockPlan esp = new EmployeeStockPlan();
         
        printEmployee(adm, esp);
        printEmployee(mgr, esp);
        printEmployee(dir, esp);

    }

    public static void printEmployee(Employee emp) {
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan esp) {
        printEmployee (emp);
        System.out.println("Stock Options:   " + esp.grantStock(emp));
    }

    }
    

