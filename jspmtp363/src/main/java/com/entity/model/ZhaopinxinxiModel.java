package com.entity.model;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 招聘信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-28 23:34:02
 */
public class ZhaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 工资待遇
	 */
	
	private String gongzidaiyu;
		
	/**
	 * 招聘人数
	 */
	
	private Integer zhaopinrenshu;
		
	/**
	 * 学历要求
	 */
	
	private String xueliyaoqiu;
		
	/**
	 * 工作地址
	 */
	
	private String gongzuodizhi;
		
	/**
	 * 岗位职责
	 */
	
	private String gangweizhize;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 企业号
	 */
	
	private String qiyehao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
				
	
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
	 * 设置：工资待遇
	 */
	 
	public void setGongzidaiyu(String gongzidaiyu) {
		this.gongzidaiyu = gongzidaiyu;
	}
	
	/**
	 * 获取：工资待遇
	 */
	public String getGongzidaiyu() {
		return gongzidaiyu;
	}
				
	
	/**
	 * 设置：招聘人数
	 */
	 
	public void setZhaopinrenshu(Integer zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：招聘人数
	 */
	public Integer getZhaopinrenshu() {
		return zhaopinrenshu;
	}
				
	
	/**
	 * 设置：学历要求
	 */
	 
	public void setXueliyaoqiu(String xueliyaoqiu) {
		this.xueliyaoqiu = xueliyaoqiu;
	}
	
	/**
	 * 获取：学历要求
	 */
	public String getXueliyaoqiu() {
		return xueliyaoqiu;
	}
				
	
	/**
	 * 设置：工作地址
	 */
	 
	public void setGongzuodizhi(String gongzuodizhi) {
		this.gongzuodizhi = gongzuodizhi;
	}
	
	/**
	 * 获取：工作地址
	 */
	public String getGongzuodizhi() {
		return gongzuodizhi;
	}
				
	
	/**
	 * 设置：岗位职责
	 */
	 
	public void setGangweizhize(String gangweizhize) {
		this.gangweizhize = gangweizhize;
	}
	
	/**
	 * 获取：岗位职责
	 */
	public String getGangweizhize() {
		return gangweizhize;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：企业号
	 */
	 
	public void setQiyehao(String qiyehao) {
		this.qiyehao = qiyehao;
	}
	
	/**
	 * 获取：企业号
	 */
	public String getQiyehao() {
		return qiyehao;
	}
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
			
}
