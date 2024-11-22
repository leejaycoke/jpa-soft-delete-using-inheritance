package org.example.springtest.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BasePost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 접근 제한자 수정

    private String title;

    private boolean isDeleted;

    public BasePost(String title) {
        this.title = title;
        this.isDeleted = false;
    }

    public void delete() {
        this.isDeleted = true;
    }
}