package com.mm.mangomart.mangorest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SellerController {
    @PostMapping(value = "/seller")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createSeller(@RequestBody SellerRequest sellerRequest) {
    }
}
