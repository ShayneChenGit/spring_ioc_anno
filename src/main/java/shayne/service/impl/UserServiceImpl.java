package shayne.service.impl;

import shayne.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import shayne.service.UserService;

@Service("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Autowired //按照数据类型从Spring容器中进行匹配的
    @Qualifier("userDao")  //是按照id值从容器中进行匹配的 但是主要此处@Qualifier结合@Autowired一起使用
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }
}
