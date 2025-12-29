package com.exampleaaa.exampleeee.dal.dpo;

import cn.magicvector.common.service.model.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@TableName("example")
public class ExampleDPO extends BaseEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;
}