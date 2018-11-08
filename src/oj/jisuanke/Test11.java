package test;
/*
给定由大写，小写字母和空格组成的字符串，返回 最后 一个单词的长度。
如果输入中不存在单词，返回 0。
注意：“单词”是指不包含空格符号的字符串
例如：
对于字符串"hello World"（不带引号）, 那么返回的结果是 5；
对于字符串"abc abc "（不带引号），那么返回的结果就是 3。

输入格式
输入仅一行，为字符串 s（长度不超过 10000）。
输出格式
输出 s中最后一个单词的长度。

样例输入1
Today is a nice day
样例输出1
3
样例输入2
The quick brown fox jumps over the lazy dog   
样例输出2
3
*/

import java.util.Scanner;

public class Test11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(lengthOfLastWord(str));
	}

	public static int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		String[] arr = s.split(" ");
		return arr[arr.length - 1].length();
	}
}
