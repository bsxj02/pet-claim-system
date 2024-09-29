package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 救助信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-29 15:35:33
 */
@TableName("jiuzhuxinxi")
public class JiuzhuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiuzhuxinxiEntity() {
		
	}
	
	public JiuzhuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 宠物名称
	 */
					
	private String chongwumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 宠物种类
	 */
					
	private String chongwuzhonglei;
	
	/**
	 * 救助详情
	 */
					
	private String jiuzhuxiangqing;
	
	/**
	 * 救助账号
	 */
					
	private String jiuzhuzhanghao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宠物名称
	 */
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：宠物种类
	 */
	public void setChongwuzhonglei(String chongwuzhonglei) {
		this.chongwuzhonglei = chongwuzhonglei;
	}
	/**
	 * 获取：宠物种类
	 */
	public String getChongwuzhonglei() {
		return chongwuzhonglei;
	}
	/**
	 * 设置：救助详情
	 */
	public void setJiuzhuxiangqing(String jiuzhuxiangqing) {
		this.jiuzhuxiangqing = jiuzhuxiangqing;
	}
	/**
	 * 获取：救助详情
	 */
	public String getJiuzhuxiangqing() {
		return jiuzhuxiangqing;
	}
	/**
	 * 设置：救助账号
	 */
	public void setJiuzhuzhanghao(String jiuzhuzhanghao) {
		this.jiuzhuzhanghao = jiuzhuzhanghao;
	}
	/**
	 * 获取：救助账号
	 */
	public String getJiuzhuzhanghao() {
		return jiuzhuzhanghao;
	}

}
