package com.third.service;

import com.third.Vo.CartandProductVo;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface CartService {
    //根据用户登录的id查询购物车列表
    List<CartandProductVo> findCarts(Integer uid);

    //清空购物车
    void delCart(Integer uid);

    //往购物车添加数据
    void insertOrUpdateCart(Integer pid, HttpSession session);

    //在购物车删除数据
    void deleteOrUpdateCart(Integer pid, HttpSession session);
}