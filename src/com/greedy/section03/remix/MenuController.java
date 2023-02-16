package com.greedy.section03.remix;

import java.util.List;
import java.util.Map;

public class MenuController {

	private final MenuService menuService;
	private final PrintResult printResult;
	
	public MenuController() {
		this.menuService = new MenuService();
		this.printResult = new PrintResult();
	}
	
	public void findAllMenus() {

		List<MenuDTO> menuList = menuService.findAllMenus();
		
		if(menuList != null) {
			printResult.printMenuList(menuList);
		} else {
			printResult.printErrorMessage("findAllMenus");
		}
		
	}

	public void findMenuByMenuCode(Map<String, String> parameter) {
		
		int code = Integer.parseInt(parameter.get("code"));
		
		MenuDTO menu = menuService.findMenuByMenuCode(code);
		
		if(menu != null) {
			printResult.printMenu(menu);
		} else {
			printResult.printErrorMessage("findMenuByMenuCode");
		}
		
	}

	public void registNewMenu(Map<String, String> parameter) {
		
		String name = parameter.get("name");
		int price = Integer.parseInt(parameter.get("price"));
		int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
		
		MenuDTO menu = new MenuDTO();
		menu.setName(name);
		menu.setPrice(price);
		menu.setCategoryCode(categoryCode);
		
		
		if(menuService.registNewMenu(menu)) {
			printResult.printSuccessMessage("registNewMenu");
		} else {
			printResult.printErrorMessage("registNewMenu");
			
		}
	}

	public void modifyMenu(Map<String, String> parameter) {
		
		int code = Integer.parseInt(parameter.get("code"));
		String name = parameter.get("name");
		int price = Integer.parseInt(parameter.get("price"));
		int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
		
		MenuDTO menuDTO = new MenuDTO();
		menuDTO.setCode(code);
		menuDTO.setName(name);
		menuDTO.setPrice(price);
		menuDTO.setCategoryCode(categoryCode);
		
		if(menuService.modifyMenu(menuDTO)) {
			printResult.printUpdateMessage("modifyMenu");
		} else {
			printResult.printErrorMessage("modifyMenu");
		}
	}

	public void removeMenu(Map<String, String> parameter) {
		
		int code = Integer.parseInt(parameter.get("code"));
	
		
		MenuDTO menuDTO = new MenuDTO();
		menuDTO.setCode(code);
	
		if(menuService.removeMenu(menuDTO)) {
			printResult.printRemoveMessage("removeMenu");
		} else {
			printResult.printErrorMessage("removeMenu");
	}
		
	}
}
