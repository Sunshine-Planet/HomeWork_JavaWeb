package Test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Employee;
import utils.MyBatisUtils;

public class MyBatisTest {

    @Test
    public void findEmployeeByIdTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();

        Employee employee = sqlSession.selectOne("mapper.EmployeeMapper.findEmployeeById", 1);
        System.out.println(employee);
        sqlSession.close();
    }
    @Test
    public void addEmployeeTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Employee employee = new Employee();
        employee.setName("张提");
        employee.setAge(34);
        employee.setPosition("经理");
        sqlSession.selectOne("mapper.EmployeeMapper.addEmployee", employee);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateEmployeeByIdTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Employee employee = new Employee();
        employee.setId(4);
        employee.setName("张提");
        employee.setAge(34);
        employee.setPosition("主管");
        sqlSession.selectOne("mapper.EmployeeMapper.updateEmployeeById", employee);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteEmployeeByIdTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();

        sqlSession.selectOne("mapper.EmployeeMapper.deleteEmployeeById", 4);
        sqlSession.commit();
        sqlSession.close();
    }
}
