/**
 * 
 */
package org.dimigo.interfaces;

/**
 *<pre>
 *  org.dimigo.interfaces
 *       |_ OracleDB
 *
 * 1. 개요  :
 * 2. 작성일  :  2017. 5. 24.
 * </pre>
 *
 * @author  : tjrcj
 * @version : 1.0
 */
public class OracleDB implements IDBManager{

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#insert()
	 */ 
	@Override
	public void insert() {
		System.out.println("OracleDB 저장");
		
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#search()
	 */
	@Override
	public void search() {
		System.out.println("OracleDB 조회");
		
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#update()
	 */
	@Override
	public void update() {
		System.out.println("OracleDB 변경");
		
	}

	/* (non-Javadoc)
	 * @see org.dimigo.interfaces.IDBManager#delete()
	 */
	@Override
	public void delete() {
		System.out.println("OracleDB 삭제");
		
	}

}
