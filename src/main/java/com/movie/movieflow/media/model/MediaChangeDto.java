package com.movie.movieflow.media.model;

import lombok.Data;

import java.util.List;

@Data
public class MediaChangeDto {
    private List<String> pics;
    private int iuser;
    private int imedia;
    private String title;
    private String date;
    private String genrepk;
    private int isSaw;
    private int star;
    private String comment;
}

