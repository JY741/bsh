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
 * 食谱-食物关联表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("recipe_food")
@ApiModel(value="RecipeFood对象", description="食谱-食物关联表")
public class RecipeFood implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "食谱ID")
    @TableId(value = "recipe_id", type = IdType.AUTO)
    private Integer recipeId;

    @ApiModelProperty(value = "食物ID")
    private Integer foodId;

    @ApiModelProperty(value = "所需食物数量")
    private Integer quantity;


}
