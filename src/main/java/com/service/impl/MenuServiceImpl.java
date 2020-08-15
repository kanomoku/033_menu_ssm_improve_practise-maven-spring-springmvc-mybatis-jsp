package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.MenuMapper;
import com.pojo.Menu;
import com.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	@Resource
	private MenuMapper meneMapper;

	@Override
	public List<Menu> show() {
		List<Menu> selByPid = meneMapper.selByPid(0);
		return selByPid;
	}

}
