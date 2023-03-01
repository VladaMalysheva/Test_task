package com.example.test_task.data.mappers;

import com.example.test_task.data.entities.KpacRelation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KpacRelationMapper implements RowMapper<KpacRelation> {

    public KpacRelation mapRow(ResultSet resultSet, int i) throws SQLException {

        KpacRelation relation = new KpacRelation();
        relation.setID(resultSet.getInt("ID"));
        relation.setKpacSetID(resultSet.getInt("KpacSetID"));
        relation.setKpacEntityID(resultSet.getInt("KpacEntityID"));
        return relation;
    }
}