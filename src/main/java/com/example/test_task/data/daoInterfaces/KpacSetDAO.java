package com.example.test_task.data.daoInterfaces;

import com.example.test_task.data.entities.KpacSet;

import java.util.List;

public interface KpacSetDAO {

    KpacSet getKpacSetById(int id);

    List<KpacSet> getAllKpacSets();

    boolean deleteKpacSet(KpacSet set);

    boolean createKpacSet(KpacSet set);
}
