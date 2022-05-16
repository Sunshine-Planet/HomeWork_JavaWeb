package c18.dao.impl;

import c18.dao.IWorkerDAO;
import c18.vo.Worker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkerDAOImpl implements IWorkerDAO {
    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public WorkerDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean doCreate(Worker work) throws SQLException {
        boolean flag = false;
        String sql = "INSERT INTO worker (empno, ename, job, hiredate, sal) VALUES(?, ?, ?, ?, ?)";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1, work.getEmpno());
        this.pstmt.setString(2, work.getEname());
        this.pstmt.setString(3, work.getJob());
        this.pstmt.setDate(4, new java.sql.Date((work.getHiredate().getTime())));
        this.pstmt.setFloat(5, work.getSal());
        if (this.pstmt.executeUpdate() > 0){
            flag = true;
        }
        this.pstmt.close();
        return flag;
    }

    @Override
    public List<Worker> findAll(String keyWord) throws Exception {
        List<Worker> all = new ArrayList<Worker>();
        String sql = "SELECT empno, ename, job, hiredate, sal FROM worker WHERE ename LIKE ? OR job LIKE ?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, "%"+keyWord+"%");
        this.pstmt.setString(2, "%"+keyWord+"%");
        ResultSet rs = this.pstmt.executeQuery();
        Worker work = null;
        while (rs.next()){
            work = new Worker();
            work.setEmpno(rs.getInt(1));
            work.setEname(rs.getString(2));
            work.setJob(rs.getString(3));
            work.setHiredate(rs.getDate(4));
            work.setSal(rs.getFloat(5));
            all.add(work);
        }
        this.pstmt.close();
        return all;
    }

    @Override
    public Worker findById(int empno) throws Exception{
        Worker emp = null;
        String sql = "SELECT empno, ename, job, hiredate, sal FROM worker WHERE empno = ?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1, empno);
        ResultSet rs = this.pstmt.executeQuery();
        if (rs.next()){
            emp = new Worker();
            emp.setEmpno(rs.getInt(1));
            emp.setEname(rs.getString(2));
            emp.setJob(rs.getString(3));
            emp.setHiredate(rs.getDate(4));
            emp.setSal(rs.getFloat(5));
        }
        this.pstmt.close();
        return emp;
    }
}
