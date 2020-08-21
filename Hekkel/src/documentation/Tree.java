package documentation;

/**
 * Програма для вивчення порядку ініціалізування конструкторів
 * 
 * @author Vinichenko
 * @author denisvinichenko977@gmail.com
 * @version 1.0
 * @since 1.0
 */
public class Tree 	{
	int height;
/**
 * @param Tree() конструктор без параметрів по замовчуванню
 * 
 * */
	Tree() {
		// TODO Auto-generated constructor stub
		System.out.println("Сажаем росток");
		height = 0;
	}
	/**
	 * @param Tree(int initialHeight) конструктор з параметром інтеджер
	 * */
	Tree(int initialHeight){
		height = initialHeight;
		System.out.print("Создание нового дерева высотой " + height + " м");
	}
	void info() {
		System.out.println("дерево высотой "+height+" м");
	}
	void info(String s) {
		System.out.println(s +": дерево высотой "+height+" м");
		
	}
}
