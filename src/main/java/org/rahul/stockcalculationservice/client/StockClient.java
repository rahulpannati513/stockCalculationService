package org.rahul.serviceregistry.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name = "StockService")
public interface StockClient {


        @GetMapping("api/stockprice/{companyName}")
        public ResponseEntity<Double> fetchStockPrice(@PathVariable String companyName);



}
