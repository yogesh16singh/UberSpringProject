package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "bookingreview")
public class Review extends BaseModel {

    @Column(nullable = false)
    private String review;

    @Column(nullable = false)
    private int rating;

    @Column(nullable = false)
    private int userId;
    @Column(nullable = false)
    private int rideId;
}
