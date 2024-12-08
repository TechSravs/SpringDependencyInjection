package com.showroom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.showroom.entity.Engine;
import com.showroom.entity.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
//        Vehicle v1=new Vehicle();
//        v1.setVno("kA RT 9999 CF");
//        v1.setName("Yamaha");
//        //inject the object in setter-setter injection
//        Engine e1=new Engine("yamaha 7686", "125cc");
//        v1.setEngine(e1);
//        
//        
//        System.out.println(v1.getVno());
//        System.out.println(v1.getName());
//        System.out.println(v1.getEngine().getModel());
//        System.out.println(v1.getEngine().getCapacity());
//  //injecting enginr object in constructor -contructor injection      
//        Vehicle v2=new Vehicle("TN RT 0000 DF","Yamaha", new Engine("yamaha 4353","100cc") );
//        System.out.println(v2.getVno());
//        System.out.println(v2.getName());
//        System.out.println(v2.getEngine().getModel());
//        System.out.println(v2.getEngine().getCapacity());
        
    	
    	/* example of dependency injection in spring */
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle v = (Vehicle) context.getBean("v1");
    	System.out.println(v.getVno());
    	System.out.println(v.getName());
    	System.out.println(v.getEngine().getModel());
    	System.out.println(v.getEngine().getCapacity());
    	
   }
}
