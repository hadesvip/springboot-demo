package com.springboot.demo.domain.vos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
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
public class UserVO implements Serializable {

  /**
   * 序列化
   */
  private static final long serialVersionUID = 6533814350717501399L;

  /**
   * 用户编号
   */
  private String userId;

  /**
   * 用户名
   */
  private String userName;

  /**
   * 创建时间
   */
  @JsonFormat(shape = Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;


  public UserVO() {
  }

  public UserVO(String userId, String userName, Date createTime) {
    this.userId = userId;
    this.userName = userName;
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("UserVO{");
    sb.append("userId='").append(userId).append('\'');
    sb.append(", userName='").append(userName).append('\'');
    sb.append(", createTime=").append(createTime);
    sb.append('}');
    return sb.toString();
  }
}
