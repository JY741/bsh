package com.jy741.bsh.service.impl;

import com.jy741.bsh.entity.Recipes;
import com.jy741.bsh.mapper.RecipesMapper;
import com.jy741.bsh.service.IRecipesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 食谱表 服务实现类
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Service
public class RecipesServiceImpl extends ServiceImpl<RecipesMapper, Recipes> implements IRecipesService {

}
