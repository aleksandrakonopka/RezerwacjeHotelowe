import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
        Rezerwacje rez1 = (Rezerwacje)context.getBean("rez1");
        System.out.println(rez1);
    }
}
