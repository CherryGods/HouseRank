package org.cherrygods.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.SessionAware;
import org.cherrygods.entity.House;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Map;

public class DeleteHouseAction implements Action, SessionAware {
    private Map map;
    private House house = new House();

    @Override
    public String execute() throws Exception {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        House houses = new House();
        System.out.println(house.getId());
        houses.setId(house.getId());
        session.delete(houses);
        transaction.commit();
        return SUCCESS;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        map = session;
    }
}
