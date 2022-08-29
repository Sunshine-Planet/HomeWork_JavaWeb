package Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class UserTest {
    @Test
    public void findUserByIdTest(){
        String resources = "mybatis-config.xml";
        Reader reader = null;
        try{
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e){
            e.printStackTrace();
        }

        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlMapper.openSession();

        User user = session.selectOne("mapper.UserMapper.findUserById", 1);

        System.out.println(user.getUserName());
        //System.out.println(user);
        session.close();
    }

    @Test
    public void findUserTotalTest() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, "test");

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //Integer total = sqlSession.selectOne("pojo.User.findUserTotal");
        Integer total = sqlSession.selectOne("mapper.UserMapper.findUserTotal");
        System.out.println("数据的总条数: "+total);
        sqlSession.close();
    }
}
