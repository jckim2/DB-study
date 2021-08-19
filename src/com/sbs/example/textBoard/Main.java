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
			System.out.printf("��ɾ� �Է�:");
			command = sc.nextLine();
			if (command.equals("article write")) {
				System.out.printf("����:");
				String title = sc.nextLine();
				System.out.printf("����:");
				String body = sc.nextLine();
				num++;

				articles.add(new article(num, title, body));
				System.out.printf("%d��° �� ����\n", num);
			} else if (command.equals("article list")) {
				for (int i = 0; i < articles.size(); i++) {
					article a = articles.get(i);
					System.out.printf("%d��° ��\n����:%s\n����:%s\n", a.num, a.title, a.body);
				}
			} else if (command.equals("system exit")) {
				System.out.println("�ý����� �����մϴ�");
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