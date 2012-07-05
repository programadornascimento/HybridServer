package configuration;

import java.util.Date;

public class runtimeConfiguration {
	
	private static Date init = null;
	private static int tcpAccess = 0;
	private static int httpAccess = 0;
	
	public runtimeConfiguration(){
		init = new Date();
	}
	
	public static String showUptime(){
		Date now = new Date();
		return String.valueOf((now.getTime()-init.getTime())/1000);
	}
	
	public static int getTcpAccess() { return tcpAccess; }
	public static int getHttpAccess() { return httpAccess; }
	
	public static void incTcpAccess() { tcpAccess++; }
	public static void incHttpAccess() { httpAccess++; }
	
}
