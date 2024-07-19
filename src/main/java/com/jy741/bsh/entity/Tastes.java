package com.jy741.bsh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 口味表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tastes")
@ApiModel(value="Tastes对象", description="口味表")
public class Tastes implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "口味ID")
    @TableId(value = "taste_id", type = IdType.AUTO)
    private Integer tasteId;

    @ApiModelProperty(value = "口味名称（如：甜、咸）")
    private String name;


}
