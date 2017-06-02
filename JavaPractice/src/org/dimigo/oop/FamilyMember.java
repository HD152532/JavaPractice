/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *  org.dimigo.oop
 *       |_ FamilyMember
 *
 * 1. 개요  :
 * 2. 작성일  :  2017. 4. 18.
 * </pre>
 *
 * @author  : tjrcj
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName){
		this.memberName = memberName;
		memberCnt +=1;
	}
	public String getMemberName(){
		return this.memberName;
	}
	public static void printMemberCnt(){
		System.out.printf("가족 총 인원 수 : %d명\n", memberCnt);
	}
}
