package com.ff.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;
/**
 * @Author: FF
 * @Date: 2019/6/9 11:26
 * @Version 1.0
 */
@Data
@Document(indexName = "film_index", type = "film")
public class FilmEntity {
    @Id
    private Long id;
    @Field
    private String name;
    @Field
    private String publishDate;
    @Field
    private String type;
    @Field
    private String language;
    @Field
    //@JsonFormat(pattern="yyyy-MM-dd")
    private Date created ;
}
