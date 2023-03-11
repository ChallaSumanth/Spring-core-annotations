package com.sumanth.springAnnotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component // Non qualified and DE capitalized name will be given as class object
public class Samsung {

	@Autowired //it will search for object
	//@Qualifier("snapdragon")
	@Qualifier("mediaTech") //to match the name
	MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config()
	{
		System.out.println("Octa Core, 12 gb Ram");
		cpu.process();
	}
}
