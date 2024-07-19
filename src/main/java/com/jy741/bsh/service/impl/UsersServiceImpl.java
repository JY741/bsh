package com.jy741.bsh.service.impl;

import com.jy741.bsh.entity.Users;
import com.jy741.bsh.mapper.UsersMapper;
import com.jy741.bsh.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author JY
 * @since 2024-07-19
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
