package com.example.test_task.data.daoInterfaces;

import com.example.test_task.data.entities.KpacEntity;
import com.example.test_task.data.entities.KpacRelation;

import java.util.List;

public interface KpacRelationDAO {

    KpacRelation getKpacRelationById(int id);

    List<KpacRelation> getAllKpacRelations();

    boolean deleteKpacRelation(KpacRelation relation);

    boolean createKpacRelation(KpacRelation relation);
    List<KpacEntity> getKpacEntitiesBySetId(int id);
}
