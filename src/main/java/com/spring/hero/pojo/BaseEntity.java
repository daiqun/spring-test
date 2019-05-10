package com.spring.hero.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author daiqun
 * @version 2019.04.29
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -26058598763454650L;

    private Long createdBy;
    private Date createDate;
    private Long updatedBy;
    private Date updateDate;
    private Date deleteDate;
    private Long deletedBy;
    private Boolean isDeleted = false;
}
