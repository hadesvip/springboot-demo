package com.springboot.demo.web.controller;

import com.springboot.demo.domain.consts.BusinessIdentifierConsts;
import com.springboot.demo.domain.dos.UserDO;
import com.springboot.demo.domain.vos.UserVO;
import com.springboot.demo.service.UserService;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务接口
 *
 * @author wangyong
 * @date 2018年03月26日
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Resource
  private UserService userService;

  /**
   * 用户登录
   *
   * @param userName 用户名
   * @param password 密码
   */
  @PostMapping("/login")
  public UserVO login(String userName, String password) {

    //TODO 接口入参校验

    UserDO userDO = new UserDO();
    UserVO userVO = userService.getUser(userDO, BusinessIdentifierConsts.USER_LOGIN);
    return userVO;
  }

  @GetMapping("/getUser/{userId}")
  public UserVO getUser(@PathVariable("userId") String userId) {
    return new UserVO(userId, "admin", new Date());
  }


}
