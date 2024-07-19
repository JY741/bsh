package com.jy741.bsh.service.impl;

import com.jy741.bsh.entity.UserEmotion;
import com.jy741.bsh.mapper.UserEmotionMapper;
import com.jy741.bsh.service.IUserEmotionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户情绪记录表 服务实现类
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Service
public class UserEmotionServiceImpl extends ServiceImpl<UserEmotionMapper, UserEmotion> implements IUserEmotionService {

}
