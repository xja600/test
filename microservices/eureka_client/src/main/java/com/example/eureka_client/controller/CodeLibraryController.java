package com.example.eureka_client.controller;

import com.example.eureka_client.service.CodeLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class CodeLibraryController {
    @Autowired
    private CodeLibraryService codeLibraryService;

    /**
     * 获取所有商品列表
     * @return
     */
    @RequestMapping("getCodeNameByCodeNoAndItemNo")
    public Object list(){
        System.out.println("-----CodeLibraryController.getCodeNameByCodeNoAndItemNo---------------");
        codeLibraryService.getCodeNameByCodeNoAndItemNo("","");

        return codeLibraryService.getCodeNameByCodeNoAndItemNo("ApplyChannel","00");
    }

}
