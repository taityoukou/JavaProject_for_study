public class TemplateTest {

	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}
/*
模板方法模式（Template Method）

解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，
可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用。

模板方法模式的主要思想：定义一个算法流程，将一些特定步骤的具体实现、延迟到子类。使得可以在不改变算法流程的情况下，
通过不同的子类、来实现“定制”流程中的特定的步骤。
策略模式的主要思想：使不同的算法可以被相互替换，而不影响客户端的使用。

在思想和意图上看，模板方法更加强调：
1）定义一条线（算法流程），线上的多个点是可以变化的（具体实现在子类中完成），线上的多个点一定是会被执行的，并且一定是按照特定流程被执行的。
2）算法流程只有唯一的入口，对于点的访问是受限的【通常用受保护的虚函数来定义可变点】。

策略模式更注重于： 一个“策略”是一个 整体的(完整的) 算法，算法是可以被整体替换的。而模板方法只能被替换其中的特定点，算法流程是固定不可变的。

在这样的细节上看来，模板方法 和 一组策略模式 是不可以划等号的。
*/