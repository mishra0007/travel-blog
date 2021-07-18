package com.snapit.travelblog.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.snapit.travelblog.http.Blog;

@Database(entities = {Blog.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BlogDAO blogDao();
}
