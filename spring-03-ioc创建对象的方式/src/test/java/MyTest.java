import com.zjy.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        User user = new User();
        ApplicationContext beans = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) beans.getBean("uu");
        user.show();
    }
}
