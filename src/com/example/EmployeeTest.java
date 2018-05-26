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

        Employee emp = new Employee();

        emp.setEmpId(1000);
        emp.setName("john smiths");
        emp.setSsn("pt234567");
        emp.setSalary(12000.00);

        Employee emp2 = new Manager(1002, "Joan Kern", "012-23-4567", 110450.54, "Sales");

        System.out.println("Employee name and Dept. name " + emp2.getDetails());

//        System.out.println("ID "+emp.getEmpId());
//        System.out.println("name  "+emp.getName());
//        System.out.println("SS number "+emp.getSsn());
//        System.out.println("salary "+emp.getSalary());
        System.out.println("Employee " + emp.getDetails());

        emp.riseSalary(222.0);

        System.out.println("Employee new salary " + emp.getDetails());

        emp.printEmployee();

        /**
         * System.out.println("ID "+emp.getEmpId()); System.out.println("name
         * "+emp.getName()); System.out.println("SS number "+emp.getSsn());
         * System.out.println("salary "+emp.getSalary());
         *
         *
         */
        emp.riseSalary(222.0);

        System.out.println("New salary " + emp.getSalary());

        Manager mgr = new Manager();

        mgr.setEmpId(99999);
        mgr.setName("Lois Lane");
        mgr.setSsn("US9876543");
        mgr.setSalary(100000.00);
        mgr.setDepName("Marketing");

        /**
         * System.out.print(mgr.getName()); <<<<<<< HEAD System.out.println("
         * manager of department "+mgr.getDepName());
         *
         */
        System.out.println("Manager of department " + mgr.getDepName());

        mgr.printEmployee();

        System.out.println("New Manager " + mgr.getDetails());

        Admin adm = new Admin();
        adm.setName("Siri");
        adm.setService("helpdesk");
        System.out.println(adm.getName() + " is at " + adm.getService());

        Director dir = new Director(5005, "Susan Wheeler", "099-45-2340", 120567.36, "Global Marketing", "Southwest");

//        dir.setName("Glen Jones");
//        dir.setRegion("North");
//        dir.setDepName("Sales");
        System.out.println("Novo director " + dir.getDetails());

        //   System.out.println("nome "+dir.getName()+" "+dir.getDepName()+" "+dir.getSalary());
        dir.printEmployee();

        // System.out.println("nome "+dir.getName()+" "+dir.getDepName()+" "+dir.getSalary());
        // Test the EmployeeStockPlan class
        EmployeeStockPlan esp = new EmployeeStockPlan();
        printEmployee(adm, esp);
        printEmployee(mgr, esp);
        printEmployee(dir, esp);
        printEmployee(emp, esp);
        printEmployee(emp2, esp);
        
                
        
        // up and down cast 
        
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Employee emp3 = new Employee(13, "Lionel Power", "099-90-6789", 67_990.90);
        Employee obj = new Engineer(102, "Robert Stock", "012-54-7812", 220_345.27);

        eng.engineerMethod();
        //printEmployee(obj);
        printEmployee(eng,esp);

        
    }

    public static void printEmployee(Employee emp) {
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp); // imprime objecto e endereco de memoria
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan esp) {
        printEmployee(emp);
        System.out.println("Stock Options:   " + esp.grantStock(emp));
    }

    
}
