package io.zipcoder.persistenceapp.models;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String mobile;
    @Column(name = "birthday")
    private Date birthDay;
    private long homeId;

    public Person(long id, String firstName, String lastName, String mobile, Date birthDay, long homeId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.birthDay = birthDay;
        this.homeId = homeId;
    }

    public Person(String firstName, String lastName, String mobile, Date birthDay, long homeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.birthDay = birthDay;
        this.homeId = homeId;
    }

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthdate) {
        this.birthDay = birthdate;
    }

    public long getHomeId() {
        return homeId;
    }

    public void setHomeId(long homeId) {
        this.homeId = homeId;
    }
}
