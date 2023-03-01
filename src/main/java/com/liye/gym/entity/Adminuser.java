package com.liye.gym.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/**
 * @Description: 管理员信息实体类
 * @Author: LiuJian
 * @Date: 2020/4/3
 */
@Entity
@Table(name = "adminuser")
@Data
public class Adminuser {
  @Id
  @GeneratedValue(strategy =  GenerationType.AUTO)
  private long adminId;
  private String adminName;
  private String adminPassword;
}
