package edu.neuq.mptest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.neuq.mptest.domain.User;
import edu.neuq.mptest.service.UserService;
import edu.neuq.mptest.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author panda
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-10-14 23:56:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




