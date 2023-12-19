package com.movie.movieflow.media.model;

import lombok.Data;

import java.util.List;

@Data
public class MediaUpdDto {
    private String title;
    private String date;
    private int genrepk;
    private int isSaw;
    private int star;
    private String comment;
    private int iuser;
    private int imedia;
    private List<String> pics;
}
