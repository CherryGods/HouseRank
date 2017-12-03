package org.cherrygods.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.SessionAware;
import org.cherrygods.entity.House;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Map;

/**
 * 显示房屋信息
 *
 * @author CherryGods
 * @date 2017年12月3日
 */
public class ShowHouseAction implements Action,SessionAware{
    private Map map;
    @Override
    public String execute() throws Exception {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        List<House> houses = session.createQuery("from House").list();
        map.put("house",houses);
        if(houses.size()>0){
            return SUCCESS;
        }
            return ERROR;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        map=session;
    }
}
