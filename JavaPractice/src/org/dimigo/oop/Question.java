/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *<pre>
 *  org.dimigo.oop
 *       |_ Question
 *
 * 1. 개요  :
 * 2. 작성일  :  2017. 3. 31.
 * </pre>
 *
 * @author  : tjrcj
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		String[] question = {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? "};
		String[] answers = {"Bewhy", "Jesse Adam Eisenberg", "응용 프로그래밍"};
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++){
			System.out.println(i+1 + ". " + question[i]);
			String answer = scanner.nextLine();
			System.out.println(answers[i].equals(answer) ? "정답입니다!" : "틀렸습니다!");
		}
		System.out.println("<< 결과 출력 >>");
		for(int i = 0; i < 3; i++){
			StringBuilder sb = new StringBuilder(question[i]);
			sb.append(" ").append(answers[i]);
			System.out.println(sb);
		}
	}

}
