/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *  org.dimigo.oop
 *       |_ IdolGroup
 *
 * 1. 개요  :
 * 2. 작성일  :  2017. 4. 7.
 * </pre>
 *
 * @author  : tjrcj
 * @version : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] groupName = {"TWICE", "RED VELBET", "걸스데이"};
		String[][] memberName = {
				{"정연", "나연", "채영", "쯔위", "사나", "미나", "지효", "다현", "모모"},
				{"웬디", "아이린", "슬기", "조이", "예린"},
				{"유라", "혜리", "소진", "민아"},
		};
		for(int i = 0; i<memberName.length; i++){
			System.out.println("<< " + groupName[i] + " >>");
			for(int j = 0; j<memberName[i].length; j++){
				System.out.println(memberName[i][j]);
			}
			System.out.println();
		}
	}

}
