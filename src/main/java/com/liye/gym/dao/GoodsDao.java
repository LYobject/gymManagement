package com.liye.gym.dao;


import com.liye.gym.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 商品信息Dao层接口
 * @Author: LiuJian
 * @Date: 2020/4/3
 */
public interface GoodsDao extends JpaRepository<Goods,Long> {
}
