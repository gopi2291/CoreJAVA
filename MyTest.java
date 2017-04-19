package com.pack.test;


	import java.util.HashMap;
	import java.util.Map;
	
	public class MyTest {
	    public static void main(String args[]){

	        MyTest obj=new MyTest();
	        TableDao daoObject=new TableDao();
	        daoObject.add(new TableEntity(100,"gopi","987654321","usa"));
	        daoObject.add(new TableEntity(101,"krishna","987654321","usa"));
	        daoObject.add(new TableEntity(102,"James","987654321","usa"));

	        //Map<Integer,TableEntity> data=daoObject.getDb();
	        obj.viewData(daoObject.getDb());
	    }

	    public void viewData(Map<Integer,TableEntity> data){
	        for (Integer integer : data.keySet()) {
	            System.out.println("id:"+data.get(integer).getId()+" ,"+"name: "+data.get(integer).getName() +" ,"+"phone:"+data.get(integer).getPhone()+","+"address:"+data.get(integer).getAddress());
	        }
	    }
	}






