package com.entity.vo;

import com.entity.QiuzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 求职信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-28 23:34:02
 */
public class QiuzhixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工资待遇
	 */
	
	private String gongzidaiyu;
		
	/**
	 * 学历要求
	 */
	
	private String xueliyaoqiu;
		
	/**
	 * 工作地址
	 */
	
	private String gongzuodizhi;
		
	/**
	 * 企业号
	 */
	
	private String qiyehao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 简历
	 */
	
	private String jianli;
		
	/**
	 * 学生号
	 */
	
	private String xueshenghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
				
	
	/**
	 * 设置：简历
	 */
	 
	public void setJianli(String jianli) {
		this.jianli = jianli;
	}
	
	/**
	 * 获取：简历
	 */
	public String getJianli() {
		return jianli;
	}
				
	
	/**
	 * 设置：学生号
	 */
	 
	public void setXueshenghao(String xueshenghao) {
		this.xueshenghao = xueshenghao;
	}
	
	/**
	 * 获取：学生号
	 */
	public String getXueshenghao() {
		return xueshenghao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
