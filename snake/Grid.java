package snake;

/**
 * 网格.
 * 当一条蛇的状态更新的时候, 你需要把蛇画在网格上面.
 * @author wesley
 */
public class Grid {

	private int   gridSize;		/* 网格的宽度 */
	private Snake snake;		/* 网格上面有一条蛇 */
	private Food  food;			/* 网格上面还有一块食物 */
	
	private int   map[][];		/* 用一个二维数组来表示网格 */
	
	/**
	 *  下面的3个常数是填在二维数组map中的3种不同数字.
	 *  如果一个格子是空格子的话, 填0.
	 *  如果一个格子被蛇的身体占用的话, 填1.
	 *  如果一个格子里面有食物的话, 填2.
	 */
	public final static int EMPTY      = 0;
	public final static int SNAKE_BODY = 1;
	public final static int FOOD       = 2;
	
	/**
	 * 网格的构造方法.
	 * 构造新网格的时候, 需要新建二维数组.
	 * 新建二维数组后, 记得把所有格子中的数字改成0. 
	 * (可以调用clearGrid()方法清空).
	 * @param gridSize 网格的大小.
	 */
	public Grid(int gridSize) {
		this.gridSize = gridSize;
		this.map = new int[gridSize][gridSize];
		// 在这里写代码.
	}
	
	/**
	 * 清空整个网格版面 (使用上面定义的EMPTY常数).
	 */
	public void clearGrid() {
		// 在这里写代码.
	}
	
	/**
	 * 把蛇画在网格上 (使用上面定义的SNAKE_BODY常数).
	 */
	public void drawSnake() {
		// 在这里写代码.
	}
	
	/**
	 * 把食物画在网格上 (使用上面定义的FOOD常数).
	 */
	public void drawFood() {
		// 在这里写代码.
	}
	
	/**
	 * 获取map[r][c]中的数字.
	 * @param r 第r行.
	 * @param c 第r行的第c个数字.
	 * @return map[r][c]中的数字.
	 */
	public int getMapValue(int r, int c) {
		return map[r][c];
	}
	
	/**
	 * 刷新版面.
	 * 移动蛇身体后, 刷新一下整个版面.
	 * 如果游戏结束的话，就不再刷新版面.
	 */
	public void refreshGrid() {
		// 在这里写代码.
	}
	
	/**
	 * 判断游戏是不是已经结束了.
	 * 当蛇咬到自己, 或者撞墙的时候, 游戏就结束了.
	 * @return 如果游戏结束, 返回true. 否则, 返回false.
	 */
	public boolean isGameOver() {
		// 在这里写代码.
		return true;
	}
	
	/**
	 * 判断蛇是不是吃到食物了.
	 * @return 如果食物被蛇吃到的话, 返回true. 否则返回false.
	 */
	public boolean snakeEatsFood() {
		// 在这里写代码.
		return false;
	}
	
	// 请不要修改下面这个函数的内容.
	public Snake getSnake() {
		return this.snake;
	}
	
}

