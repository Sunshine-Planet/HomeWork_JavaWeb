package c18.dao.proxy;

import c18.dao.IWorkerDAO;
import c18.dao.impl.WorkerDAOImpl;
import c18.dbc.DatabaseConnection;
import c18.vo.Worker;

import java.sql.SQLException;
import java.util.List;

public class WorkerDAOProxy implements IWorkerDAO {

    private DatabaseConnection db = null;
    private IWorkerDAO dao = null;

    public WorkerDAOProxy() throws Exception {
        this.db = new DatabaseConnection();
        this.dao = new WorkerDAOImpl(this.db.getConnection());
    }

    @Override
    public boolean doCreate(Worker work) throws Exception {
        boolean flag = false;
        try {
        if (this.dao.findById(work.getEmpno()) == null){
            flag = this.dao.doCreate(work);
        }
        }catch (Exception e) {
            throw e;
        }finally {
            this.db.close();
        }
        return flag;
    }

    @Override
    public List<Worker> findAll(String keyWord) throws Exception {
        List<Worker> all = null;
        try {
        all = this.dao.findAll(keyWord);
        }catch (Exception e){
            throw e;
        }finally {
            this.db.close();
        }
        return all;
    }

    @Override
    public Worker findById(int empno) throws Exception {
        Worker emp = null;
        try {
            emp = this.dao.findById(empno);
        }catch (Exception e){
            throw e;
        }finally {
            this.db.close();
        }
        return emp;
    }
}
