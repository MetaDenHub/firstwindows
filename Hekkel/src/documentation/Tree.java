package documentation;

/**
 * �������� ��� �������� ������� ������������� ������������
 * 
 * @author Vinichenko
 * @author denisvinichenko977@gmail.com
 * @version 1.0
 * @since 1.0
 */
public class Tree 	{
	int height;
/**
 * @param Tree() ����������� ��� ��������� �� ������������
 * 
 * */
	Tree() {
		// TODO Auto-generated constructor stub
		System.out.println("������ ������");
		height = 0;
	}
	/**
	 * @param Tree(int initialHeight) ����������� � ���������� ��������
	 * */
	Tree(int initialHeight){
		height = initialHeight;
		System.out.print("�������� ������ ������ ������� " + height + " �");
	}
	void info() {
		System.out.println("������ ������� "+height+" �");
	}
	void info(String s) {
		System.out.println(s +": ������ ������� "+height+" �");
		
	}
}
