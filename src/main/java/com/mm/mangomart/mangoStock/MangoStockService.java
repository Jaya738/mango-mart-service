package com.mm.mangomart.mangoStock;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MangoStockService {

    private final MangoStockRepository mangoStockRepository;
    public void saveMangoStock(MangoStock mangoStockRequest){

        mangoStockRepository.save(mangoStockRequest);

    }

    public List<MangoStock> getAllStock(){
        return mangoStockRepository.findAll();
    }


}
