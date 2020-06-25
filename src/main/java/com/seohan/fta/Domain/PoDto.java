package com.seohan.fta.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class PoDto implements Serializable {
    private PoHeader poHeader;
    private List<PoDetail> poDetails = new ArrayList<>();
}
