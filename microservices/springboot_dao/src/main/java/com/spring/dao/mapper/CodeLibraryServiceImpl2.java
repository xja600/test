package com.spring.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.spring.dao.entity.CodeLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeLibraryServiceImpl2 {
//    public class CodeLibraryServiceImpl extends ServiceImpl<CodeLibraryMapper, CodeLibrary>  implements CodeLibraryService {

    @Autowired
    CodeLibraryMapper codeLibraryMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void getCodeNameByCodeNoAndItemNo(String codeNo, String itemNo) {
        System.out.println("---------------获取 itemName 1-----------");
        String name =  codeLibraryMapper.getCodeNameByCodeNoAndItemNo(codeNo,itemNo);
        System.out.println("-------itemName1 = "+name);

//        List<CodeLibrary> list = this.codeLibraryMapper.selectList(new QueryWrapper<>(CodeLibrary.builder()
//                .codeno(codeNo)
//                .itemno(itemNo)
//                .build()));
//        System.out.println("-------itemName1 = "+list.get(0).getItemname());
    }

    public void queryCode(String codeNo, String itemNo) {
        System.out.println("---------------获取 itemName2-----------");
        List<CodeLibrary> list = jdbcTemplate.query("select ITEMNAME from CODE_LIBRARY where itemno = '"+itemNo+"' and CODENO = '"+codeNo+"' and  isinuse=1"
                ,new BeanPropertyRowMapper(CodeLibrary.class));
//        jdbcTemplate.query("select ITEMNAME from CODE_LIBRARY where itemno=? and CODENO=? and  isinuse=1","","");
//        String name =  codeLibraryMapper.getCodeNameByCodeNoAndItemNo(codeNo,itemNo);
        System.out.println("-------itemName2 = "+list.get(0).getItemname());

    }
}