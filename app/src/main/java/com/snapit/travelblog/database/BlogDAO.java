package com.snapit.travelblog.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.snapit.travelblog.http.Blog;

import java.util.List;

@Dao
public interface BlogDAO {

    @Query("SELECT * FROM blog") // 1
    List<Blog> getAll();

    @Insert
        // 2
    void insertAll(List<Blog> blogList);

    @Query("DELETE FROM blog") // 3
    void deleteAll();
}
