package com.mapper;

import java.util.List;

import com.pojo.Menu;

public interface MenuMapper {
	List<Menu> selByPid(int pid);
}
