package com.neoteric.DAcalculation;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        DBservice dBservice = new DBservice();


        Employee emp1 = new Employee("ram", "552256556", "600025522","2005/02/22","emp1");
        Employee emp2 = new Employee("ramu","22556633","5000","2023/02/20","emp2");

        dBservice.createemployee(emp1);
        dBservice.createemployee(emp2);

        DAemp dAemp1 = new DAemp("2018/02/20","12.0");
        DAemp dAemp2 = new DAemp("2023/02/20","10.0");

        dBservice.addDAforemployee(emp1.getEmpid(), dAemp1);
        dBservice.addDAforemployee(emp2.getEmpid(), dAemp2);

        // Calculate and display salaries
        dBservice.EmployeeSalaries();

        System.out.println(dAemp1);
        System.out.println(dAemp2);
        System.out.println(emp1);
        System.out.println(emp2);
}
}





