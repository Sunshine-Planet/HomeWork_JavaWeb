package c18.dao.test;

import c18.factory.DAOFactory;
import c18.vo.Worker;

import java.util.Iterator;
import java.util.List;

public class TestfindAll {
    public static void main(String args[]) throws Exception {
        List<Worker> all = DAOFactory.getIWorkerDAOInstance().findAll("");
        Iterator<Worker> iter = all.iterator();
        while (iter.hasNext()) {
            Worker work = iter.next();
            System.out.println(
                    work.getEmpno() + ", " +
                            work.getEname() + ", " +
                            work.getJob() + ", " +
                            work.getHiredate() + ", " +
                            work.getSal());
        }
    }
}
