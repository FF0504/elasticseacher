package com.ff.controller;

import com.ff.entity.FilmEntity;
import com.ff.entity.Item;
import com.ff.service.FilmService;
import com.ff.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author: FF
 * @Date: 2019/6/9 11:34
 * @Version 1.0
 */
@RestController
@Api(value = "es项目类型添加")
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 插入项目
     * @param item
     */
    @RequestMapping(value = "/item/save",method = RequestMethod.POST)
    @ApiOperation(value = "添加",notes = "添加不同项目")
    public Long saveItem(Item item){
        item.setCreateTime(new Date());
        return itemService.saveItem(item);
    }

    /**
     * and 查询
     * @param title
     * @param brand
     */
    @RequestMapping(value = "item/findByTitleAndBrand",method = RequestMethod.GET)
    @ApiOperation(value = "查询条件为and",notes = "根据条件查询，查询条件类型为And")
    public List<Item> findByTitleAndBrand(@RequestParam(value = "title") String title,@RequestParam(value = "brand") String brand){
        return itemService.findByTitleAndBrand(title, brand);
    }

    /**
     * and or
     * @param title
     * @param brand
     */
    @RequestMapping(value = "item/findByTitleOrBrand",method = RequestMethod.GET)
    @ApiOperation(value = "查询条件为or",notes = "根据条件查询，查询条件类型为Or")
    public List<Item> findByTitleOrBrand(@RequestParam(value = "title") String title,@RequestParam(value = "brand") String brand){
        return itemService.findByTitleOrBrand(title, brand);
    }

    /**
     * like
     * @param title
     */
    @RequestMapping(value = "item/findByTitleLike",method = RequestMethod.GET)
    @ApiOperation(value = "查询为like",notes = "根据条件查询，查询条件类型为Like")
    public List<Item> findByTitleLike(@RequestParam(value = "title") String title){
        return itemService.findByTitleLike(title);
    }



    /**
     * Nor 查询
     * @param title
     *
     */
    @RequestMapping(value = "item/findByNameNotLike",method = RequestMethod.GET)
    @ApiOperation(value = "查询",notes = "根据条件查询，查询条件类型为NotLike")
    public List<Item> findByTitleNot(@RequestParam(value = "title") String title){
        return itemService.findByTitleNot(title);
    }


}
