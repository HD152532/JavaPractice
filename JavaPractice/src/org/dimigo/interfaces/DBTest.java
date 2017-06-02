
package org.dimigo.interfaces;
   

public class DBTest {
  
	public static void main(String[] args) {
		  
		IDBManager daba = IDBManager.getIDBObject(IDBManager.ORACLE_DATABASE);
		System.out.println("<<변경 전>>");
		crud(daba);
		IDBManager daba2 = IDBManager.getIDBObject(IDBManager.SYBASE_DATABASE);
		System.out.println("<<변경 후>>");
		crud(daba2);
	}
	public static void crud(IDBManager db){
		db.insert();	
		db.search();
		db.update();
		db.delete();
		System.out.println();
		//
	}
}
