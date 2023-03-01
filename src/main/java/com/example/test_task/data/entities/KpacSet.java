package com.example.test_task.data.entities;

public class KpacSet {
    private int ID;
    private String Title;

    public KpacSet(int ID, String title) {
        this.ID = ID;
        Title = title;
    }

    public KpacSet(String title) {
        Title = title;
    }

    public KpacSet() {
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

    @Override
    public String toString() {
        return "KpacSet{" +
                "ID=" + ID +
                ", Title='" + Title + '\'' +
                '}';
    }
}
