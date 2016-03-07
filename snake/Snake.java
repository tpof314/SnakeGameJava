package snake;
/**
 * 蛇.
 * 一条蛇有是由一串格子组成的.
 * @author wesley
 */
public class Snake {
	private Cell[] cells;		/* 组成蛇身体的格子 */
	private int    length;		/* 蛇的长度 */
	private int    direction;	/* 蛇的移动方向 */
	private int    gridSize;	/* 游戏版面的边长 */
	
	/* 蛇可以往4个方向移动. 这4个方向被定义成具体的常数值. */
	public final static int DIRECTION_UP    = 1;
	public final static int DIRECTION_DOWN  = 2;
	public final static int DIRECTION_LEFT  = 3;
	public final static int DIRECTION_RIGHT = 4;
	
	/**
	 * 新建一条蛇.
	 * 蛇出生的时候, 位于屏幕的左上角;
	 * 身体为水平方向, 长度为3格, 往右移动.
	 */
	public Snake(int gridSize) {
		
	}
	
	/**
	 * 蛇往前走一步.
	 */
	public void moveSnake() {
		
	}
	
	/**
	 * 判断一个格子(x, y)是不是在蛇的身上.
	 * @param x x坐标.
	 * @param y y坐标.
	 * @return 如果(x,y)是蛇身上的点, 返回true. 否则返回false.
	 */
	public boolean isCellOnSnake(int x, int y) {
		return false;
	}

	/**
	 * 判断一下蛇是不是咬到了自己.
	 * @return 如果蛇咬到了自己, 返回true. 否则返回false.
	 */
	public boolean biteItself() {
		return false;
	}
	
	/**
	 * 判断一下蛇是不是撞到墙了.
	 * @return 如果蛇撞墙了, 返回true. 否则返回false.
	 */
	public boolean hitBoundary() {
		return false;
	}
	
	/**
	 * 改变蛇的运动方向. 
	 * 改变方向的时候, 需要做额外的方向判断. 比方说, 
	 * 如果蛇目前正在向右移动，那么，它不能改成向左移动.
	 * @param direction 需要改变的方向.
	 */
	public void changeDirection(int direction) {
		
	}
	
	/**
	 * 判断一个位置(x, y)是不是落在网格范围里面.
	 * @param x x坐标.
	 * @param y y坐标.
	 * @return 如果(x, y)在网格范围内, 返回true. 否则返回false.
	 */
	public boolean isValidPosition(int x, int y) {
		return false;
	}
}
