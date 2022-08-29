package Test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Category;
import utils.MyBatisUtils;

public class MyBatisTest {
    @Test
    public void findCategoryWithProductTest(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Category category = sqlSession.selectOne("mapper.CategoryMapper.findCategoryWithProduct", 2);
        System.out.println(category);
        sqlSession.commit();
        sqlSession.close();
    }
}
