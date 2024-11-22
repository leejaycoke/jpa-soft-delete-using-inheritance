package org.example.springtest.repository;

import org.example.springtest.entity.InternalPost;
import org.example.springtest.entity.PublicPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class PublicPostRepositoryTest {

    @Autowired
    private PublicPostRepository publicPostRepository;

    @Autowired
    private InternalPostRepository internalPostRepository;

    @Test
    void 공개_서비스용도_삭제된글은_안가져온다() {
        // given
        var publicPost1 = new PublicPost("공개글입니다.");
        publicPostRepository.save(publicPost1);

        var publicPost2 = new PublicPost("삭제글입니다.");
        publicPost2.delete();
        publicPostRepository.save(publicPost2);

        // when
        var posts = publicPostRepository.findAll();

        // then
        assertEquals(1, posts.size());
    }

    @Test
    void 관리자_서비스용도_삭제글도_가져온다() {
        // given
        var publicPost1 = new InternalPost("정상글입니다.");
        internalPostRepository.save(publicPost1);

        var publicPost2 = new InternalPost("삭제글입니다.");
        publicPost2.delete();
        internalPostRepository.save(publicPost2);

        // when
        var posts = internalPostRepository.findAll();

        // then
        assertEquals(2, posts.size());
    }
}
