package com.green.greengram.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FeedLike extends CreatedAt {
    @EmbeddedId
    private FeedLikeIds feedLikeIds;


    @ManyToOne
    @MapsId("feedId")
    @JoinColumn(name = "feed_id")
    private Feed feedId;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User userId;
}
