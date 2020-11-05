package models;

import java.util.Date;

public class Person {
    private int Id;
    private String fullname;
    private Date date;
    private String number;

    public Person(int id, String fullname, Date date, String number) {
        Id = id;
        this.fullname = fullname;
        this.date = date;
        this.number = number;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return Id;
    }

    public String getFullname() {
        return fullname;
    }

    public Date getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }
}
