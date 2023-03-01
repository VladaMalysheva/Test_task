package com.example.test_task.data.entities;

public class KpacRelation {

    private int ID;
    private int KpacSetID;
    private int KpacEntityID;

    public KpacRelation(int kpacSetID, int kpacEntityID) {
        KpacSetID = kpacSetID;
        KpacEntityID = kpacEntityID;
    }

    public KpacRelation(int ID, int kpacSetID, int kpacEntityID) {
        this.ID = ID;
        KpacSetID = kpacSetID;
        KpacEntityID = kpacEntityID;
    }

    public KpacRelation() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getKpacSetID() {
        return KpacSetID;
    }

    public void setKpacSetID(int kpacSetID) {
        KpacSetID = kpacSetID;
    }

    public int getKpacEntityID() {
        return KpacEntityID;
    }

    public void setKpacEntityID(int kpacEntityID) {
        KpacEntityID = kpacEntityID;
    }

    @Override
    public String toString() {
        return "KpacRelations{" +
                "ID=" + ID +
                ", KpacSetID=" + KpacSetID +
                ", KpacEntityID=" + KpacEntityID +
                '}';
    }
}
