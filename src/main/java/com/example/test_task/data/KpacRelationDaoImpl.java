package com.example.test_task.data;

import com.example.test_task.data.daoInterfaces.KpacRelationDAO;
import com.example.test_task.data.entities.KpacEntity;
import com.example.test_task.data.entities.KpacRelation;
import com.example.test_task.data.mappers.KpacEntityMapper;
import com.example.test_task.data.mappers.KpacRelationMapper;
import com.example.test_task.data.mappers.KpacSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class KpacRelationDaoImpl implements KpacRelationDAO {

    JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL = "select * from k_pac_relations";
    private final String SQL_FIND_RELATION = "select * from k_pac_relations where ID = ?";
    private final String SQL_DELETE_RELATION = "delete from k_pac_relations where ID = ?";
    private final String SQL_INSERT_RELATION = "insert into k_pac_relations(ID, KpacSetID, KpacEntityID) values(?,?,?)";

    private final String SQL_GET_ENTITIES = "select entity.ID, entity.Title, entity.Description, entity.CreationDate" +
            " from k_pac_relations as rel join k_pac as entity on rel.KpacEntityID=entity.ID " +
            "where rel.KpacSetID = ?";

    @Autowired
    public KpacRelationDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public KpacRelation getKpacRelationById(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_RELATION, new KpacRelationMapper(), id);
    }

    @Override
    public List<KpacRelation> getAllKpacRelations() {
        return jdbcTemplate.query(SQL_GET_ALL, new KpacRelationMapper());
    }

    @Override
    public boolean deleteKpacRelation(KpacRelation relation) {
        return jdbcTemplate.update(SQL_DELETE_RELATION, relation.getID()) > 0;
    }

    @Override
    public boolean createKpacRelation(KpacRelation relation) {
        return jdbcTemplate.update(SQL_INSERT_RELATION, relation.getID(), relation.getKpacSetID(), relation.getKpacEntityID()) > 0;
    }

    @Override
    public List<KpacEntity> getKpacEntitiesBySetId(int id) {
        return jdbcTemplate.query(SQL_GET_ENTITIES, new KpacEntityMapper(), id);
    }
}
