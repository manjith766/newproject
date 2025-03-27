package com.neoteric.DAcalculation;


import java.util.*;
import java.util.Calendar;

public class DBservice {
    Map<String, Employee> employeedata = new HashMap<>();
    Map<String, DAemp> employeDA = new HashMap<>();

    public Employee createemployee(Employee emp) {
        String empid = "emp" + UUID.randomUUID().toString();
        emp.setId(empid);
        employeedata.put(empid, emp);

        return emp;
    }

    public void addDAforemployee(String empid, DAemp dAemp) {
        employeDA.put(empid, dAemp);
    }

    public void EmployeeSalaries() {

        for (String empid : employeedata.keySet()) {
            Employee emp = employeedata.get(empid);

            Date joindate = emp.getDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(joindate);
            int joinYear = calendar.get(Calendar.YEAR);

            double salary = Double.parseDouble(emp.getSalary());  // Get base salary

            // Apply DA only for employees who joined before 2023
            if (joinYear < 2023) {
                DAemp daemp = employeDA.get(empid);  // Get DA details for the employee
                if (daemp != null) {
                    double percentage = Double.parseDouble(daemp.getPercentage());  // Get DA percentage
                    salary = salary + (salary * percentage);  // Calculate salary after DA
                }


            }

        }
    }
}