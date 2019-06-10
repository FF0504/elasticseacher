package com.ff.repository;

import com.ff.entity.FilmEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Author: FF
 * @Date: 2019/6/9 11:22
 * @Version 1.0
 */
public interface FilmRepository extends ElasticsearchRepository<FilmEntity,Long> {

    /**
     * And语句查询
     * @param name
     * @param type
     */
    List<FilmEntity> findByNameAndType(String name,String type);

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
