package mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import pojo.User;

import java.io.InputStream;

import static org.junit.Assert.*;

public class UserMapperTest {
    UserMapper userMapper = null;
    SqlSession sqlSession = null;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, "test");

        sqlSession = sqlSessionFactory.openSession();

        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void findUserById() {
        User user = userMapper.findUserById(1);
        System.out.println(user.getUserName());
        sqlSession.close();
    }

    @Test
    public void findUserTotal() {
        Integer total = userMapper.findUserTotal();
        System.out.println("数据的总条数: " + total);
        sqlSession.close();
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUserName("王二");
        user.setUage(35);
        System.out.println("插入前 uid: " + user.getUid());
        userMapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("插入后 uid: " + user.getUid());
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUid(3);
        user.setUserName("麻子");
        user.setUage(45);
        userMapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        userMapper.deleteUser(3);
        sqlSession.commit();
        sqlSession.close();
    }
}