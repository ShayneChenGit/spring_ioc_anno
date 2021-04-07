package shayne.dao.impl;

import shayne.dao.UserDao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")
@Getter
@Setter
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
