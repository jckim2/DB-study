package com.sbs.example.textBoard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<article> articles = new ArrayList<article>();
	public static Scanner sc = new Scanner(System.in);
	public static int num = 0;

	public static void main(String[] args) {

		while (true) {
			String command;
			System.out.printf("명령어 입력:");
			command = sc.nextLine();
			if (command.equals("article write")) {
				System.out.printf("제목:");
				String title = sc.nextLine();
				System.out.printf("내용:");
				String body = sc.nextLine();
				num++;

				articles.add(new article(num, title, body));
				System.out.printf("%d번째 글 생성\n", num);
			} else if (command.equals("article list")) {
				for (int i = 0; i < articles.size(); i++) {
					article a = articles.get(i);
					System.out.printf("%d번째 글\n제목:%s\n내용:%s\n", a.num, a.title, a.body);
				}
			} else if (command.equals("system exit")) {
				System.out.println("시스템을 종료합니다");
				sc.close();
				return;
			}
			
		}
	}
}

class article {
	int num;
	String title;
	String body;

	article(int num, String title, String body) {
		this.num = num;
		this.title = title;
		this.body = body;
	}
}