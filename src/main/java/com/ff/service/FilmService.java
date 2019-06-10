package com.ff.service;

import com.ff.entity.FilmEntity;

import java.util.List;

/**
 * @Author: FF
 * @Date: 2019/6/9 11:28
 * @Version 1.0
 */
public interface FilmService {



    public Long saveFilm(FilmEntity filmEntity);

    /**
     * And语句查询
     * @param name
     * @param type
     */
    List<FilmEntity> findByNameAndType(String name, String type);

    /**
     * or语句查询
     * @param name
     * @param type
     */
    List<FilmEntity> findByNameOrType(String name,String type);


    /**
     * like语句查询
     * @param name
     */
    List<FilmEntity> findByNameLike(String name);

    /**
     * not查询
     * @param name
     */
    List<FilmEntity> findByNameNot(String name);
}
