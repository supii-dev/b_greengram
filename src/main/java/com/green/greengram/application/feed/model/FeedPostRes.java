package com.green.greengram.application.feed.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class FeedPostRes {
    private long feedId;
    private List<String> pics;
}