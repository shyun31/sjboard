package com.example.sjboard.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
    private Integer no;
    private Integer subNo;
    private Integer seq;
    private String largeCode;
    private String middleCode;
    private String title;
    private String contents;
    private Integer level;
    private String filePath;
    private String fileName;
    private String regUser;
    private String modUser;
}