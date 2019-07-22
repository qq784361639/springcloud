package com.bes.provider.dao;

import com.bes.provider.domain.Websites;
import com.bes.provider.domain.WebsitesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WebsitesMapper {
    long countByExample(WebsitesExample example);

    int deleteByExample(WebsitesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Websites record);

    int insertSelective(Websites record);

    List<Websites> selectByExample(int example);

    Websites selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Websites record, @Param("example") WebsitesExample example);

    int updateByExample(@Param("record") Websites record, @Param("example") WebsitesExample example);

    int updateByPrimaryKeySelective(Websites record);

    int updateByPrimaryKey(Websites record);
}