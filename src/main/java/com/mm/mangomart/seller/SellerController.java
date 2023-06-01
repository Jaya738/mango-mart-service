package com.mm.mangomart.seller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SellerController {
    private final SellerService sellerService;

    @PostMapping(value = "/seller")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createSeller(@RequestBody Seller sellerRequest) {

        sellerService.saveSeller(sellerRequest);
    }
}
