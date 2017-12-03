package org.cherrygods.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.SessionAware;
import org.cherrygods.entity.House;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Map;

/**
 * 修改房屋信息
 * @author CherryGods
 * @date 2017年12月3日
 */
public class UpdateHouseInfo implements Action, SessionAware {
    private Map map;
    private House house = new House();
    @Override
    public String execute() throws Exception {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.update("update House set USER_ID=?,TYPE_ID=?,TITLE=?,DESCRIPTION=?,PRICE=?,PUBDATE=?,FLOORAGE=?,CONTACT=?,STREET_ID=? WHERE ID=? ");
        
        return null;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        map = session;
    }
}
