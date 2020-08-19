package com.taotao.manager.service;

import java.util.List;

import com.taotao.manager.pojo.ItemCat;

public interface ItemCatService {
	List<ItemCat> queryItemCatByPage(Integer page,Integer rows);
}
