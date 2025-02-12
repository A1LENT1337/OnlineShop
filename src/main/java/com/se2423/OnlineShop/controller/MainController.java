package com.se2423.OnlineShop.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.se2423.OnlineShop.entities.Item;
import com.se2423.OnlineShop.repositories.ItemRepo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private ItemRepo itemRepo;

    @PostMapping("/api/add")
    public void addItem(@RequestBody Item item) {
        log.info("New row: " + itemRepo.save(item));
    }


}
