package com.seohan.erp.general.Controller;

import com.seohan.erp.general.Domain.MngInworkmstEntity;
import com.seohan.erp.general.Repository.MngInworkMstRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/general/inwork")
@Slf4j
@RestController
class MngInworkRestController {

    @Autowired
    MngInworkMstRepository mngInworkMstRepository;

    @GetMapping
    public ResponseEntity getAll(Pageable pageable) throws Exception {

        return null;
//        new ResponseEntity(mngInworkMstRepository.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/v2")
    public ResponseEntity getAllbyJPA(Pageable pageable) throws Exception {
//        List<MngInworkmstEntity> mngInworkmstEntities= mngInworkMstRepository.findByJPQL(pageable);
//        for (MngInworkmstEntity mngInworkmstEntity : mngInworkmstEntities) {
//            List<MngInworksubEntity>  mngInworksubEntities =  mngInworkmstEntity.getMngInworksubEntities();
//            mngInworksubEntities.stream().forEach(sub -> sub.getExecmny());
//        }
        return null;
//        new ResponseEntity(mngInworkmstEntities, HttpStatus.OK);

    }

    @GetMapping("/date")
    public ResponseEntity findByRdate(@RequestParam String rdate) throws Exception {
        List<MngInworkmstEntity> mngInworkmstEntities = mngInworkMstRepository.findByRdate(rdate);
        return new ResponseEntity(mngInworkmstEntities, HttpStatus.OK);
    }
}
