package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Menu;
import com.service.MenuService;

@Controller
public class MenuController {
	/**
	 * springmvc容器调用spring容器中内容.
	 * 
	 * 默认是byname 写成menuServiceImpl快一些，不然byname找不到就会找bytype会慢一些
	 */
	@Resource
	private MenuService menuServiceImpl;

	@RequestMapping("show")
	@ResponseBody 
	public List<Menu> show() {
		List<Menu> show = menuServiceImpl.show();
		return show;
	}
}
