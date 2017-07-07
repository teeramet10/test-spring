package com.mvc.dao;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mvc.model.People;

public class PeopleDBTemplate implements PeopleDao {
	
	private DataSource datasource;
	private JdbcTemplate jdbcTemplateObj;
	
	@Override
	public void setDataSoruce(DataSource datasource) {
		this.datasource=datasource;
		this.jdbcTemplateObj=new JdbcTemplate(datasource);
		
	}

	@Override
	public void create( String name, String address) {
		String sql ="insert into people(name,address) value(?,?)";
		jdbcTemplateObj.update(sql,name,address);
		System.out.println("Create Record Name="+name+ "Address="+address);
	}

	@Override
	public People getPeople(int id) {
		String sql="select * from people where id =?";
		People people =jdbcTemplateObj.queryForObject(sql, new Object[]{id},new PeopleMapper());
		return people;
		
	}

	@Override
	public ArrayList<People> getPeopleList() {
		String sql="select * from people";
		ArrayList<People> peoples =(ArrayList<People>) jdbcTemplateObj.query(sql, new PeopleMapper());
		return peoples;
		
	}

	@Override
	public void delete(int id) {
		String sql ="delete from people where id =?";
		jdbcTemplateObj.update(sql,id);
		System.out.println("Deleted Record with id = "+id);
		
	}

	@Override
	public void updateName(String name, int id) {
		String sql ="update prople set name =? where id =?";
		jdbcTemplateObj.update(sql,name,id);
		System.out.println("Updated Record with id = "+id);
		
	}

	@Override
	public void updateAddress(String address, int id) {
		String sql ="update prople set address =? where id =?";
		jdbcTemplateObj.update(sql,address,id);
		System.out.println("Updated Record with id = "+id);
		
	}

}
