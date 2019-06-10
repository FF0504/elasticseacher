package com.ff.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.elasticsearch.index.engine.Engine;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;
;
import java.io.Serializable;
import java.util.Date;

@Data
@Document(indexName = "item_index",type = "item")
public class Item implements Serializable {
    @Id
    private Long id;
    private String title;
    private String category;
    private String brand;
    private Double price;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createTime;

}
