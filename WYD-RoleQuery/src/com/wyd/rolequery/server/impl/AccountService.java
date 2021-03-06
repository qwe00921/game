package com.wyd.rolequery.server.impl;
import java.util.List;
import org.springframework.context.ApplicationContext;
import com.wyd.rolequery.bean.Empireaccount;
import com.wyd.rolequery.dao.IAccountDao;
import com.wyd.rolequery.server.IAccountService;
import com.wyd.db.service.impl.UniversalManagerImpl;
/**
 * The service class for the TabExtensionUser entity.
 */
public class AccountService extends UniversalManagerImpl implements IAccountService {
    /**
     * The dao instance injected by Spring.
     */
    private IAccountDao         dao;
    /**
     * The service Spring bean id, used in the applicationContext.xml file.
     */
    private static final String SERVICE_BEAN_ID = "AccountService";

    public AccountService() {
        super();
    }

    /**
     * Returns the singleton <code>IExtensionUserService</code> instance.
     */
    public static IAccountService getInstance(ApplicationContext context) {
        return (IAccountService) context.getBean(SERVICE_BEAN_ID);
    }

    /**
     * Called by Spring using the injection rules specified in the Spring beans file "applicationContext.xml".
     */
    public void setDao(IAccountDao dao) {
        super.setDao(dao);
        this.dao = dao;
    }

    public IAccountDao getDao() {
        return this.dao;
    }

    @Override
    public List<Empireaccount> getEmpireaccount(String userId, String serviceId) {
        return this.dao.getEmpireaccount(userId, serviceId);
    }
}