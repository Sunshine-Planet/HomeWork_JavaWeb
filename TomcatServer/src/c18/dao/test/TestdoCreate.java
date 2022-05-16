package c18.dao.test;

import c18.factory.DAOFactory;
import c18.vo.Worker;

public class TestdoCreate {
    public static void main(String[] args) throws Exception {
        Worker work = new Worker();
        work.setEmpno(1000);
        work.setEname("SMILE");
        work.setJob("程序员");
        work.setHiredate(new java.util.Date());
        work.setSal(10000);
        DAOFactory.getIWorkerDAOInstance().doCreate(work);
    }
}
