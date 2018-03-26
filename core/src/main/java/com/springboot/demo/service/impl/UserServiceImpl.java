package com.springboot.demo.service.impl;

import com.springboot.demo.domain.consts.BusinessIdentifierConsts;
import com.springboot.demo.domain.dos.UserDO;
import com.springboot.demo.domain.vos.UserVO;
import com.springboot.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户服务接口实现
 *
 * @author wangyong
 * @date 2018年03月26日
 */
@Service
public class UserServiceImpl implements UserService {


  /**
   * 获取用户信息
   *
   * @param userDO 用户DO数据类
   * @param businessIdentifier 业务唯一标识
   */
  @Override
  public UserVO getUser(UserDO userDO, BusinessIdentifierConsts businessIdentifier) {

    //登录
    if (BusinessIdentifierConsts.USER_LOGIN.equals(businessIdentifier)) {

    }

    return null;
  }
}
