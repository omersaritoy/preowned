package com.cavcav.service;

import com.cavcav.domain.*;
import com.cavcav.exception.*;
import com.cavcav.model.*;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
