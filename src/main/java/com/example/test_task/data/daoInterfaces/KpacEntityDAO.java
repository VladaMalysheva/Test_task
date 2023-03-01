package com.example.test_task.data.daoInterfaces;

import com.example.test_task.data.entities.KpacEntity;

import java.util.List;

public interface KpacEntityDAO {
    KpacEntity getKpacEntityById(int id);

    List<KpacEntity> getAllKpacEntities();

    boolean deleteKpacEntity(KpacEntity entity);

    boolean createKpacEntity(KpacEntity entity);
}
