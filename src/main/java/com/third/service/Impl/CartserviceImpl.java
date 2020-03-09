package com.third.service.Impl;

import com.third.Vo.CartandProductVo;
import com.third.mapper.CartMapper;
import com.third.mapper.ProductMapper;
import com.third.pojo.Cart;
import com.third.pojo.CartExample;
import com.third.pojo.Product;
import com.third.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class CartserviceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<CartandProductVo> findCarts(Integer uid) {

        List<CartandProductVo> carts = cartMapper.findCarts(uid);
        return carts;
    }


    @Override
    public void delCart(Integer uid) {
        cartMapper.clear(uid);
    }

    @Override
    public void insertOrUpdateCart(Integer pid, HttpSession session) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andPidEqualTo(pid);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        System.out.println(carts);
        Cart cart = new Cart();
        Product product = productMapper.selectByPrimaryKey(pid);
        double price = product.getPrice();
        if (carts.isEmpty()) {
            System.out.println(1);
            cart.setPid(pid);
            //cart.setUid((Integer) request.getSession().getAttribute("uid"));
            cart.setUid(3);
            cart.setCount(1);
            cart.setSum(price);
            cartMapper.insert(cart);
        } else {
            System.out.println(0);
            cart = carts.get(0);
            cart.setCount(cart.getCount() + 1);
            cart.setSum(cart.getSum() + price);
            cartMapper.updateByPrimaryKey(cart);
        }
    }

    @Override
    public void deleteOrUpdateCart(Integer pid, HttpSession session) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andPidEqualTo(pid);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        Cart cart = new Cart();
        cart = carts.get(0);
        Product product = productMapper.selectByPrimaryKey(pid);
        Double price = product.getPrice();
        Integer count = cart.getCount();
        Integer id = cart.getId();
        if (count == 1) {
            cartMapper.deleteByPrimaryKey(id);
        } else {
            cart.setCount(count - 1);
            cart.setSum(cart.getSum() - price);
            cartMapper.updateByPrimaryKey(cart);
        }
    }
}
