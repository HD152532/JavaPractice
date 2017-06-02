/**
 * 
 */
package org.dimigo.exception;

/**
 *<pre>
 *  org.dimigo.exception
 *       |_ Movie
 *
 * 1. 개요  :
 * 2. 작성일  :  2017. 5. 29.
 * </pre>
 *
 * @author  : tjrcj
 * @version : 1.0
 */
public class Movie {

	String title;
	int limitAge;
	
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {   
		return title;
	}

	/**
	 * @return the limitAge
	 */
	public int getLimitAge() {
		return limitAge;
	}
	
	public void buyTicket(int age) {
		try{
			if(age<limitAge){
				throw new AgeCheckException(this);
			}
			System.out.println(title + " 즐감하세요");
		}catch(AgeCheckException e){
			System.out.println(e.getMessage());
		}

	}
}
