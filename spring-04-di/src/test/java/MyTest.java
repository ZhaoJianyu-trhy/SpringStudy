import com.zjy.pojo.Student;
import com.zjy.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user1 = context.getBean("user2", User.class);
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user2", User.class);
//        System.out.println(user1 == user2);
        System.out.println(user == user2);
    }
}
