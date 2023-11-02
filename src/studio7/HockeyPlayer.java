package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNum;
	private boolean left;
	private boolean right;
	private int goal;
	private int assist;
	private int game;
	
	public HockeyPlayer(String name, int jerseyNum, boolean left, boolean right)
	{
		this.name=name;
		this.jerseyNum=jerseyNum;
		this.left=left;
		this.right=right;
		this.goal=0;
		this.assist=0;
		this.game=0;
	}

	public void submitGame(int goal, int assist)
	{
		this.goal+=goal;
		this.assist+=assist;
		this.game++;
	}
	
	public int getPoint()
	{
		return this.goal+this.assist;
	}
	
	public int getGoal() {
		return goal;
	}

	public int getAssist() {
		return assist;
	}

	public int getGame() {
		return game;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNum() {
		return jerseyNum;
	}

	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}
}
