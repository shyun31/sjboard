package com.example.sjboard.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
@Getter
@Setter

public class MiddleCode {
    private String largeCode;
    private String middleCode;
    private String middleCodeName;
    private Timestamp regDate;
    private String regUser;
    private Timestamp modDate;
    private String modUser;

}
