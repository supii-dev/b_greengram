package com.green.greengram.application.feed.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class FeedGetRes {
    private long feedId;
    private String contents;
    private String location;
    private String createdAt;
    private long writerUserId;
    private String writerUid;
    private String writerNickName;
    private String writerPic;
    private int isLike;//0:좋아요 아님, 1:좋아요한 피드
    private List<String> pics;
}
