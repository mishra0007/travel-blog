package com.snapit.travelblog.http;

import com.snapit.travelblog.http.Blog;

import java.util.List;

public interface BlogArticlesCallback {
    void onSuccess(List<Blog> blogList);
    void onError();
}

