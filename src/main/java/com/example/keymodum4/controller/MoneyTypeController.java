package com.example.keymodum4.controller;


import com.example.keymodum4.model.ChildCategory;
import com.example.keymodum4.model.MoneyType;
import com.example.keymodum4.service.moneytype.MoneyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/money-types")
public class MoneyTypeController {
    @Autowired
    MoneyTypeService moneyTypeService;


    @GetMapping
    public ResponseEntity<Iterable<MoneyType>> showAllMoneyType(){
        return new ResponseEntity<>(moneyTypeService.findAll() , HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<MoneyType>> findById(@PathVariable Long id) {
        return new ResponseEntity<>(moneyTypeService.findById(id), HttpStatus.OK);
    }


//    @PostMapping()
//    public ResponseEntity<Optional<MoneyType>> save(@RequestBody MoneyType moneyType) {
//        return new ResponseEntity(moneyTypeService.save(moneyType), HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Optional<MoneyType>> update(@PathVariable Long id, @RequestBody MoneyType moneyType) {
//        Optional<MoneyType> moneyTypeOptional = moneyTypeService.findById(id);
//        if (!moneyTypeOptional.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        moneyType.setId(moneyTypeOptional.get().getId());
//        return new ResponseEntity(moneyTypeService.save(moneyType), HttpStatus.OK);
//
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<MoneyType> delete(@PathVariable Long id) {
//        Optional<MoneyType> productOptional = childCategoryService.findById(id);
//        if (!productOptional.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        childCategoryService.remove(id);
//        return new ResponseEntity<>(productOptional.get(), HttpStatus.NO_CONTENT);
//    }
}
