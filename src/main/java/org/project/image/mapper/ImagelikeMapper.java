package org.project.image.mapper;

import org.project.image.entity.Imagelike;

/**
* @author Accqiao
* @description 针对表【imagelike】的数据库操作Mapper
* @createDate 2022-04-02 22:48:37
* @Entity org.project.image.entity.Imagelike
*/
public interface ImagelikeMapper {

    int newOrChangeRecord(Imagelike record);

    int updateTypeByTwoKey(String uid,String hid);

    Imagelike selectByPrimaryKey(String uid,String hid);




    int deleteByPrimaryKey(Long id);

    int insert(Imagelike record);

    int insertSelective(Imagelike record);



    int updateByPrimaryKeySelective(Imagelike record);

    int updateByPrimaryKey(Imagelike record);

}