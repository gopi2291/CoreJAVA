package com.pack.test;

import java.util.Map;
import java.util.HashMap;

	public class TableDao {

	
	    Map<Integer,TableEntity> db=new HashMap<Integer,TableEntity>();

	    public Map<Integer, TableEntity> getDb() {
	        return db;
	    }

	    public void setDb(Map<Integer, TableEntity> db) {
	        this.db = db;
	    }

	    public void add(TableEntity tableEntity){
	        db.put(tableEntity.getId(),tableEntity);
	    }

	    public  TableEntity get(int key){
	        return db.get(key);
	    }
	}



