package com.spring.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.dao.entity.CodeLibrary;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@CacheConfig(cacheNames = "CodeLibrary")
public interface CodeLibraryMapper extends BaseMapper<CodeLibrary> {
//    String getcode(@Param("itemNo") String itemNo);

//     @Cacheable(key ="#p0")
//     List<CodeLibrary> getCodeByCodeNo(@Param("codeNo") String codeNo);
//     @Cacheable(key ="#p0+#p1")
//     CodeLibrary getCodeByCodeNoAndItemNo(@Param("codeNo") String codeNo, @Param("itemNo") String itemNo);
//
//     @Cacheable(key ="'phase'+#p0+#p1")
//     List<PhaseNoVo> getPhaseList(@Param("codeNo") String codeNo, @Param("itemNo") String itemNo);

    @Cacheable(key ="'name'+#p0+#p1")
    String getCodeNameByCodeNoAndItemNo(@Param("codeNo") String codeNo, @Param("itemNo") String itemNo);

//    @Select("select * from CODE_LIBRARY where Attribute1=#{attribute1}")
//    List<CodeLibrary> listByAttribute1(String attribute1);

}
