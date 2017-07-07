package com.mvc.dao;

import java.util.ArrayList;

import javax.sql.DataSource;

import com.mvc.model.People;

public interface PeopleDao {
	
	public void setDataSoruce(DataSource datasource);
	
	public void create(String name,String address);

	public People getPeople(int id);
	
	public ArrayList<People> getPeopleList();
	
	public void delete(int id);
	
	public void updateName(String name,int id);
	
	public void updateAddress(String address,int id);
}
