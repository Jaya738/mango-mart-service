package com.mm.mangomart.mangoStock;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mango_stock")
public class MangoStock {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String sellerId;
    private String mangoType;
    private String mangoSize;
    private String sellingFormat;
    private Double prize;


}
