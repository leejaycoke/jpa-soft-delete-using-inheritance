package org.example.springtest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "post")
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class InternalPost extends BasePost {

    public InternalPost(String title) {
        super(title);
    }
}
