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
	 * �ַ������Ӳ���
	 */
	public static void test1(){
		
		StringBuffer buf=new StringBuffer();
		buf.append("hello ");
		buf.append("world !!!!");
		buf.append("\n");
		buf.append("����=").append(12).append("\n");
		buf.append("�ַ�=").append('d').append("\n");
		buf.append("����:").append(true);
		System.out.println(buf);
		//�޸�Stringbuffer�����ݣ�
		fun(buf);
		System.out.println(buf);
	}
	
	/**
	 * stringbuffer�������ǿ��Ըı��
	 */
	public static void fun(StringBuffer buffer){
		buffer.append("�ұ���"); 		
	}
	
	
	/**
	 * �����⴦ΪStringbuffer�������
	 */
	public static void test2(){
		StringBuffer buf=new StringBuffer();
		buf.append("hello");
		buf.insert(0, "world~~~");//���ַ�����ǰ������ַ���,����0λ�ú�1λ�ã��ַ�����һ���ַ���ǰ����
		System.out.println(buf);
		buf.insert(buf.length(), "buggg---");
		System.out.println(buf);
	}
	
	/**
	 * �ַ�����ת����
	 */
	public static void test3(){
		
	   StringBuffer buf=new StringBuffer();
	   buf.append("sadffjk");
	   buf.reverse();
	   System.out.println(buf);
	 	
		
	}
	
	/**
	 * �滻ָ����Χ������
	 */
	public static void test4(){
		StringBuffer buf=new StringBuffer();
		buf.append("hello bbb").append("---asjdfsd");
		buf.replace(9, 12, "1111");
		System.out.println(buf);
	}
	
	
	/**
	 * �ַ�����ȡ
	 */
	public static void test5(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("fjsfsjfk");
		String str=buffer.substring(2, 5);
		System.out.println(str);
		
		 
	}
	
	/**
	 *ɾ��ָ����Χ���ַ���
	 *  */
	public static void test6(){
		StringBuffer buf=new StringBuffer();
		buf.append("sjfsdjflsd");
		buf.delete(3, 6);
		System.out.println(buf);
		 
	}
	
	
	/**
	 * ��ѯָ���������Ƿ����
	 */
	public static void test7(){
		StringBuffer buf=new StringBuffer();
		buf.append("sjfsjkfdflsfdl");
		buf.indexOf("ls");
		System.out.println(buf.indexOf("ls"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
