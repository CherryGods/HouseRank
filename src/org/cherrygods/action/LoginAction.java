package org.cherrygods.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.SessionAware;
import org.cherrygods.entity.Users;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Map;

/**
 * 验证用户信息
 *
 * @author CherryGods
 * @date 2017年12月2日
 */
public class LoginAction implements Action,SessionAware {
    private Users users = new Users();
    private Map map;
    @Override
    public void setSession(Map<String, Object> map) {
        this.map=map;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String execute() throws Exception {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session  = factory.openSession();
        String hql = "from Users where name=:name and password=:password";
        Query query = session.createQuery(hql);
        query.setParameter("name",users.getName());
        query.setParameter("password",users.getPassword());
        if(query.list()!=null){
            System.out.println("input");
            return SUCCESS;
        }else{
            System.out.println("out");
            return ERROR;
        }
    }
}
