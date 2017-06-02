/**
 * 
 */
package org.dimigo.interfaces;
 
/**
 *<pre>
 *  org.dimigo.interfaces
 *       |_ IDBManager
 *
 * 1. 개요  :
 * 2. 작성일  :  2017. 5. 24.
 * </pre>
 *
 * @author  : tjrcj
 * @version : 1.0
 */
public interface IDBManager {
	
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getIDBObject(String database){
		if(database == ORACLE_DATABASE)
		{
			return new OracleDB();
		}
		else if(database == SYBASE_DATABASE){
			return new SybaseDB();
		}
		else
			return null;
	}

}
