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
 * 调料表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("condiments")
@ApiModel(value="Condiments对象", description="调料表")
public class Condiments implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "调料ID")
    @TableId(value = "condiment_id", type = IdType.AUTO)
    private Integer condimentId;

    @ApiModelProperty(value = "调料名称")
    private String name;

    @ApiModelProperty(value = "调料数量")
    private Integer quantity;

    @ApiModelProperty(value = "关联口味ID")
    private Integer tasteId;


}
