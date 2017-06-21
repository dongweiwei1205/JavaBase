package cn.com.dww.javabase;

/**
 * @author Administrator
 *
 */
public class StringBufferLearn {

	
	public static void main(String args[]){
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
//		test6();
		test7();

		
		
	}
	
	/**
	 * 字符串连接操作
	 */
	public static void test1(){
		
		StringBuffer buf=new StringBuffer();
		buf.append("hello ");
		buf.append("world !!!!");
		buf.append("\n");
		buf.append("数字=").append(12).append("\n");
		buf.append("字符=").append('d').append("\n");
		buf.append("布尔:").append(true);
		System.out.println(buf);
		//修改Stringbuffer的内容；
		fun(buf);
		System.out.println(buf);
	}
	
	/**
	 * stringbuffer的内容是可以改变的
	 */
	public static void fun(StringBuffer buffer){
		buffer.append("我变了"); 		
	}
	
	
	/**
	 * 在任意处为Stringbuffer添加内容
	 */
	public static void test2(){
		StringBuffer buf=new StringBuffer();
		buf.append("hello");
		buf.insert(0, "world~~~");//在字符串的前面插入字符串,即在0位置后1位置（字符串第一个字符）前查入
		System.out.println(buf);
		buf.insert(buf.length(), "buggg---");
		System.out.println(buf);
	}
	
	/**
	 * 字符串反转操作
	 */
	public static void test3(){
		
	   StringBuffer buf=new StringBuffer();
	   buf.append("sadffjk");
	   buf.reverse();
	   System.out.println(buf);
	 	
		
	}
	
	/**
	 * 替换指定范围的内容
	 */
	public static void test4(){
		StringBuffer buf=new StringBuffer();
		buf.append("hello bbb").append("---asjdfsd");
		buf.replace(9, 12, "1111");
		System.out.println(buf);
	}
	
	
	/**
	 * 字符串截取
	 */
	public static void test5(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("fjsfsjfk");
		String str=buffer.substring(2, 5);
		System.out.println(str);
		
		 
	}
	
	/**
	 *删除指定范围的字符串
	 *  */
	public static void test6(){
		StringBuffer buf=new StringBuffer();
		buf.append("sjfsdjflsd");
		buf.delete(3, 6);
		System.out.println(buf);
		 
	}
	
	
	/**
	 * 查询指定的内容是否存在
	 */
	public static void test7(){
		StringBuffer buf=new StringBuffer();
		buf.append("sjfsjkfdflsfdl");
		buf.indexOf("ls");
		System.out.println(buf.indexOf("ls"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
