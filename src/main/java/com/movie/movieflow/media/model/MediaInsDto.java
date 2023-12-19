package com.movie.movieflow.media.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class MediaInsDto {
    @JsonIgnore
    private int imedia;
    private int iuser;
    private int genrepk;
    private String title;
    private String date;
    private String comment;
    private int star;
    private int isSaw;
    private List<String> pics;
}
