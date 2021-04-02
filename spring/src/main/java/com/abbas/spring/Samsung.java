package com.abbas.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	MobileProccesor cpu;
	public void config() {
		System.out.println("Octa core, 4gb Ram, 12mp camera");
		cpu.processor();
	}
	public MobileProccesor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProccesor cpu) {
		this.cpu = cpu;
	}
	
}
