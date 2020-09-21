package com.seohan.erp.general.Controller;

import java.util.List;

import com.seohan.erp.general.Domain.MngInworkmstEntity;
import com.seohan.erp.general.Repository.MngInworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/general/inwork")
@Slf4j
@RestController
class MngInworkRestController {

    @Autowired
    MngInworkRepository mngInworkRepository;
    @GetMapping
    public @ResponseBody List<MngInworkmstEntity> getAll() throws Exception {
        return mngInworkRepository.findAll();
    }

}
