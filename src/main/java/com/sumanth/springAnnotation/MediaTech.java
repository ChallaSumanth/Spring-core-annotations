package com.sumanth.springAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTech implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("2nd Best CPU");
	}

}
