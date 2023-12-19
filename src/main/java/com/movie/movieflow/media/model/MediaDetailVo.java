package com.movie.movieflow.media.model;

import lombok.Data;

import java.util.List;

@Data
public class MediaDetailVo {
    private String title;
    private String date;
    private int genrepk;
    private int star;
    private String comment;
    private int isSaw;
    private List<String> pics;
}
