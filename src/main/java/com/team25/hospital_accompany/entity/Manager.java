package com.team25.hospital_accompany.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "managers")
public class Manager extends User {
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "profile_image", length = 255)
    private String profileImage;

    @Column(name = "career", length = 255)
    private String career;

    @Column(name = "comment", length = 255)
    private String comment;

    @Column(name = "working_region", length = 255)
    private String workingRegion;

    // 추가적인 속성 및 메서드
}
