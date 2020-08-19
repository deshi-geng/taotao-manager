package com.taotao.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.taotao.manager.mapper.ItemCatMapper;
import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private ItemCatMapper itemCatMapper;
	
	@Override
	public List<ItemCat> queryItemCatByPage(Integer page, Integer rows) {
		
		PageHelper.startPage(page, rows);
		
		List<ItemCat> list = itemCatMapper.select(null);
		
		return list;
	}
	
}
