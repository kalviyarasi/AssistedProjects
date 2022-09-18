package incredents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	Cappucino c=ac.getBean(Cappucino.class);
    	c.typeOfCoffee();
    	c.rateOfCoffee();
    	System.out.println(c.getField());
    	System.out.println();//this is just to give a space
    	Xpreso x=ac.getBean(Xpreso.class);
    	x.rateOfCoffee();
    	x.typeOfCoffee();
    }
}
