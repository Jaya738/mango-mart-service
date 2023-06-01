package com.mm.mangomart.mangoStock;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MangoStockController {

    private final MangoStockService mangoStockService;

    @PostMapping(value = "/mangoStockList")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createMangoStock(@RequestBody MangoStock mangoStockRequest){

        mangoStockService.saveMangoStock(mangoStockRequest);
    }

}
