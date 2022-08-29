package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pojo.Person;
import utils.MyBatisUtils;

public class PersonMapperTest {
    private PersonMapper personMapper;
    SqlSession sqlSession;
    
    @Before
    public void setUp(){
        sqlSession = MyBatisUtils.getSession();
        personMapper = sqlSession.getMapper(PersonMapper.class);
    }

    @Test
    public void findPersonByIdTest(){
        Person person = personMapper.findPersonById(1);
        System.out.println(person);
    }

    @After
    public void release(){
        sqlSession.commit();
        sqlSession.close();
    }

}