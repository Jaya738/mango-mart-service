package com.mm.mangomart.seller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SellerService {
    private final SellerRepository sellerRepository;

    public void saveSeller(Seller sellerRequest) {
        sellerRepository.save(sellerRequest);
    }
}
