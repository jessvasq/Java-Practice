package com.nvz.gl310_2_1_sp20_eurekaclienttwo.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Schools {
    private UUID id;
    private String schoolName;
    private String address;

}
