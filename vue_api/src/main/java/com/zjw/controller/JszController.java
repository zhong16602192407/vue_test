package com.zjw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjw.api.JszApi;
import com.zjw.po.Jszlist;
import com.zjw.po.Wzlist;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@CrossOrigin
@Lazy
@RequestMapping("/list")
public class JszController {
    @Reference
    private JszApi api;

    /**
     * 遍历驾驶证列表的方法
     * @param jname 模糊的条件，驾驶人名称
     * @param pageNum 分页的条件， 即当前页
     * @return
     */
    @GetMapping("queryjszList")
    public PageInfo<Jszlist> queryList(
            @RequestParam(defaultValue = "")String jname,
            @RequestParam(defaultValue = "1")String pageNum
    ){
        PageHelper.startPage(Integer.parseInt(pageNum),3);
        Page<Jszlist> page=(Page<Jszlist>)api.queryJszList(jname);
        PageInfo<Jszlist> jszlistPageInfo = page.toPageInfo();
        return jszlistPageInfo;
    }

    /**
     *  违章信息的列表
     * @param pageNum
     * @param jid 驾驶人的编号
     * @return
     */
    @GetMapping("querywzList")
    public PageInfo<Wzlist> querywzList(
            @RequestParam(defaultValue = "1")String pageNum,
            Integer jid
    ){
        PageHelper.startPage(Integer.parseInt(pageNum),3);
        Page<Wzlist> page=(Page<Wzlist>)api.queryWzlistBiJid(jid);
        PageInfo<Wzlist> wzlistPageInfo = page.toPageInfo();
        return wzlistPageInfo;
    }

    /**
     * 添加驾驶人的方法
     * @param jszlist 驾驶人集合类的方法
     */
    @PostMapping("add")
    public void add(@RequestBody Jszlist jszlist){

        api.add(jszlist);
    }

    /**
     * 修改前查询当前类的方法
     * @param jid 根据当前条的驾驶人编号查
     * @return
     */
    @GetMapping("findOne")
    public Jszlist findOne(Integer jid){
        return api.findOne(jid);
    }

    /**
     * 修改的方法
     * @param jszlist 前台传过来的驾驶人全部信息
     */
    @PostMapping("update")
    public void update(@RequestBody Jszlist jszlist){
        api.update(jszlist);
    }
}
