package com.cavcav.service;


import com.cavcav.exception.CartItemException;
import com.cavcav.exception.UserException;
import com.cavcav.model.*;

public interface CartItemService {
	
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
