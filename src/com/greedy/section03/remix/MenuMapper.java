package com.greedy.section03.remix;

import java.util.List;

public interface MenuMapper {

	List<MenuDTO> selectAllMenu();

	MenuDTO selectMenuByCode(int code);

	int insertMenu(MenuDTO menu);

	int modifyMenu(MenuDTO menu);

	int removeMenu(MenuDTO menu);
}
