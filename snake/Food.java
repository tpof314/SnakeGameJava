package snake;

/**
 * 食物.
 * 给蛇吃的东西. 蛇吃到食物后, 会变长.
 * @author Wesley
 */
public class Food {
	private Cell location;
	private int  gridSize;
	
	/**
	 * 食物的构造方法
	 */
	public Food(int gridSize) {
		// 在这里写代码.
	}
	
	/**
	 * 为食物随机地换一个位置.
	 * 直接更新位置就行, 不需要关心这个新位置会不会和蛇重合.
	 */
	public void getNextPosition() {
		// 在这里写代码.
	}
	
	/**
	 * 获取食物的横坐标.
	 * @return 返回食物的横坐标.
	 */
	public int getX() {
		// 在这里写代码.
		return 0;
	}
	
	/**
	 * 获取食物的纵坐标.
	 * @return 返回食物的纵坐标.
	 */
	public int getY() {
		// 在这里写代码.
		return 0;
	}
}
