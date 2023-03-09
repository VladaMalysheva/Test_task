package com.example.test_task.data;

import com.example.test_task.data.daoInterfaces.KpacEntityDAO;
import com.example.test_task.data.entities.KpacEntity;
import com.example.test_task.data.mappers.KpacEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class KpacEntityDaoImpl implements KpacEntityDAO {

    JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL = "select * from k_pac";
    private final String SQL_FIND_ENTITY = "select * from k_pac where ID = ?";
    private final String SQL_DELETE_ENTITY = "delete from k_pac where ID = ?";
    private final String SQL_INSERT_ENTITY = "insert into k_pac(ID, Title, Description, CreationDate) values(?,?,?,?)";

    @Autowired
    public KpacEntityDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public KpacEntity getKpacEntityById(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_ENTITY, new KpacEntityMapper(), id);
    }

    @Override
    public List<KpacEntity> getAllKpacEntities() {
        return jdbcTemplate.query(SQL_GET_ALL, new KpacEntityMapper());
    }

    @Override
    public boolean deleteKpacEntity(int id) {
        return jdbcTemplate.update(SQL_DELETE_ENTITY, id) > 0;
    }

    @Override
    public boolean createKpacEntity(KpacEntity entity) {
        return jdbcTemplate.update(SQL_INSERT_ENTITY, entity.getID(), entity.getTitle(), entity.getDescription(),
                entity.getCreationDate()) > 0;
    }
}
