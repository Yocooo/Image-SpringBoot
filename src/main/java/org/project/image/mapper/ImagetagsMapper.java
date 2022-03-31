package org.project.image.mapper;

import org.project.image.entity.Imagetags;

import java.util.List;

/**
* @author Accqiao
* @description 针对表【imagetags】的数据库操作Mapper
* @createDate 2022-03-30 20:36:57
* @Entity org.project.image.entity.Imagetags
*/
public interface ImagetagsMapper {

    int insert(Imagetags record);

    List<Imagetags> selectByHid(String hid);

    int deleteByPrimaryKey(String hid,String tag);





    int insertSelective(Imagetags record);

    int updateByPrimaryKeySelective(Imagetags record);

    int updateByPrimaryKey(Imagetags record);



}
