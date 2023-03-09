package com.example.test_task.data.daoInterfaces;

import com.example.test_task.data.entities.KpacSet;

import java.util.List;

public interface KpacSetDAO {

    KpacSet getKpacSetById(int id);

    List<KpacSet> getAllKpacSets();

    boolean deleteKpacSet(int id);

    boolean createKpacSet(KpacSet set);
}
