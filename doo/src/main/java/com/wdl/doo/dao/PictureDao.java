package com.wdl.doo.dao;

import com.wdl.doo.domain.model.PictureDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PictureDao {

    @Select(value = {"select * from d_picture"})
    List<PictureDTO> selectAllPicture();
}