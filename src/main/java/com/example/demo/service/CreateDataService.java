package com.example.demo.service;

import java.util.stream.IntStream;

import javax.inject.Named;

import com.example.demo.dto.SingleUseCouponMessage;

@Named("CreateDataService")
public class CreateDataService {


	public void createSingleUseCoupon(SingleUseCouponMessage singleUseCoupon) {
		System.out.println("============================"+singleUseCoupon.getFolderName()+"===========================");
		IntStream.range(0, singleUseCoupon.getNoOfCoupons()).forEach( i -> System.out.println("coupon"+i));
		
	}
}
