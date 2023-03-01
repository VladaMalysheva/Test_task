package com.example.test_task.data.entities;


import java.sql.Date;

public class KpacEntity {
    private int ID;
    private String Title;
    private String Description;
    private Date CreationDate;

    public KpacEntity(int ID, String title, String description, Date creationDate) {
        this.ID = ID;
        Title = title;
        Description = description;
        CreationDate = creationDate;
    }

    public KpacEntity(String title, String description, Date creationDate) {
        Title = title;
        Description = description;
        CreationDate = creationDate;
    }

    public KpacEntity() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    @Override
    public String toString() {
        return "KpacEntity{" +
                "ID=" + ID +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", CreationDate=" + CreationDate +
                '}';
    }
}
