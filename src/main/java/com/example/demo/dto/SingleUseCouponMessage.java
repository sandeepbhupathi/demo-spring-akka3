package com.example.demo.dto;

public class SingleUseCouponMessage {

	private String folderName;
	private int noOfCoupons;
	private String promotionId;
	
	public SingleUseCouponMessage(String folderName, int noOfCoupons, String promotionId) {
		super();
		this.folderName = folderName;
		this.noOfCoupons = noOfCoupons;
		this.promotionId = promotionId;
	}
	
	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public int getNoOfCoupons() {
		return noOfCoupons;
	}

	public void setNoOfCoupons(int noOfCoupons) {
		this.noOfCoupons = noOfCoupons;
	}

	public String getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	
	
}
