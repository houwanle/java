package test;
/*
在右侧我们给出了一个已经基本完成的程序，读入了一个字符串，
调用了一个叫str_len的函数来计算这个字符串的长度，并输出。

聪明的你应该已经发现了，这个叫str_len的函数并没有完成，
在不修改函数原型的情况下，请完成str_len函数，实现我们上述的功能吧。
 
样例输入
abcdefg
样例输出
7 
 */
import java.util.Scanner;

public class Test8 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str_len(str));
	}
	
	static int str_len(String str) {
		int n = str.length();
		return n;
	}
}
