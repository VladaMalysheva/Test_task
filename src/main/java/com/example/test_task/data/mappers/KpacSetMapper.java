package com.example.test_task.data.mappers;


import com.example.test_task.data.entities.KpacSet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KpacSetMapper implements RowMapper<KpacSet> {

    public KpacSet mapRow(ResultSet resultSet, int i) throws SQLException {

        KpacSet set = new KpacSet();
        set.setID(resultSet.getInt("ID"));
        set.setTitle(resultSet.getString("Title"));
        return set;
    }
}
