import com.small.pojo.Student;
import com.small.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getAddress());
        System.out.println(student.toString());
    }

    @Test
    public  void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user1 = context.getBean("user2", User.class);
        System.out.println(user1);
        User user2 = context.getBean("user2", User.class);

        System.out.println(user1==user2);
    }
}
