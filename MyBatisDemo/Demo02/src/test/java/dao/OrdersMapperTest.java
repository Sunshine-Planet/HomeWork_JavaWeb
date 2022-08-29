package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.Orders;
import utils.MyBatisUtils;

public class OrdersMapperTest {
    private OrdersMapper ordersMapper;
    SqlSession sqlSession;
    
    @Before
    public void setUp(){
        sqlSession = MyBatisUtils.getSession();
        ordersMapper = sqlSession.getMapper(OrdersMapper.class);
    }

    @Test
    public void findOrdersByIdTest(){
        Orders orders = ordersMapper.findOrdersById(1);
        System.out.println(orders);
    }

    @After
    public void release(){
        sqlSession.commit();
        sqlSession.close();
    }

}