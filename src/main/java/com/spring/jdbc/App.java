package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
        System.out.println( "myprogram is started.." );
        // spring -> jdbcTemplate
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template =  context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        String query= "insert into student(id,name,city) value(?,?,?)";
        int result= template.update(query,456,"uttam","kanpur");
        System.out.println(result);
        ;
        
    }
}
