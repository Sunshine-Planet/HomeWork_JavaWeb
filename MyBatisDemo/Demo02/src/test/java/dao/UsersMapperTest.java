package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.Users;
import utils.MyBatisUtils;

public class UsersMapperTest {
    private UsersMapper usersMapper;
    SqlSession sqlSession;
    
    @Before
    public void setUp(){
        sqlSession = MyBatisUtils.getSession();
        usersMapper = sqlSession.getMapper(UsersMapper.class);
    }

    @Test
    public void findUserByIdTest(){
        Users users = usersMapper.findUserById(1);
        System.out.println(users);
    }

    @After
    public void release(){
        sqlSession.commit();
        sqlSession.close();
    }

}