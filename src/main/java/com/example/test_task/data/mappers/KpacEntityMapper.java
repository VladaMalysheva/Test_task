package com.example.test_task.data.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.test_task.data.entities.KpacEntity;
import org.springframework.jdbc.core.RowMapper;

public class KpacEntityMapper implements RowMapper<KpacEntity> {

    public KpacEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        KpacEntity entity = new KpacEntity();
        entity.setID(resultSet.getInt("ID"));
        entity.setTitle(resultSet.getString("Title"));
        entity.setDescription(resultSet.getString("Description"));
        entity.setCreationDate(resultSet.getDate("CreationDate"));
        return entity;
    }
}
