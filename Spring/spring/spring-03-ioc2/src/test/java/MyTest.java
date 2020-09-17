import com.small.pojo.User;
import com.small.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //Spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();
        User user2 = (User) context.getBean("abcd");
        System.out.println(user==user2);

        UserT userT = (UserT) context.getBean("userT2");
        userT.show();


    }
}
