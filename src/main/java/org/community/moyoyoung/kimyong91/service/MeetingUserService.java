package org.community.moyoyoung.kimyong91.service;

import org.community.moyoyoung.dto.MeetingUserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
// 김용
@Service
public interface MeetingUserService {

    MeetingUserDTO meetingJoin(Long meetingId, Long userId);

    void meetingRemove(Long id);

    List<MeetingUserDTO> getListAll();

}
