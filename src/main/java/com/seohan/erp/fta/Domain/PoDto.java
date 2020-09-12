package com.seohan.erp.fta.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class PoDto implements Serializable {
    private PoHeader poHeader;
    private List<PoDetail> poDetails = new ArrayList<>();
}
