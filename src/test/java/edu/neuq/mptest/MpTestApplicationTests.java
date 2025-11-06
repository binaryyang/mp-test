package edu.neuq.mptest;

import edu.neuq.mptest.domain.User;
import edu.neuq.mptest.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpTestApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectById() {
        System.out.println(userMapper.selectById(3));
    }

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
