package com.ff.service.impl;

import com.ff.entity.FilmEntity;
import com.ff.entity.Item;
import com.ff.repository.FilmRepository;
import com.ff.repository.ItemRepository;
import com.ff.service.FilmService;
import com.ff.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: FF
 * @Date: 2019/6/9 11:29
 * @Version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;


    @Override
    public Long saveItem(Item item) {
        return itemRepository.save(item).getId();
    }

    @Override
    public List<Item> findByTitleAndBrand(String title, String brand) {
        return itemRepository.findByTitleAndBrand(title,brand);
    }

    @Override
    public List<Item> findByTitleOrBrand(String title, String brand) {
        return itemRepository.findByTitleOrBrand(title,brand);
    }

    @Override
    public List<Item> findByTitleLike(String title) {
        return itemRepository.findByTitleLike(title);
    }

    @Override
    public List<Item> findByTitleNot(String title) {
        return itemRepository.findByTitleNot(title);
    }
}
