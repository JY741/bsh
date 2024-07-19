package com.jy741.bsh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 推荐记录表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("recommendations")
@ApiModel(value="Recommendations对象", description="推荐记录表")
public class Recommendations implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "推荐记录ID")
    @TableId(value = "recommendation_id", type = IdType.AUTO)
    private Integer recommendationId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "食谱ID")
    private Integer recipeId;

    @ApiModelProperty(value = "推荐时间")
    private LocalDateTime timestamp;


}
