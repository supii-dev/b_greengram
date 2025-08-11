package com.green.greengram.application.Feedlike.model;

import jakarta.validation.constraints.Positive;
import lombok.Getter;

@Getter
public class FeedLikeToggleReq {
    @Positive
    private Long feedId;
}
