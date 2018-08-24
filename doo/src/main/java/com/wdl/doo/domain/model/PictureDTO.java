package com.wdl.doo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 图片信息表DTO
 * 
 * @author shipf
 * @date 2017年11月8日
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PictureDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;//id
	private String customerType;//客户类型
	private Integer primaryType;//主键类型(1:orderId;2：productId)
	private Integer imageSequence;//图片次序
	private String fileName;//文件名称
	private String modifier;//修改者
	private java.util.Date modifiedDate;//修改时间
	private String extraInfo;//扩展字段
	private String isDeleted;//是否删除(Y：是，N：否)
	private String imgUrl;//图片路径
	private String creater;//创建者
	private String primaryId;//主键id
	private String idType;//证件分类
	private String documentTypeCode;//文件类型编码
	private java.util.Date createdDate;//创建时间
	private String quoteNo;//投保单号
	private String channelEnum;//渠道

}
