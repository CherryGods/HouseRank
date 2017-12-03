package org.cherrygods.entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class House {
    private Long id;
    private String title;
    private String description;
    private Long price;
    private Time pubdate;
    private Long floorage;
    private String contact;
    private Users usersByUserId;
    private Type typeByTypeId;
    private Street streetByStreetId;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 2000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "PRICE", nullable = true, precision = 2)
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Basic
    @Column(name = "PUBDATE", nullable = true)
    public Time getPubdate() {
        return pubdate;
    }

    public void setPubdate(Time pubdate) {
        this.pubdate = pubdate;
    }

    @Basic
    @Column(name = "FLOORAGE", nullable = true, precision = 2)
    public Long getFloorage() {
        return floorage;
    }

    public void setFloorage(Long floorage) {
        this.floorage = floorage;
    }

    @Basic
    @Column(name = "CONTACT", nullable = true, length = 100)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (id != null ? !id.equals(house.id) : house.id != null) return false;
        if (title != null ? !title.equals(house.title) : house.title != null) return false;
        if (description != null ? !description.equals(house.description) : house.description != null) return false;
        if (price != null ? !price.equals(house.price) : house.price != null) return false;
        if (pubdate != null ? !pubdate.equals(house.pubdate) : house.pubdate != null) return false;
        if (floorage != null ? !floorage.equals(house.floorage) : house.floorage != null) return false;
        if (contact != null ? !contact.equals(house.contact) : house.contact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (pubdate != null ? pubdate.hashCode() : 0);
        result = 31 * result + (floorage != null ? floorage.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "TYPE_ID", referencedColumnName = "ID")
    public Type getTypeByTypeId() {
        return typeByTypeId;
    }

    public void setTypeByTypeId(Type typeByTypeId) {
        this.typeByTypeId = typeByTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "STREET_ID", referencedColumnName = "ID")
    public Street getStreetByStreetId() {
        return streetByStreetId;
    }

    public void setStreetByStreetId(Street streetByStreetId) {
        this.streetByStreetId = streetByStreetId;
    }
}
