package org.example.springtest.entity;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLRestriction;

@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Entity(name = "post")
@SQLRestriction("is_deleted = false")
public class PublicPost extends BasePost {

    public PublicPost(String title) {
        super(title);
    }
}
