package c18.dao;

import c18.vo.Worker;

import java.sql.SQLException;
import java.util.List;

public interface IWorkerDAO {
    public boolean doCreate(Worker work) throws Exception;
    public List<Worker> findAll(String keyWord) throws Exception;
    public Worker findById(int empno) throws Exception;
}
