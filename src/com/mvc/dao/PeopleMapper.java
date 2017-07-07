package com.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mvc.model.People;

public class PeopleMapper implements RowMapper<People> {

	@Override
	public People mapRow(ResultSet result, int rowNum) throws SQLException {
		People people =new People();
		people.setId(result.getInt("id"));
		people.setName(result.getString("name"));
		people.setAddress(result.getString("address"));
		return people;
	}

}
