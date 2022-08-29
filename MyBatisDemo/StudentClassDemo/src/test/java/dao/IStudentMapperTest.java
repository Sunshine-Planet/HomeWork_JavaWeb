package dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.IStudent;
import utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class IStudentMapperTest {
    private SqlSession sqlSession;
    private IStudentMapper iStudentMapper;

    @Before
    public void setUp() throws Exception {
        sqlSession = MyBatisUtils.getSession();
        iStudentMapper = sqlSession.getMapper(IStudentMapper.class);
    }

    @Test
    public void findStudentTest() {
        IStudent iStudent = iStudentMapper.findStudent(2);
        System.out.println(iStudent);
    }

    @Test
    public void updateStudentTest() {
        IStudent iStudent = new IStudent();
        iStudent.setId(4);
        iStudent.setName("李雷");
        iStudent.setAge(19);
        int result = iStudentMapper.updateStudent(iStudent);
        if (result > 0){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
    }

    @After
    public void release(){
        sqlSession.commit();
        sqlSession.close();
    }
}