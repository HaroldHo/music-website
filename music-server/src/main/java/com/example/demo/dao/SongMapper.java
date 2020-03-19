package com.example.demo.dao;

import com.example.demo.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Song record);

    int insertSelective(Song record);

    Song selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKeyWithBLOBs(Song record);

    int updateByPrimaryKey(Song record);

    int updateSongMsg(Song record);

    int updateSongUrl(Song record);

    int updateSongPic(Song record);

    int deleteSong(Integer id);

    List<Song> listSongs();

    List<Song> listSongsOfSinger(Integer singerId);

    List<Song> listSongsOfSongs(Integer id);

    List<Song> searachSongLists(String name);

    List<Song> songOfName(String name);

}
