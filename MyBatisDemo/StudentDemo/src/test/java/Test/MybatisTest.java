package Test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Student;
import utils.MyBatisUtils;

import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
    @Test
    public void findStudentByNameAndMajorTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Student student = new Student();
        student.setName("张三");
        student.setMajor("英语");
        List<Student> students = sqlSession.selectList("mapper.StudentMapper.findStudentByNameAndMajor", student);
        for (Student student1:students){
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void findByListTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        List<Integer> ids = new ArrayList<Integer>();
        for(int i = 1; i < 5; i++){
            ids.add(i);
        }
        List<Student> students = sqlSession.selectList("mapper.StudentMapper.findByList", ids);
        for (Student student:students){
            System.out.println(student);
        }
        sqlSession.close();
    }
}
