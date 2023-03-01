package com.liye.gym.dao;


import com.liye.gym.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 会员信息Dao层接口
 * @Author: LiuJian
 * @Date: 2020/4/3
 */
public interface MenberDao extends JpaRepository<Member,Long> {
}
