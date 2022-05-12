package c18.dao.impl;

import c18.dao.IWorkerDAO;
import c18.vo.Worker;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class WorkerDAOImpl implements IWorkerDAO {
    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public WorkerDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean doCreate(Worker worker) throws SQLException {
        boolean flag = false;
        String sql = "INSERT INTO worker (empno, ename, job, hiredate, sal) VALUES(?, ?, ?, ?, ?)";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1, worker.getEmpno());
        this.pstmt.setString(2, worker.getEname());
        this.pstmt.setString(3, worker.getJob());
        this.pstmt.setDate(4, (Date) worker.getHiredate());
        this.pstmt.setFloat(5, worker.getSal());
        if (this.pstmt.executeUpdate() > 0){
            flag = true;
        }
        this.pstmt.close();
        return flag;
    }

    @Override
    public List<Worker> findAll(String keyWord) {
        return null;
    }

    @Override
    public Worker findById(int empno) {
        return null;
    }
}
