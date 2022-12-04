package com.globalexchange.app.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class MemberDAOTest {

    @Autowired
    private MemberDAO memberDAO;

    @Test
    void findByMemberNumber() {
        log.info("member : " + memberDAO.findByMemberNumber(1L));
    }
}