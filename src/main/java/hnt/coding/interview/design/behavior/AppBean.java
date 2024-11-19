package hnt.coding.interview.design.behavior;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "hnt.coding")
public class AppBean {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppBean.class);
        MyBean myBean = context.getBean(MyBean.class);
        System.out.println(myBean.getAge());
    }
}
