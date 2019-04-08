package com.piggsoft.restful.user.service.service.impl;

import com.piggsoft.restful.user.service.entity.User;
import com.piggsoft.restful.user.service.mapper.UserMapper;
import com.piggsoft.restful.user.service.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author piggsoft
 * @since 2019-04-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
