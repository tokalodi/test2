package com.Test;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.PortInformation.PortInformation;

public class TestFile {
    

	public static void main(String[] args) {
		try{
			
			 KieServices ks = KieServices.Factory.get();
	    	KieContainer kContainer = ks.getKieClasspathContainer();
	        KieSession kSession = kContainer.newKieSession("ksession-process");
	        PortInformation  PortObject = new PortInformation();
	        System.out.println("Executing the results");
	        kSession.insert(PortObject);
	        kSession.startProcess("com.Test", null);    

	        kSession.fireAllRules();
	        System.out.println("Executed the results");
	        System.out.println(PortObject.getNativeIpValue());
	        System.out.println(PortObject.getServiceNameValue());
			
		}catch(Exception e){
			
			e.printStackTrace();
		}

	}

}
