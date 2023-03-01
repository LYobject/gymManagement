package com.liye.gym.dao;


import com.liye.gym.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 教练信息Dao层接口
 * @Author: LiuJian
 * @Date: 2020/4/3
 */
public interface CoachDao extends JpaRepository<Coach,Long> {
}
