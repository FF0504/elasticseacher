package com.ff.service.impl;

import com.ff.entity.FilmEntity;
import com.ff.repository.FilmRepository;
import com.ff.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: FF
 * @Date: 2019/6/9 11:29
 * @Version 1.0
 */
@Service
public class FilmServiceImpl implements FilmService{

    @Autowired
    private FilmRepository filmRepository;


    @Override
    public Long saveFilm(FilmEntity filmEntity) {
        FilmEntity filmEntityResult = filmRepository.save(filmEntity);
        return filmEntity.getId();
    }

    @Override
    public List<FilmEntity> findByNameAndType(String name, String type) {
        return filmRepository.findByNameAndType(name,type);
    }

    @Override
    public List<FilmEntity> findByNameOrType(String name, String type) {
        return filmRepository.findByNameOrType(name,type);
    }

    @Override
    public List<FilmEntity> findByNameLike(String name) {
        return filmRepository.findByNameLike(name);
    }

    @Override
    public List<FilmEntity> findByNameNot(String name) {
        return filmRepository.findByNameNot(name);
    }
}
