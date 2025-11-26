package edu.neuq.mptest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.neuq.mptest.domain.User;
import edu.neuq.mptest.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

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

    @Test
    public void testWrapper() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>()
                .allEq(Map.of(User::getId, 3, User::getName, "happy"));
        List<User> users = userMapper.selectList(lambdaQueryWrapper);
        System.out.println(users);
    }

    @Test
    public void testWrapper2() {
        LambdaQueryWrapper<User> qw = new QueryWrapper<User>().lambda()
                .ge(User::getId, 3)
                .last("limit 1");

        User user = userMapper.selectOne(qw);
        System.out.println(user);
    }

    @Test
    public void testWrapper3() {
        QueryWrapper<User> qw = new QueryWrapper<User>()
                .ge("id", 3)
                .eq("name", "happy")
                .last("limit 1");

        userMapper.selectList(qw);
    }

}
