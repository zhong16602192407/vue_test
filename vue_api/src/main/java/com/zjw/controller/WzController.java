package com.zjw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjw.api.WzApi;
import com.zjw.po.Wzlist;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Lazy
@EnableAutoConfiguration
@RequestMapping("/wzlist")
public class WzController {
    @Reference
    private WzApi api;

    /**
     * 违章列表
     * @param jname 模糊条件
     * @param jid 模糊条件
     * @param pageNum
     * @return
     */
    @GetMapping("queryListWz")
    public PageInfo<Wzlist> queryListWz(
            @RequestParam(defaultValue = "")String jname,
            @RequestParam(defaultValue = "")Integer jid,
            @RequestParam(defaultValue = "1")Integer pageNum
    ){
        PageHelper.startPage(pageNum,3);
        Page<Wzlist> page=(Page<Wzlist>)api.queryWzlistBiJid(jid,jname);
        PageInfo<Wzlist> wzlistPageInfo = page.toPageInfo();
        return wzlistPageInfo;
    }
}
