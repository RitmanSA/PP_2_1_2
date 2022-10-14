import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld newBean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat FirstCat = (Cat) applicationContext.getBean("cat");
        Cat SecondCat = (Cat) applicationContext.getBean("cat");

        System.out.println("beans have the same adress: " + (bean == newBean));
        System.out.println("Cats have the same adress: " + (FirstCat == SecondCat));


    }
}