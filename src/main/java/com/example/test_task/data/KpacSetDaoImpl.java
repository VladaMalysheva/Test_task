package com.example.test_task.data;

import com.example.test_task.data.daoInterfaces.KpacSetDAO;
import com.example.test_task.data.entities.KpacSet;
import com.example.test_task.data.mappers.KpacEntityMapper;
import com.example.test_task.data.mappers.KpacSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class KpacSetDaoImpl implements KpacSetDAO {

    JdbcTemplate jdbcTemplate;

    private final String SQL_GET_ALL = "select * from k_pac_set";
    private final String SQL_FIND_SET = "select * from k_pac_set where ID = ?";
    private final String SQL_DELETE_SET = "delete from k_pac_set where ID = ?";
    private final String SQL_INSERT_SET = "insert into k_pac_set(ID, Title) values(?,?)";

    @Autowired
    public KpacSetDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public KpacSet getKpacSetById(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_SET, new KpacSetMapper(), id);
    }

    @Override
    public List<KpacSet> getAllKpacSets() {
        return jdbcTemplate.query(SQL_GET_ALL, new KpacSetMapper());
    }

    @Override
    public boolean deleteKpacSet(KpacSet set) {
        return jdbcTemplate.update(SQL_DELETE_SET, set.getID()) > 0;
    }

    @Override
    public boolean createKpacSet(KpacSet set) {
        return jdbcTemplate.update(SQL_INSERT_SET, set.getID(), set.getTitle()) > 0;
    }
}
