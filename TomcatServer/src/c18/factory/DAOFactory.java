package c18.factory;

import c18.dao.IWorkerDAO;
import c18.dao.proxy.WorkerDAOProxy;
import c19.dao.IUserDAO;
import c19.dao.proxy.UserDAOProxy;

public class DAOFactory {
    public static IWorkerDAO getIWorkerDAOInstance() throws Exception{
        return new WorkerDAOProxy();
    }

    public static IUserDAO getIUserDAOInstance() throws Exception {
        return new UserDAOProxy();
    }
}
