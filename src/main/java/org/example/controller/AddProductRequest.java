package org.example.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class AddProductRequest {

    private String              name;
    private BigDecimal          price;
    private long                quantity;
    private String              description;
    private List<MultipartFile> media;
}
