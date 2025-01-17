package com.globalexchange.app.repository;

import com.globalexchange.app.domain.vo.*;
import com.globalexchange.app.mapper.DiaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DiaryDAO {
  private final DiaryMapper diaryMapper;
  //    추가
  public void save(DiaryDTO diaryDTO){
    diaryMapper.diaryInsert(diaryDTO);
  }
  //    수정
  public void setDiaryVO(DiaryDTO diaryDTO){
    diaryMapper.diaryUpdate(diaryDTO);
  }
  //    삭제
  public void remove(Long diaryNumber){
    diaryMapper.diaryDelete(diaryNumber);
  }
  //    조회
  public DiaryVO findById(Long diaryNumber){
    return diaryMapper.diarySelect(diaryNumber);
  }
  //    전체 조회
  public List<DiaryDTO> findAll(Criteria criteria){
    return diaryMapper.diarySelectAll(criteria);
  }
  //    전체 개수
  public int findCountAll(){
    return diaryMapper.getTotal();
  }

  //    파트너 조회
  public List<Long> findPartner(Long memberNumber){
    return diaryMapper.diaryPartnerSelect(memberNumber);
  }

  // 파트너 신청
  public void saveDiaryPartner(Long memberNumber, Long diaryPartnerNumber){
    diaryMapper.diaryPartnerInsert(memberNumber, diaryPartnerNumber);
  }

  // 파트너 유무 확인
  public int diaryPartnerCheck(Long memberNumber, Long diaryPartnerNumber){
    return diaryMapper.diaryPartnerCheck(memberNumber, diaryPartnerNumber);
  }

}
