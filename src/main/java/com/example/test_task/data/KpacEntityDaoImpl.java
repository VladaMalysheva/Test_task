package com.example.test_task.data;

import com.example.test_task.data.entities.KpacEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class KpacEntityDaoImpl implements KpacEntityDAO{

    JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL = "select * from k_pac";

    @Autowired
    public KpacEntityDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public KpacEntity getKpacEntityById(Long id) {
        return null;
    }

    @Override
    public List<KpacEntity> getAllKpacEntities() {
        return jdbcTemplate.query(SQL_GET_ALL, new KpacEntityMapper());
    }

    @Override
    public boolean deleteKpacEntity(KpacEntity entity) {
        return false;
    }

    @Override
    public boolean createKpacEntity(KpacEntity entity) {
        return false;
    }
}
