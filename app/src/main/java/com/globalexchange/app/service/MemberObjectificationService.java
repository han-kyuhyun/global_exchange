package com.globalexchange.app.service;

import com.globalexchange.app.domain.vo.MemberVO;
import com.globalexchange.app.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberObjectificationService implements MemberService{

    private final MemberDAO memberDAO;

    public boolean checkId(String memberId){

        return memberDAO.checkId(memberId);
    }

    public boolean checkNick(String memberNickname){

        return memberDAO.checkNick(memberNickname);
    }

    public Long emailLogin(MemberVO memberVO){

        return memberDAO.emailLogin(memberVO);
    }

    public void joinForm(MemberVO memberVO){

    }


}
