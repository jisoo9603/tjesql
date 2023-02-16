package com.greedy.section02.javaconfig;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static com.greedy.section02.javaconfig.Template.getSqlSession;

public class MenuService {

	public List<MenuDTO> findAllMenus() {

		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
		MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
		List<MenuDTO> menuList = menuMapper.selectAllMenu();
		
		sqlSession.close();
		
		return menuList;
	}

	public MenuDTO findMenuByMenuCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean registNewMenu(MenuDTO menu) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modifyMenu(MenuDTO menuDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeMenu(MenuDTO menuDTO) {
		// TODO Auto-generated method stub
		return false;
	}

}
