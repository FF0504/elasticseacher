package com.ff.controller;

import com.ff.entity.FilmEntity;
import com.ff.service.FilmService;
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
@Api(value = "es电影类型添加")
public class FilmController {
    @Autowired
    private FilmService filmService;

    /**
     * 插入电影
     * @param filmEntity
     */
    @RequestMapping(value = "/film/save",method = RequestMethod.POST)
    @ApiOperation(value = "添加",notes = "添加不同类型的电影")
    public Long saveFilm(FilmEntity filmEntity){
        filmEntity.setCreated(new Date());
        return filmService.saveFilm(filmEntity);
    }

    /**
     * and 查询
     * @param name
     * @param type
     */
    @RequestMapping(value = "film/findByNameAndType",method = RequestMethod.GET)
    @ApiOperation(value = "查询",notes = "根据条件查询，查询条件类型为And")
    public List<FilmEntity> findByNameAndType(@RequestParam(value = "name") String name,@RequestParam(value = "type") String type){
        return filmService.findByNameAndType(name, type);
    }

    /**
     * or 查询
     * @param name
     * @param type
     */
    @RequestMapping(value = "film/findByNameOrType",method = RequestMethod.GET)
    @ApiOperation(value = "查询",notes = "根据条件查询，查询条件类型为Or")
    public List<FilmEntity> findByNameOrType(@RequestParam(value = "name") String name,@RequestParam(value = "type") String type){
        return filmService.findByNameOrType(name, type);
    }

    /**
     * or 查询
     * @param name
     *
     */
    @RequestMapping(value = "film/findByNameLike",method = RequestMethod.GET)
    @ApiOperation(value = "查询",notes = "根据条件查询，查询条件类型为Like")
    public List<FilmEntity> findByNameLike(@RequestParam(value = "name") String name){
        return filmService.findByNameLike(name);
    }



    /**
     * or 查询
     * @param name
     *
     */
    @RequestMapping(value = "film/findByNameNotLike",method = RequestMethod.GET)
    @ApiOperation(value = "查询",notes = "根据条件查询，查询条件类型为NotLike")
    public List<FilmEntity> findByNameNotLike(@RequestParam(value = "name") String name){
        return filmService.findByNameNot(name);
    }


}
