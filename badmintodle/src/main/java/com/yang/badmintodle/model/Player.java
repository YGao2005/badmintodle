package com.yang.badmintodle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "player")
public class Player {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "age")
    private int age;

    @Column(name = "ranking")
    private int ranking;

    @Column(name = "events")
    private String events;

    @Column(name = "handedness")
    private String handedness;

    @Column(name = "height")
    private String height;

    @Column(name = "gender")
    private String gender;
}
