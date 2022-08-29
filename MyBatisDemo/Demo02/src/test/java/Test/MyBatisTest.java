package Test;

import dao.WorkerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.*;
import utils.MyBatisUtils;


import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class MyBatisTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        sqlSession = sqlSessionFactory.openSession();
    }
    @Test
    public void findAllStudentTest(){
        List<Student> list =
                sqlSession.selectList("pojo.Student.findAllStudent");
        for (Student student:list){
            System.out.println(student);
        }
    }

    @Test
    public void findCustomerByNameAndJobsTest(){
        Customer customer = new Customer();
        customer.setUsername("Jack");
        customer.setJobs("teacher");
        List<Customer> customers = sqlSession.selectList("mapper.CustomerMapper.findCustomerByNameAndJobs", customer);
        for (Customer customer1:customers){
            System.out.println(customer1);
        }
    }

    @Test
    public void findCustomerByNameOrJobsTest(){
        Customer customer = new Customer();
        customer.setUsername("Tom");
        customer.setJobs("teacher");
        List<Customer> customers = sqlSession.selectList("mapper.CustomerMapper.findCustomerByNameOrJobs", customer);
        for (Customer customer1:customers){
            System.out.println(customer1);
        }
    }

    @Test
    public void findCustomerByNameAndJobsG2Test(){
        Customer customer = new Customer();
        customer.setUsername("Jack");
        customer.setJobs("teacher");
        List<Customer> customers = sqlSession.selectList("mapper.CustomerMapper.findCustomerByNameAndJobsG2", customer);
        for (Customer customer1:customers){
            System.out.println(customer1);
        }
    }

    @Test
    public void findCustomerByNameAndJobsG3Test(){
        Customer customer = new Customer();
        customer.setUsername("Jack");
        customer.setJobs("teacher");
        List<Customer> customers = sqlSession.selectList("mapper.CustomerMapper.findCustomerByNameAndJobsG2", customer);
        for (Customer customer1:customers){
            System.out.println(customer1);
        }
    }

    @Test
    public void updateCustomerBySetTest(){
        Customer customer = new Customer();
        customer.setId(3);
        customer.setPhone("13311112222");
        int rows = sqlSession.update("mapper.CustomerMapper.updateCustomerBySet", customer);
        if (rows > 0){
            System.out.println("成功修改 " + rows + " 条数据.");
        }else {
            System.out.println("执行修改操作失败");
        }
    }

    @Test
    public void findByArrayTest(){
        Integer[] roleIds = {2, 3};
        List<Customer> customers = sqlSession.selectList("mapper.CustomerMapper.findByArray", roleIds);
        for (Customer customer:customers){
            System.out.println(customer);
        }
    }

    @Test
    public void findByListTest(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<Customer> customers = sqlSession.selectList("mapper.CustomerMapper.findByList", ids);
        for (Customer customer:customers){
            System.out.println(customer);
        }
    }

    @Test
    public void findByMapTest(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        Map<String, Object> conditionMap = new HashMap<String, Object>();
        conditionMap.put("id", ids);
        conditionMap.put("jobs", "teacher");
        List<Customer> customers = sqlSession.selectList("mapper.CustomerMapper.findByMap", conditionMap);
        for (Customer customer:customers){
            System.out.println(customer);
        }
    }

    @Test
    public void findPersonByIdTest(){
        Person person = sqlSession.selectOne("mapper.PersonMapper.findPersonById", 1);
        System.out.println(person.getCard());
    }

    @Test
    public void findPersonByIdG2Test(){
        Person person = sqlSession.selectOne("mapper.PersonMapper.findPersonByIdG2", 1);
        System.out.println(person);
    }

    @Test
    public void findUserWithOrdersByIdTest(){
        Users users = sqlSession.selectOne("mapper.UsersMapper.findUserWithOrdersById", 1);

        System.out.println(users);

    }
    @Test
    public void findOrdersTest(){
        Orders orders = sqlSession.selectOne("mapper.OrdersMapper.findOrdersWithProduct" ,1);
        System.out.println(orders);
    }

    @Test
    public void findOrdersG2Test(){
        Orders orders = sqlSession.selectOne("mapper.OrdersMapper.findOrdersWithProductG2" ,1);
        System.out.println(orders);
    }

    @Test
    public void findBookByIdTestG1(){
        System.out.println("*************第一次查询************");
        Book book = sqlSession.selectOne("mapper.BookMapper.findBookById", 1);
        System.out.println(book);

        Book updateBook = new Book();
        updateBook.setId(2);
        updateBook.setBookName("第二本书修改");
        sqlSession.update("mapper.BookMapper.updateBook", updateBook);

        System.out.println("*************第二次查询************");
        Book book1 = sqlSession.selectOne("mapper.BookMapper.findBookById", 1);
        System.out.println(book1.toString());
    }

    @Test
    public void findBookByIdTestG2(){
        SqlSession sqlSession1 = MyBatisUtils.getSession();

        System.out.println("*************第一次查询************");
        Book book = sqlSession1.selectOne("mapper.BookMapper.findBookById", 1);
        System.out.println(book);

        sqlSession1.close();

        Book updateBook = new Book();
        updateBook.setId(2);
        updateBook.setBookName("第二本书修改");
        SqlSession sqlSession3 = MyBatisUtils.getSession();
        sqlSession3.update("mapper.BookMapper.updateBook", updateBook);
        sqlSession3.commit();
        sqlSession3.close();

        System.out.println("*************第二次查询************");
        Book book1 = sqlSession.selectOne("mapper.BookMapper.findBookById", 1);
        System.out.println(book1);

    }

    @After
    public void destroy(){
        sqlSession.commit();
        sqlSession.close();
    }
}
