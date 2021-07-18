package com.snapit.travelblog.repository;

import com.snapit.travelblog.http.Blog;

import java.util.*;

public interface DataFromDatabaseCallback {
    void onSuccess(List<Blog> blogList);
}
