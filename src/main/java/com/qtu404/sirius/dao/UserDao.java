package com.qtu404.sirius.dao;

import com.qtu404.sirius.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    protected SqlSession sqlSession;

    private String namespace = "User";

    public User findById(Long id) {
        return this.sqlSession.selectOne(this.sqlId("findById"), id);
    }

    public boolean create(User user) {
        return this.sqlSession.insert(this.sqlId("create"), user) == 1;
    }

    public String sqlId(String id) {
        return this.namespace + "." + id;
    }
}
