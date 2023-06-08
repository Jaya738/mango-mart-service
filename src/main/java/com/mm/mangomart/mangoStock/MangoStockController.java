package com.mm.mangomart.mangoStock;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MangoStockController {

    private final MangoStockService mangoStockService;

    @PostMapping(value = "/mangoStockList")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createMangoStock(@RequestBody MangoStock mangoStockRequest){

        mangoStockService.saveMangoStock(mangoStockRequest);
    }

    @GetMapping(value = "/getMangoStockList")
    @ResponseStatus(code = HttpStatus.OK)
    public List<MangoStock> retrieveAllMangoStock(){

            return  mangoStockService.getAllStock();
    }

}
