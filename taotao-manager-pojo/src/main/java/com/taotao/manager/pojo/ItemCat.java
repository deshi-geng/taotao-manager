package com.taotao.manager.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_item_cat")
public class ItemCat extends BasePojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "parent_id")
	private Long parentId;

	private String name;

	private Integer status;

	@Column(name = "sort_order")
	private Integer sortOrder;

	@Column(name = "is_parent")
	private Boolean isParent;

	// text：显示节点文本。
	// state：节点状态，'open' 或 'closed'，默认：'open'。如果为'closed'的时候，将不自动展开该节点。
	public String getText() {

		return this.getName();
	}

	public String getState() {
		return this.getIsParent() ? "closed" : "open";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public static void main(String[] args) {
		float a = 1.3f;
		double b = 1.3;

		long c = 130l;

		float aa = a * 3;
		double bb = b * 3;
		System.out.println(aa);
		System.out.println(bb);

		System.out.println(c * 3);

	}

}
