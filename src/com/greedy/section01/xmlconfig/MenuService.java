package com.greedy.section01.xmlconfig;

import static com.greedy.section01.xmlconfig.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
public class MenuService {

	private final MenuDAO menuDAO;
	
	public MenuService() {
		this.menuDAO = new MenuDAO();
	}
	
	public List<MenuDTO> findAllMenus() {

		SqlSession sqlSession = getSqlSession();
		
		List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);
		
		sqlSession.close();
		
		return menuList;
	}

	public MenuDTO findMenuByMenuCode(int code) {

		SqlSession sqlSession = getSqlSession();
		
		MenuDTO menu = menuDAO.selectMenuByCode(sqlSession, code);
		
		sqlSession.close();
		
		return menu;
	}

	public boolean registNewMenu(MenuDTO menu) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = menuDAO.insertMenu(sqlSession, menu);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean modifyMenu (MenuDTO menuList) {

		SqlSession sqlSession = getSqlSession();
		
		int result = menuDAO.modifyMenu(sqlSession, menuList);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public boolean removeMenu(MenuDTO menuList) {
		SqlSession sqlSession = getSqlSession();
		
		int result = menuDAO.removeMenu(sqlSession, menuList);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
		
	}

}
