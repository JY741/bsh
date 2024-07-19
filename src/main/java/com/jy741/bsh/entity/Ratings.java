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
 * 评价表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ratings")
@ApiModel(value="Ratings对象", description="评价表")
public class Ratings implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评价ID")
    @TableId(value = "rating_id", type = IdType.AUTO)
    private Integer ratingId;

    @ApiModelProperty(value = "推荐记录ID")
    private Integer recommendationId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "评分（1-5）")
    private Integer rating;

    @ApiModelProperty(value = "评价内容")
    private String comment;

    @ApiModelProperty(value = "评价时间")
    private LocalDateTime timestamp;


}
