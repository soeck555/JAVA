package com.callor.app.controller;

public class MaintController {
	public static void main(String[] args) {
		MenuController menu = new MenuController();
		
		while (true) {
			menu.viewMainMenu();
			Integer select = menu.selectMenu();
			if (select == null) {
				System.out.println("업무선택을 잘못했습니다");
				System.out.println("다시 입력해 주세요");
				continue;

			} else if (select == 1) {
				menu.viewStMenu();
			} else if (select == 2) {
				menu.viewScMenu();
			} else if (select == -1) {
				break;
			} else {
				System.out.println();
			}
		} // end while
		System.out.println("Aㅁㄴㅇㅁㅇ");
	} // end main

} // end class
