package com.cavcav.service;


import com.cavcav.exception.ProductException;
import com.cavcav.model.Cart;
import com.cavcav.model.CartItem;
import com.cavcav.model.Product;
import com.cavcav.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
