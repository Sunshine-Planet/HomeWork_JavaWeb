package c22.test;

import c22.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void findCustomerByIdTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = sqlSession.selectOne("c22.mapper.CustomerMapper.findCustomerById", "1");
        System.out.println(customer.toString());
        sqlSession.close();
    }

    @Test
    public void addCustomerTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = new Customer();
        customer.setId("4");
        customer.setName("four");
        customer.setJob("student");
        customer.setPhone("777777");
        int rows = sqlSession.insert("c22.mapper.CustomerMapper.addCustomer", customer);
        if (rows > 0) {
            System.out.println("成功插入 " + rows + " 条数据");
        }else {
            System.out.println("插入数据失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateCustomerTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Customer customer = new Customer();
        customer.setId("4");
        customer.setName("five");
        customer.setJob("laywer");
        customer.setPhone("888888");
        int rows = sqlSession.update("c22.mapper.CustomerMapper.updateCustomer", customer);
        if (rows > 0) {
            System.out.println("成功修改 " + rows + " 条数据");
        }else {
            System.out.println("更新数据失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteCustomerTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int rows = sqlSession.delete("c22.mapper.CustomerMapper.deleteCustomer", "4");
        if (rows > 0) {
            System.out.println("成功删除 " + rows + " 条数据");
        }else {
            System.out.println("删除数据失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
