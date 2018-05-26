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
        
        Employee emp2 = new Manager (1002, "Joan Kern", "012-23-4567", 110450.54, "Sales");
          
        System.out.println("Nome empregado com dep name "+emp2.getDetails());
        
        
//        System.out.println("ID "+emp.getEmpId());
//        System.out.println("name  "+emp.getName());
//        System.out.println("SS number "+emp.getSsn());
//        System.out.println("salary "+emp.getSalary());
        
        System.out.println("Empregado "+emp.getDetails());

        emp.riseSalary(222.0);
        
        System.out.println("Employee new salary "+emp.getDetails());
        
        
        
        Manager mgr = new Manager ();
        
        mgr.setEmpId(99999);
        mgr.setName("Lois Lane");
        mgr.setSsn("us9876543");
        mgr.setSalary(100000.00);
        mgr.setDepName("marketing");
        
        /**
        System.out.print(mgr.getName());
        System.out.println(" manager of department "+mgr.getDepName());
        **/
        
        System.out.println("Novo manager " +mgr.getDetails());
        
        Admin adm = new Admin();
        
        adm.setName("Siri");
        adm.setService("helpdesk");
        
        System.out.println(adm.getName()+" is at "+adm.getService());
        
        
        Director dir = new Director();
        
        dir.setName("glen jones");
        dir.setRegion("north");
        dir.setDepName("Sales");
        
        
        
        
        
     //   System.out.println("nome "+dir.getName()+" "+dir.getDepName()+" "+dir.getSalary());
        
        

    }
    
}
