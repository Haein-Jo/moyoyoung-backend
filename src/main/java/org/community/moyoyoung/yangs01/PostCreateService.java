package org.community.moyoyoung.yangs01;

import org.community.moyoyoung.dto.PageRequestDTO;
import org.community.moyoyoung.dto.PageResponseDTO;
import org.community.moyoyoung.dto.PostCreateDTO;

public interface PostCreateService {

        Long register(PostCreateDTO postCreateDTO);
        // 게시글 등록

        void modify(Long id, PostCreateDTO postCreateDTO);
        // 기존 게시글 수정 (게시글 ID와 수정할 데이터 포함)

}


