package com.piggsoft.restful.user.service.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.piggsoft.restful.user.service.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        User user = new User();
        user.setBirthday(LocalDateTime.now());
        user.setNickname("jesse");
        user.setPhone("15871717711");
        userMapper.insert(user);
    }

    @Test
    public void test2() {
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        userMapper.deleteById(users.get(0).getId());
    }

}