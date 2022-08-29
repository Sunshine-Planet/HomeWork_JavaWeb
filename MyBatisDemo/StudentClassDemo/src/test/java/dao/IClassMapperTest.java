package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.IClass;
import utils.MyBatisUtils;

public class IClassMapperTest {
    private SqlSession sqlSession;
    private IClassMapper iClassMapper;

    @Before
    public void setUp() throws Exception {
        sqlSession = MyBatisUtils.getSession();
        iClassMapper = sqlSession.getMapper(IClassMapper.class);
    }

    @Test
    public void findStudentTest() {

        System.out.println();
    }


    @Test
    public void findClassByIdTest(){
        IClass iClass = iClassMapper.findClassById(2);
        System.out.println(iClass);
    }


    @After
    public void release(){
        sqlSession.commit();
        sqlSession.close();
    }
}