package com.PortInformation;
import java.util.ArrayList;




public class PortInformation {
	
	public String nativeIpValue;
	public boolean nativeIpIsUpdatable;
	public boolean nativeIPIsRequired;
	public boolean nativeIPIsDisplayed;
	public String serviceNameValue;
	public boolean serviceNameisUpdatable;
	public boolean serviceNameisRequired;
	public boolean serviceNameIPIsDisplayed;
	public ArrayList<String> actionDropdownList = new ArrayList<String>(20);
	public boolean actionIsUpdatable;
	public boolean actionIsRequired;
	public boolean actionIsDisplayed;
	public String actionSelectedValue;
	public ArrayList<String> portSpeedDropdownList = new ArrayList<String>(20);
	public boolean portSpeedIsUpdatable;
	public boolean portSpeedIsRequired;
	public boolean portSpeedIsDisplayed;
	public boolean portSpeedIsSelected;
	public String portSpeedSelectedValue;
	public ArrayList<String> portBillingOptionDropdownList = new ArrayList<String>(20);
	public boolean portBillingOptionIsUpdatable;
	public boolean portBillingOptionIsRequired;
	public boolean portBillingOptionIsDisplayed;
	public String portBillingOptionSelectedValue;
	public ArrayList<String> accessMethodTypeDropdownList = new ArrayList<String>(20);
	public boolean accessMethodTypeIsUpdatable;
	public boolean accessMethodTypeIsRequired;
	public boolean accessMethodTypeIsDisplayed;
	public String accessMethodTypeSelectedValue;
	public ArrayList<String> interconnectTypeDropdownList = new ArrayList<String>(20);
	public boolean interconnectTypeIsUpdatable;
	public boolean interconnectTypeIsRequired;
	public boolean interconnectTypeIsDisplayed;
	public String interconnectTypeSelectedValue;
	public String serviceValue;
	public boolean serviceIsUpdatable;
	public boolean serviceIsRequired;
	public boolean serviceIsSelected;
	public boolean serviceIsDisplayed;
	
	
	
	
	
	
	
	public String getNativeIpValue() {
		return nativeIpValue;
	}
	public boolean isNativeIpIsUpdatable() {
		return nativeIpIsUpdatable;
	}
	public boolean isNativeIPIsRequired() {
		return nativeIPIsRequired;
	}
	public boolean isNativeIPIsDisplayed() {
		return nativeIPIsDisplayed;
	}
	public String getServiceNameValue() {
		return serviceNameValue;
	}
	public boolean isServiceNameisUpdatable() {
		return serviceNameisUpdatable;
	}
	public boolean isServiceNameisRequired() {
		return serviceNameisRequired;
	}
	public boolean isServiceNameIPIsDisplayed() {
		return serviceNameIPIsDisplayed;
	}
	public ArrayList<String> getActionDropdownList() {
		return actionDropdownList;
	}
	public boolean isActionIsUpdatable() {
		return actionIsUpdatable;
	}
	public boolean isActionIsRequired() {
		return actionIsRequired;
	}
	public boolean isActionIsDisplayed() {
		return actionIsDisplayed;
	}
	public ArrayList<String> getPortSpeedDropdownList() {
		return portSpeedDropdownList;
	}
	public boolean isPortSpeedIsUpdatable() {
		return portSpeedIsUpdatable;
	}
	public boolean isPortSpeedIsRequired() {
		return portSpeedIsRequired;
	}
	public boolean isPortSpeedIsDisplayed() {
		return portSpeedIsDisplayed;
	}
	public boolean isPortSpeedIsSelected() {
		return portSpeedIsSelected;
	}
	public ArrayList<String> getPortBillingOptionDropdownList() {
		return portBillingOptionDropdownList;
	}
	public boolean isPortBillingOptionIsUpdatable() {
		return portBillingOptionIsUpdatable;
	}
	public boolean isPortBillingOptionIsRequired() {
		return portBillingOptionIsRequired;
	}
	public boolean isPortBillingOptionIsDisplayed() {
		return portBillingOptionIsDisplayed;
	}
	public ArrayList<String> getAccessMethodTypeDropdownList() {
		return accessMethodTypeDropdownList;
	}
	public boolean isAccessMethodTypeIsUpdatable() {
		return accessMethodTypeIsUpdatable;
	}
	public boolean isAccessMethodTypeIsRequired() {
		return accessMethodTypeIsRequired;
	}
	public boolean isAccessMethodTypeIsDisplayed() {
		return accessMethodTypeIsDisplayed;
	}
	public ArrayList<String> getInterconnectTypeDropdownList() {
		return interconnectTypeDropdownList;
	}
	public boolean isInterconnectTypeIsUpdatable() {
		return interconnectTypeIsUpdatable;
	}
	public boolean isInterconnectTypeIsRequired() {
		return interconnectTypeIsRequired;
	}
	public boolean isInterconnectTypeIsDisplayed() {
		return interconnectTypeIsDisplayed;
	}
	public String getActionSelectedValue() {
		return actionSelectedValue;
	}
	public String getPortSpeedSelectedValue() {
		return portSpeedSelectedValue;
	}
	public String getPortBillingOptionSelectedValue() {
		return portBillingOptionSelectedValue;
	}
	public String getAccessMethodTypeSelectedValue() {
		return accessMethodTypeSelectedValue;
	}
	public String getInterconnectTypeSelectedValue() {
		return interconnectTypeSelectedValue;
	}
	public void setActionSelectedValue(String actionSelectedValue) {
		this.actionSelectedValue = actionSelectedValue;
	}
	public void setPortSpeedSelectedValue(String portSpeedSelectedValue) {
		this.portSpeedSelectedValue = portSpeedSelectedValue;
	}
	public void setPortBillingOptionSelectedValue(String portBillingOptionSelectedValue) {
		this.portBillingOptionSelectedValue = portBillingOptionSelectedValue;
	}
	public void setAccessMethodTypeSelectedValue(String accessMethodTypeSelectedValue) {
		this.accessMethodTypeSelectedValue = accessMethodTypeSelectedValue;
	}
	public void setInterconnectTypeSelectedValue(String interconnectTypeSelectedValue) {
		this.interconnectTypeSelectedValue = interconnectTypeSelectedValue;
	}
	public void setNativeIpValue(String nativeIpValue) {
		this.nativeIpValue = nativeIpValue;
	}
	public void setNativeIpIsUpdatable(boolean nativeIpIsUpdatable) {
		this.nativeIpIsUpdatable = nativeIpIsUpdatable;
	}
	public void setNativeIPIsRequired(boolean nativeIPIsRequired) {
		this.nativeIPIsRequired = nativeIPIsRequired;
	}
	public void setNativeIPIsDisplayed(boolean nativeIPIsDisplayed) {
		this.nativeIPIsDisplayed = nativeIPIsDisplayed;
	}
	public void setServiceNameValue(String serviceNameValue) {
		this.serviceNameValue = serviceNameValue;
	}
	public void setServiceNameisUpdatable(boolean serviceNameisUpdatable) {
		this.serviceNameisUpdatable = serviceNameisUpdatable;
	}
	public void setServiceNameisRequired(boolean serviceNameisRequired) {
		this.serviceNameisRequired = serviceNameisRequired;
	}
	public void setServiceNameIPIsDisplayed(boolean serviceNameIPIsDisplayed) {
		this.serviceNameIPIsDisplayed = serviceNameIPIsDisplayed;
	}
	public void setActionDropdownList(ArrayList<String> actionDropdownList) {
		this.actionDropdownList = actionDropdownList;
	}
	public void setActionIsUpdatable(boolean actionIsUpdatable) {
		this.actionIsUpdatable = actionIsUpdatable;
	}
	public void setActionIsRequired(boolean actionIsRequired) {
		this.actionIsRequired = actionIsRequired;
	}
	public void setActionIsDisplayed(boolean actionIsDisplayed) {
		this.actionIsDisplayed = actionIsDisplayed;
	}
	public void setPortSpeedDropdownList(ArrayList<String> portSpeedDropdownList) {
		this.portSpeedDropdownList = portSpeedDropdownList;
	}
	public void setPortSpeedIsUpdatable(boolean portSpeedIsUpdatable) {
		this.portSpeedIsUpdatable = portSpeedIsUpdatable;
	}
	public void setPortSpeedIsRequired(boolean portSpeedIsRequired) {
		this.portSpeedIsRequired = portSpeedIsRequired;
	}
	public void setPortSpeedIsDisplayed(boolean portSpeedIsDisplayed) {
		this.portSpeedIsDisplayed = portSpeedIsDisplayed;
	}
	public void setPortSpeedIsSelected(boolean portSpeedIsSelected) {
		this.portSpeedIsSelected = portSpeedIsSelected;
	}
	public void setPortBillingOptionDropdownList(ArrayList<String> portBillingOptionDropdownList) {
		this.portBillingOptionDropdownList = portBillingOptionDropdownList;
	}
	public void setPortBillingOptionIsUpdatable(boolean portBillingOptionIsUpdatable) {
		this.portBillingOptionIsUpdatable = portBillingOptionIsUpdatable;
	}
	public void setPortBillingOptionIsRequired(boolean portBillingOptionIsRequired) {
		this.portBillingOptionIsRequired = portBillingOptionIsRequired;
	}
	public void setPortBillingOptionIsDisplayed(boolean portBillingOptionIsDisplayed) {
		this.portBillingOptionIsDisplayed = portBillingOptionIsDisplayed;
	}
	public void setAccessMethodTypeDropdownList(ArrayList<String> accessMethodTypeDropdownList) {
		this.accessMethodTypeDropdownList = accessMethodTypeDropdownList;
	}
	public void setAccessMethodTypeIsUpdatable(boolean accessMethodTypeIsUpdatable) {
		this.accessMethodTypeIsUpdatable = accessMethodTypeIsUpdatable;
	}
	public void setAccessMethodTypeIsRequired(boolean accessMethodTypeIsRequired) {
		this.accessMethodTypeIsRequired = accessMethodTypeIsRequired;
	}
	public void setAccessMethodTypeIsDisplayed(boolean accessMethodTypeIsDisplayed) {
		this.accessMethodTypeIsDisplayed = accessMethodTypeIsDisplayed;
	}
	public void setInterconnectTypeDropdownList(ArrayList<String> interconnectTypeDropdownList) {
		this.interconnectTypeDropdownList = interconnectTypeDropdownList;
	}
	public void setInterconnectTypeIsUpdatable(boolean interconnectTypeIsUpdatable) {
		this.interconnectTypeIsUpdatable = interconnectTypeIsUpdatable;
	}
	public void setInterconnectTypeIsRequired(boolean interconnectTypeIsRequired) {
		this.interconnectTypeIsRequired = interconnectTypeIsRequired;
	}
	public void setInterconnectTypeIsDisplayed(boolean interconnectTypeIsDisplayed) {
		this.interconnectTypeIsDisplayed = interconnectTypeIsDisplayed;
	}
	
		
}
