package c18.dao;

import c18.vo.Worker;

import java.sql.SQLException;
import java.util.List;

public interface IWorkerDAO {
    public boolean doCreate(Worker worker) throws SQLException;
    public List<Worker> findAll(String keyWord);
    public Worker findById(int empno);
}
