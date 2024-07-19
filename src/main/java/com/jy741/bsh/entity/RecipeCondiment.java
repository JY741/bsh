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
 * 食谱-调料关联表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("recipe_condiment")
@ApiModel(value="RecipeCondiment对象", description="食谱-调料关联表")
public class RecipeCondiment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "食谱ID")
    @TableId(value = "recipe_id", type = IdType.AUTO)
    private Integer recipeId;

    @ApiModelProperty(value = "调料ID")
    private Integer condimentId;

    @ApiModelProperty(value = "所需调料数量")
    private Integer quantity;


}
