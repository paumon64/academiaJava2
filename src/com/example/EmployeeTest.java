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
        
        emp.setEmpID(1000);
        emp.setName("john smiths");
        emp.setSsn("pt234567");
        emp.setSalary(12000.00);
        
        emp.printEmployee();
        
        /**
        System.out.println("ID "+emp.getEmpId());
        System.out.println("name  "+emp.getName());
        System.out.println("SS number "+emp.getSsn());
        System.out.println("salary "+emp.getSalary());
        
        **/
        
        emp.riseSalary(222.0);
        
        System.out.println("new salary "+emp.getSalary());
        

        
        Manager mgr = new Manager ();
        
        mgr.setEmpID(99999);
        mgr.setName("Lois Lane");
        mgr.setSsn("us9876543");
        mgr.setSalary(100000.00);
        mgr.setDepName("marketing");
        
        /**
        System.out.print(mgr.getName());
        System.out.println(" manager of department "+mgr.getDepName()); 
        
        **/
        
        mgr.printEmployee();
        
        
        Admin adm = new Admin();
        
        adm.setName("Siri");
        adm.setService("helpdesk");
        
        System.out.println(adm.getName()+" is at "+adm.getService());
        
        Director dir = new Director();
        
        dir.setName("Glen Jones");
        dir.setRegion("North");
        dir.setDepName("Sales");
        
         dir.printEmployee();
        
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
    

