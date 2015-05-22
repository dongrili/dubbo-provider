package dal.user.mapper;

import dal.user.domain.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by ldrs on 2015/5/21.
 */
public interface UserMapper {

    public List<User> getUsers(RowBounds rb);

    public int count();
}
