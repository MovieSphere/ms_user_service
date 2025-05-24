package com.upao.infraestructura.ms_user_service.models;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "rating_events")
public class RatingEvent {
    @EmbeddedId
    private RatingEventId id;

    @ManyToOne
    @MapsId("profileId")
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    @Column(nullable = false)
    private Short rating;

    @Column(nullable = false)
    private LocalDateTime ratedAt;
}