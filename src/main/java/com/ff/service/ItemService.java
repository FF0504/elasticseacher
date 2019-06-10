package com.ff.service;

import com.ff.entity.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Author: FF
 * @Date: 2019/6/9 11:22
 * @Version 1.0
 */
public interface ItemService {


    public Long saveItem(Item item);

    /**
     * And语句查询
     * @param title
     * @param brand
     */
    List<Item> findByTitleAndBrand(String title, String brand);

    /**
     * or语句查询
     * @param title
     * @param brand
     */
    List<Item> findByTitleOrBrand(String title, String brand);


    /**
     * like语句查询
     * @param title
     */
    List<Item> findByTitleLike(String title);

    /**
     * not查询
     * @param title
     */
    List<Item> findByTitleNot(String title);
}
