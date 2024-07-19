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
 * 电器表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("appliances")
@ApiModel(value="Appliances对象", description="电器表")
public class Appliances implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "电器ID")
    @TableId(value = "appliance_id", type = IdType.AUTO)
    private Integer applianceId;

    @ApiModelProperty(value = "电器名称")
    private String name;

    @ApiModelProperty(value = "电器状态（如：可用、不可用）")
    private Integer status;


}
