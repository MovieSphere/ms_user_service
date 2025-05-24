package com.upao.infraestructura.ms_user_service.models;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Array;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "user_embeddings")
public class UserEmbedding {
    @Id
    private Long profileId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(name = "embedding", columnDefinition = "vector(128)")
    @JdbcTypeCode(SqlTypes.VECTOR)
    @Array(length = 128)
    private float[] embedding;
}
