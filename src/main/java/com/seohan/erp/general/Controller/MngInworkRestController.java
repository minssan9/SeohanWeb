package com.seohan.erp.general.Controller;

import com.seohan.erp.general.Repository.MngInworkRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/general/inwork")
@Slf4j
@RestController
class MngInworkRestController {

    @Autowired
    MngInworkRepository mngInworkRepository;

    @GetMapping
    public ResponseEntity getAll(Pageable pageable) throws Exception {
        return new ResponseEntity(mngInworkRepository.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/date")
    public ResponseEntity findByRdate(@RequestParam String rdate, Pageable pageable) throws Exception {
        return new ResponseEntity(mngInworkRepository.findByRdate(rdate, pageable), HttpStatus.OK);
    }
}
