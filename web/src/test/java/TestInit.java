import dal.user.domain.User;
import dal.user.mapper.UserMapper;
import im.dubbo.service.CountService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

/**
 * Created by ldrs on 2015/4/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/application-context.xml"})
public class TestInit {

    @Autowired
    private CountService countService;

    @Test
    public void init() throws IOException {
        System.out.print("init");
        System.out.println(countService.getCount(3));
       // System.in.read();
    }


    @Autowired
    UserMapper userMapper;



    @Test
    public void getUsers(){
        RowBounds rb = new RowBounds(5,10);
       List<User> users = userMapper.getUsers(rb);
        System.out.println(users);

    }
}
