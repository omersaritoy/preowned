package com.cavcav.repository;


import com.cavcav.model.Cart;
import com.cavcav.model.CartItem;
import com.cavcav.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
