import com.zjy.dao.UserDaoImpl;
import com.zjy.dao.UserDaoMysqlImpl;
import com.zjy.service.UserService;
import com.zjy.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用业务层，DAO层不需要接触
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
