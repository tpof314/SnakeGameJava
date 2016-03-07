package snake;

public class Grid {
	
	private int   gridSize;
	private Snake snake;
	private Food  food;
	
	private int   map[][];
	
	public final static int EMPTY      = 0;
	public final static int SNAKE_BODY = 1;
	public final static int FOOD       = 2;
	
	
	public Grid(int gridSize) {
		
	}
	
	/**
	 * 清空整个网格版面 (使用上面定义的EMPTY常数).
	 */
	public void clearGrid() {
		
	}
	
	/**
	 * 把蛇画在网格上 (使用上面定义的SNAKE_BODY常数).
	 */
	public void drawSnake() {
		
	}
	
	/**
	 * 把食物画在网格上 (使用上面定义的FOOD常数).
	 */
	public void drawFood() {
		
	}
	
	/**
	 * 获取map[r][c]中的数字.
	 * @param r 第r行.
	 * @param c 第r行的第c个数字.
	 * @return map[r][c]中的数字.
	 */
	public int getMapValue(int r, int c) {
		return EMPTY;
	}
	
	/**
	 * 刷新版面.
	 * 移动蛇身体后, 刷新一下整个版面.
	 */
	public void refreshGrid() {
		
	}
	
	public Snake getSnake() {
		return this.snake;
	}
	
}

