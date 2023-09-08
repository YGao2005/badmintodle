package com.yang.badmintodle.model.dto;

import lombok.Data;

@Data
public class PlayerDto {
    private String id;
    private String name;
    private String country;
    private int ranking;
    private String events;
    private String racket;
    private String handedness;
    private int age;
}
