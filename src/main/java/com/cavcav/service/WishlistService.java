package com.cavcav.service;


import com.cavcav.domain.*;
import com.cavcav.exception.*;
import com.cavcav.model.*;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

