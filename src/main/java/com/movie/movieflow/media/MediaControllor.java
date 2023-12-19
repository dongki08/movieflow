package com.movie.movieflow.media;

import com.movie.movieflow.ResVo;
import com.movie.movieflow.media.model.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/media")
public class MediaControllor {
    private final MediaService service;

    @PostMapping
    public ResVo postMedia(@RequestBody MediaInsDto dto) {
        return service.postMedia(dto);
    }

    @GetMapping("/ym") //메인화면
    public MediaAllVo mediaAll(MediaAllDto dto) {
        return service.mediaAll(dto);
    }

    @GetMapping("/day") //일일 날짜별 리스트
    public List<MediaDayVo> mediaDay(MediaDayDto dto) {
        return service.mediaDay(dto);
    }

    @GetMapping //마이페이지
    public List<MediaMypageVo> mediaMypage(MediaMypageDto dto) {
        return service.mediaMypage(dto);
    }

    @GetMapping("/{imedia}") //상세 페이지
    public MediaDetailVo mediaDetail(@PathVariable int imedia, int iuser) {
        MediaDetailDto dto = new MediaDetailDto();
        dto.setImedia(imedia);
        dto.setIuser(iuser);
        return service.mediaDetail(dto);
    }

    @PatchMapping //본 것과 볼 것 수정
    public ResVo mediaSaw(@RequestBody MediaSawDto dto) {
        return service.mediaSaw(dto);
    }

    @PutMapping //전체 수정
    public ResVo mediaUpdate(@RequestBody MediaUpdDto dto) {
        return service.mediaUpdate(dto);
    }

    @DeleteMapping
    public ResVo mediaDelete(MediaDelDto dto) {
        return service.mediaDelete(dto);
    }

}
