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
 * 用户情绪记录表
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_emotion")
@ApiModel(value="UserEmotion对象", description="用户情绪记录表")
public class UserEmotion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "情绪记录ID")
    @TableId(value = "emotion_id", type = IdType.AUTO)
    private Integer emotionId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "情绪类型（如：高兴、悲伤）")
    private String emotion;

    @ApiModelProperty(value = "情绪记录时间")
    private LocalDateTime timestamp;


}
