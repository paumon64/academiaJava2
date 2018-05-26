/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.text.NumberFormat;

/**
 *
 * @author paumon64
 */
public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;
    private BenefitsHelper helper = new BenefitsHelper();

    public Employee() {
        super();
    }

    public Employee(int empId, String name, String ssn, double salary) {

        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void changeName(String newName) {

        if (newName != null) {
            this.name = newName;
        }
    }

    public void riseSalary(double increase) {

        if (increase > 0) {
            this.salary += increase;
        }
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWitholding() {
        return helper.calcWitholding(salary);
    }

    public double getBonus() {
        return helper.calcBonus(salary);
    }

    public String getDetails() {

        return "Employee ID:     " + getEmpId() + "\n"
                + "Employee Name:   " + getName() + "\n"
                + "Employee SSN:    " + getSsn() + "\n"
                + "Employee Salary: " + NumberFormat.getCurrencyInstance().format(getSalary());

    }

    public void printEmployee() {

        System.out.println(); // Print a blank line as a separator
        // Print out the data in this Employee object
        System.out.println("Employee id:         " + getEmpId());
        System.out.println("Employee name:       " + getName());
        System.out.println("Employee SSN:  " + getSsn());
        System.out.println("Employee salary:     " + getSalary());
    }

    private class BenefitsHelper {

        private final double bonusRate = 0.02;
        private final double witholdingRate = 0.07;

        protected double calcBonus(double salary) {
            return salary * bonusRate;
        }

        protected double calcWitholding(double salary) {
            return salary * witholdingRate;
        }

    }

}
