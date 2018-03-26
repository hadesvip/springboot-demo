package com.springboot.demo.domain.dos;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户信息
 *
 * @author wangyong
 * @date 2018年03月26日
 */
@Data
public class UserDO implements Serializable {

  /**
   * 序列化
   */
  private static final long serialVersionUID = 5099957309560390304L;

  /**
   * 用户名
   */
  private String userName;

  /**
   * 密码
   */
  private String password;

  /**
   * 手机号码
   */
  private String telephone;

  /**
   * 邮箱
   */
  private String email;

  /**
   * 创建时间
   */
  private Date createTime;

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("UserDO{");
    sb.append("userName='").append(userName).append('\'');
    sb.append(", password='").append(password).append('\'');
    sb.append(", telephone='").append(telephone).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append(", createTime=").append(createTime);
    sb.append('}');
    return sb.toString();
  }
}
