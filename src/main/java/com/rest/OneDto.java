package com.rest;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class OneDto {
    String reqestId;
    List<Map<String,taxDto>> tax;
}
