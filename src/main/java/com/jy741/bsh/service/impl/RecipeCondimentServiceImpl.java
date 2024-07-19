package com.jy741.bsh.service.impl;

import com.jy741.bsh.entity.RecipeCondiment;
import com.jy741.bsh.mapper.RecipeCondimentMapper;
import com.jy741.bsh.service.IRecipeCondimentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 食谱-调料关联表 服务实现类
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Service
public class RecipeCondimentServiceImpl extends ServiceImpl<RecipeCondimentMapper, RecipeCondiment> implements IRecipeCondimentService {

}
