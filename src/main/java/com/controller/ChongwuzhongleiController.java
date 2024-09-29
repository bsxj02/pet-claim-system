package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChongwuzhongleiEntity;
import com.entity.view.ChongwuzhongleiView;

import com.service.ChongwuzhongleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物种类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-29 15:35:33
 */
@RestController
@RequestMapping("/chongwuzhonglei")
public class ChongwuzhongleiController {
    @Autowired
    private ChongwuzhongleiService chongwuzhongleiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuzhongleiEntity chongwuzhonglei,
		HttpServletRequest request){
        EntityWrapper<ChongwuzhongleiEntity> ew = new EntityWrapper<ChongwuzhongleiEntity>();

		PageUtils page = chongwuzhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuzhonglei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuzhongleiEntity chongwuzhonglei, 
		HttpServletRequest request){
        EntityWrapper<ChongwuzhongleiEntity> ew = new EntityWrapper<ChongwuzhongleiEntity>();

		PageUtils page = chongwuzhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuzhonglei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuzhongleiEntity chongwuzhonglei){
       	EntityWrapper<ChongwuzhongleiEntity> ew = new EntityWrapper<ChongwuzhongleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuzhonglei, "chongwuzhonglei")); 
        return R.ok().put("data", chongwuzhongleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuzhongleiEntity chongwuzhonglei){
        EntityWrapper< ChongwuzhongleiEntity> ew = new EntityWrapper< ChongwuzhongleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuzhonglei, "chongwuzhonglei")); 
		ChongwuzhongleiView chongwuzhongleiView =  chongwuzhongleiService.selectView(ew);
		return R.ok("查询宠物种类成功").put("data", chongwuzhongleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuzhongleiEntity chongwuzhonglei = chongwuzhongleiService.selectById(id);
        return R.ok().put("data", chongwuzhonglei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuzhongleiEntity chongwuzhonglei = chongwuzhongleiService.selectById(id);
        return R.ok().put("data", chongwuzhonglei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuzhongleiEntity chongwuzhonglei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuzhonglei);
        chongwuzhongleiService.insert(chongwuzhonglei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuzhongleiEntity chongwuzhonglei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongwuzhonglei);
        chongwuzhongleiService.insert(chongwuzhonglei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwuzhongleiEntity chongwuzhonglei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuzhonglei);
        chongwuzhongleiService.updateById(chongwuzhonglei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuzhongleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
