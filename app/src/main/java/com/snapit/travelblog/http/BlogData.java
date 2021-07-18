package com.snapit.travelblog.http;


import com.snapit.travelblog.http.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogData {

    private List<Blog> data;

    public List<Blog> getData() {
        return data != null ? data : new ArrayList<>();
    }
}
