package com.third.mapper;

import com.third.Vo.CartandProductVo;
import com.third.pojo.Cart;
import com.third.pojo.CartExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    int countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    //根据用户id查购物车
    List<CartandProductVo> findCarts(Integer uid);

    //根据产品pid 删除商品
    void delproduct(Integer pid);

    //清空购物车
    void clear(Integer uid);


}