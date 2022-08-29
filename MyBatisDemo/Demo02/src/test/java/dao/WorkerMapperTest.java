package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.Worker;
import utils.MyBatisUtils;

import static org.junit.Assert.*;

public class WorkerMapperTest {
    private WorkerMapper workerMapper;
    SqlSession sqlSession;
    
    @Before
    public void setUp(){
        sqlSession = MyBatisUtils.getSession();
        workerMapper = sqlSession.getMapper(WorkerMapper.class);
    }

    @Test
    public void findWorkerTest() {
        Worker worker = workerMapper.findWorker(1);
        System.out.println(worker);
    }

    @Test
    public void insertWorkTest() {
        Worker worker = new Worker();
        worker.setId(3);
        worker.setName("王五");
        worker.setAge(23);
        worker.setSex("男");
        worker.setWorkId(1003);

        int result = workerMapper.insertWorker(worker);
        if (result > 0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void updateWorkTest() {
        Worker worker = new Worker();
        worker.setId(3);
        worker.setName("王五");
        worker.setAge(23);
        worker.setSex("女");
        worker.setWorkId(1003);

        int result = workerMapper.updateWorker(worker);
        if (result > 0){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
    }
    @Test
    public void deleteWorker() {
        int result = workerMapper.deleteWorker(1);
        if (result > 0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }

    }

    @Test
    public void findWorkerByIdAndNameTest() {
        Worker worker = workerMapper.findWorkerByIdAndName(2, "李四");
        System.out.println(worker);
    }

    @After
    public void release(){
        sqlSession.commit();
        sqlSession.close();
    }

}