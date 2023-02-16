package com.greedy.section03.remix;

import java.util.List;

public class PrintResult {

	public void printMenuList(List<MenuDTO> menuList) {
	
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
	}

	public void printErrorMessage(String errorCode) {
		
		String errorMessage = "";
		switch(errorCode) {
			case "findAllMenus" : errorMessage = "메뉴 목록 조회에 실패하셨습니다."; break;
			case "findMenuBymenuCode" : errorMessage =  "메뉴 코드로 메뉴를 조회하는데 실패하셨습니다."; break;
			case "registNewMenu" : errorMessage = "신규 메뉴 등록에 실패하셨습니다!"; break;
			case "modifyMenu" : errorMessage = "메뉴 수정에 실패하셨습니다!"; break;
			case "removeMenu" : errorMessage = "메뉴 삭제에 실패하셨습니다!"; break;
			default : errorMessage = "알 수 없는 에러 발생!"; break;
		}
		System.out.println(errorMessage);
	}

	public void printMenu(MenuDTO menu) {

		System.out.println(menu);
	}

	public void printSuccessMessage(String successCode) {

		String successMessage = "";
		switch(successCode) {
			case "registNewMenu" : successMessage = "메뉴 삭제를 성공하였습니다."; break;
			default : successMessage = "DML 구문은 성공적으로 수행했으나 잘못된 코드값이 전달되었습니다."; break;	
		}
		
		System.out.println(successMessage);
	}

	public void printUpdateMessage(String updateCode) {

		String updateMessage = "";
		switch(updateCode) {
			case "modifyMenu" : updateMessage = "메뉴 수정을 성공하였습니다."; break;
			default : updateMessage = "DML 구문은 성공적으로 수행했으나 잘못된 코드값이 전달되었습니다."; break;
		}
		System.out.println(updateMessage);
		
	}

	public void printRemoveMessage(String removeCode) {
		
		String removeMessage = "";
		switch(removeCode) {
			case "removeMenu" : removeMessage = "메뉴 삭제를 성공하였습니다."; break;
			default : removeMessage = "DML 구문은 성공적으로 수행했으나 잘못된 코드값이 전달되었습니다."; break;
		}
		System.out.println(removeMessage);
	}

	
	
}
