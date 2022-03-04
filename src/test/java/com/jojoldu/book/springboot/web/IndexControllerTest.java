package com.jojoldu.book.springboot.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IndexControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void 메인페이지_로딩() {
        String url = "/";
        String body = restTemplate.getForObject(url, String.class);
        assertThat(body).contains("스프링부트로 시작하는 웹 서비스");
    }
}