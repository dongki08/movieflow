package com.movie.movieflow.media;

import com.movie.movieflow.media.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
public interface MediaMapper {
    int postMedia(MediaInsDto dto);

    int postMediaPic(MediaInsDto pic);

    MediaAllVo allMedia(MediaAllDto dto);

    List<MediaDayVo> dayMedia(MediaDayDto dto);

    List<MediaMypageVo> myPageMedia(MediaMypageDto dto);

    MediaDetailVo detailMedia(MediaDetailDto dto);

    List<String> detailMediaPic(MediaDetailDto dto);

    int sawMedia(MediaSawDto dto);

    int delPicMedia(int imedia);

    List<String> insPicMedia(MediaUpdDto dto);

    int UpdMedia(MediaUpdDto dto);

    int delMedia(MediaDelDto dto);
}
