package c18.factory;

import c18.dao.IWorkerDAO;
import c18.dao.proxy.WorkerDAOProxy;

public class DAOFactory {
    public static IWorkerDAO getIWorkerDAOInstance() throws Exception{
        return new WorkerDAOProxy();
    }
}
