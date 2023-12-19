package com.movie.movieflow.media.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class MediaAllDto {
    private int iuser;
    private String year;
    private String month;
}
