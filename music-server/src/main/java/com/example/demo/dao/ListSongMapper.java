package com.example.demo.dao;

import com.example.demo.domain.ListSong;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListSongMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ListSong record);

    int insertSelective(ListSong record);

    ListSong selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ListSong record);

    int updateByPrimaryKey(ListSong record);

    int updateListSongMsg(ListSong record);

    int deleteListSong(Integer songId);

    List<ListSong> allListSong();

    List<ListSong> listSongsOfSingers(Integer songListId);
}
