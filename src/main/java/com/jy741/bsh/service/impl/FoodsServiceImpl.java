package com.jy741.bsh.service.impl;

import com.jy741.bsh.entity.Foods;
import com.jy741.bsh.mapper.FoodsMapper;
import com.jy741.bsh.service.IFoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 食物表 服务实现类
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Service
public class FoodsServiceImpl extends ServiceImpl<FoodsMapper, Foods> implements IFoodsService {

}
