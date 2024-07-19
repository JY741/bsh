package com.jy741.bsh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 食物表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("foods")
@ApiModel(value="Foods对象", description="食物表")
public class Foods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "食物ID")
    @TableId(value = "food_id", type = IdType.AUTO)
    private Integer foodId;

    @ApiModelProperty(value = "食物名称")
    private String name;

    @ApiModelProperty(value = "食物数量")
    private Integer quantity;

    @ApiModelProperty(value = "食物保质期")
    private LocalDate expiryDate;


}
