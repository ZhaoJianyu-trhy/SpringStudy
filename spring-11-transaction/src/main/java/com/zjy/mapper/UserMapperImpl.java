package com.zjy.mapper;

import com.zjy.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    //现在所有操作都使用sqlSessionTemplate

    private SqlSessionTemplate sqlSessionTemplate;

    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.addUser(new User(5, "小李", "201609"));
        mapper.deleteUser(5);
        return mapper.selectUser();
    }

    public int addUser(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int deleteUser(int id) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
