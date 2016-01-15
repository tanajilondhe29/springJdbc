package com.tml.spring.jdbc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tml.spring.jdbc.dao.Employee;
import com.tml.spring.jdbc.dao.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {
        System.out.println( "Hello World!" );
        
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("empDAO");
        
        Employee employee = new Employee(23, "John", "Pune");
        Employee emplNew2 = new Employee(22, "Mark", "Mumbai");
        
        employeeDAO.insert(employee);
        
        System.out.println("Done.");
    }
}
