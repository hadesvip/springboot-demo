package com.springboot.demo.service;

import com.springboot.demo.domain.consts.BusinessIdentifierConsts;
import com.springboot.demo.domain.dos.UserDO;
import com.springboot.demo.domain.vos.UserVO;

/**
 * 用户接口
 *
 * @author wangyong
 * @date 2018年03月26日
 */
public interface UserService {

  /**
   * 获取用户信息
   *
   * @param userDO 用户DO数据类
   * @param businessIdentifier 业务唯一标识
   * @return 用户信息
   * @see UserVO
   */
  UserVO getUser(UserDO userDO, BusinessIdentifierConsts businessIdentifier);

}
