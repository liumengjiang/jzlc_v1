package com.jzlc.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * 客户账户基础信息
 * */

@Data
public class Consumer implements Serializable{
	/***/
	public static Integer NORMAL= 0;
	private static final long serialVersionUID = 1L;
	private String consumerId;
	private String consumerName;
	private String password;
	/**登录状态,默认为0 正常  1表示已登录 2表示已注销 3表示已冻结*/
	private Integer accountsFlag = NORMAL;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date createTime;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date updateTime;
}
