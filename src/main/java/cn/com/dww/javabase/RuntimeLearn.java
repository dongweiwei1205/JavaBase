package cn.com.dww.javabase;

public class RuntimeLearn {
	
	
	
/**
 * 得到jvm的内存空间信息
 */
public static void main(String args[]){
	Runtime runtime=Runtime.getRuntime();
	System.out.println("jvm最大内存空间："+runtime.maxMemory());
	System.out.println("jvm空闲内存空间："+runtime.freeMemory());
	
	
	
}
	
	
	
	
	
	
}
