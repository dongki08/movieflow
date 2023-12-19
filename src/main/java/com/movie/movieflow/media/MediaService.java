package com.movie.movieflow.media;

import com.movie.movieflow.ResVo;
import com.movie.movieflow.media.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.xml.stream.events.Comment;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MediaService {
    private final MediaMapper mapper;

    public ResVo postMedia(MediaInsDto dto) {
        mapper.postMedia(dto);
        mapper.postMediaPic(dto);
        return new ResVo(dto.getImedia());
    }

    public MediaAllVo mediaAll(MediaAllDto dto) {
        return mapper.allMedia(dto);
    }

    public List<MediaDayVo> mediaDay(MediaDayDto dto) {
        return mapper.dayMedia(dto);
    }

    public List<MediaMypageVo> mediaMypage(MediaMypageDto dto) {
        return mapper.myPageMedia(dto);
    }

    public MediaDetailVo mediaDetail(MediaDetailDto dto) {
        MediaDetailVo vo = mapper.detailMedia(dto);
        List<String> pics = mapper.detailMediaPic(dto);
        vo.setPics(pics);
        return vo;
    }

    public ResVo mediaSaw(MediaSawDto dto) {
        int result = mapper.sawMedia(dto);
        return new ResVo(result);
    }

    public ResVo mediaUpdate(MediaUpdDto dto) {
        mapper.delPicMedia(dto.getImedia());
        List<String> list = mapper.insPicMedia(dto);
        int result = mapper.UpdMedia(dto);
        return new ResVo(result);
    }

    public ResVo mediaDelete(MediaDelDto dto) {
        int result = mapper.delMedia(dto);
        return new ResVo(result);
    }
}
