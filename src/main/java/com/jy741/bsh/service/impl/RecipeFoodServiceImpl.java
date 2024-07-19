package com.jy741.bsh.service.impl;

import com.jy741.bsh.entity.RecipeFood;
import com.jy741.bsh.mapper.RecipeFoodMapper;
import com.jy741.bsh.service.IRecipeFoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 食谱-食物关联表 服务实现类
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Service
public class RecipeFoodServiceImpl extends ServiceImpl<RecipeFoodMapper, RecipeFood> implements IRecipeFoodService {

}
