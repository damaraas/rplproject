package springhibernate;

import springhibernate.service.BarangService;
import springhibernate.view.BarangView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
    System.out.println("Initializing application context");
    applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
    new BarangView().setVisible(true);
}

public static BarangService getBarangService() {
    System.out.println("Getting BarangService from the application context");
    return (BarangService) applicationContext.getBean("BarangService");
}


}