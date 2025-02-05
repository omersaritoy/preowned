package com.cavcav.service;


import com.cavcav.model.Seller;
import com.cavcav.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
