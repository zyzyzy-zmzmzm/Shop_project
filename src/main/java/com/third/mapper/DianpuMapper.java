package com.third.mapper;

import com.third.pojo.Dianpu;
import com.third.pojo.DianpuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DianpuMapper {
    int countByExample(DianpuExample example);

    int deleteByExample(DianpuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dianpu record);

    int insertSelective(Dianpu record);

    List<Dianpu> selectByExample(DianpuExample example);

    Dianpu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dianpu record, @Param("example") DianpuExample example);

    int updateByExample(@Param("record") Dianpu record, @Param("example") DianpuExample example);

    int updateByPrimaryKeySelective(Dianpu record);

    int updateByPrimaryKey(Dianpu record);
}