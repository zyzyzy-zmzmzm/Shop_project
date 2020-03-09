package com.third.controller;

import com.third.Vo.CartandProductVo;
import com.third.pojo.Cart;

import com.third.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Cart")
public class CartAcontroller {
    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/show/{uid}", method = RequestMethod.GET)
    @ResponseBody
    public List<CartandProductVo> show(@PathVariable Integer uid, HttpSession session) {
        //获取用户id
//        HttpSession session = request.getSession();
//        Integer uid = (Integer) session.getAttribute("uid");

        List<CartandProductVo> carts = cartService.findCarts(3);
        return carts;
    }

    //清空购物车
    @RequestMapping(value = "/clear/{uid}", method = RequestMethod.GET)
    @ResponseBody
    public String clear(@PathVariable Integer uid) {
        cartService.delCart(uid);
        return "1";
    }

    //往购物车添加数据
    @RequestMapping("/insertOrUpdateCart/{pid}")
    @ResponseBody
    public String insertOrUpdateCart(@PathVariable Integer pid, HttpSession session) {
        cartService.insertOrUpdateCart(pid, session);
        return "1";
    }

    //删除数据
    @RequestMapping("/deleteOrUpdateCart/{pid}")
    @ResponseBody
    public String deleteOrUpdateCart(@PathVariable Integer pid, HttpSession session) {
        cartService.deleteOrUpdateCart(pid, session);
        return "1";
    }
}

