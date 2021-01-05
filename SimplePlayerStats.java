
public class SimplePlayerStats implements PlayerStats {
	private int gameNumber;
	private String date;
	private String age;
	private String team;
	private String opponent;
	private String spread;
	private String minutePlayed;
	private int fieldGoalMade;
	private int fieldGoalAttempted;
	private double fieldGoalPercentage;
	private int threePointMade;
	private int threePointAttempted;
	private double threePointPercentage;
	private int freeThrowMade;
	private int freeThrowAttempted;
	private double freeThrowPercentage;
	private int offensiveRebound;
	private int defensiveRebound;
	private int totalRebound;
	private int assist;
	private int steal;
	private int block;
	private int turnover;
	private int personalFoul;
	private int point;
	private int plusMinus;
	
	public SimplePlayerStats() {
		this.gameNumber = 0;
		this.date = "";
		this.age = "";
		this.team = "";
		this.opponent = "";
		this.spread = "";
		this.minutePlayed = "";
		this.fieldGoalMade = 0;
		this.fieldGoalAttempted = 0;
		this.fieldGoalPercentage = 0.0;
		this.threePointMade = 0;
		this.threePointAttempted = 0;
		this.threePointPercentage = 0.0;
		this.freeThrowMade = 0;
		this.freeThrowAttempted = 0;
		this.freeThrowPercentage = 0.0;
		this.offensiveRebound = 0;
		this.defensiveRebound = 0;
		this.totalRebound = 0;
		this.assist = 0;
		this.steal = 0;
		this.block = 0;
		this.turnover = 0;
		this.personalFoul = 0;
		this.point = 0;
		this.plusMinus = 0;
		
	}

	@Override
	public int getGameNumber() {
		// TODO Auto-generated method stub
		return this.gameNumber;
	}

	@Override
	public void setGameNumber(double gameNumber) {
		// TODO Auto-generated method stub
		this.gameNumber = (int)gameNumber;
		
	}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return this.date;
	}

	@Override
	public void setDate(String date) {
		// TODO Auto-generated method stub
		this.date = date;
		
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public void setAge(String age) {
		// TODO Auto-generated method stub
		this.age = age;
		
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return this.team;
	}

	@Override
	public void setTeam(String team) {
		// TODO Auto-generated method stub
		this.team = team;
		
	}

	@Override
	public String getOpponent() {
		// TODO Auto-generated method stub
		return this.opponent;
	}

	@Override
	public void setOpponent(String opponent) {
		// TODO Auto-generated method stub
		this.opponent = opponent;
		
	}

	@Override
	public String getSpread() {
		// TODO Auto-generated method stub
		return this.spread;
	}

	@Override
	public void setSpread(String spread) {
		// TODO Auto-generated method stub
		this.spread = spread;
		
	}

	@Override
	public String getMinutePlayed() {
		// TODO Auto-generated method stub
		return this.minutePlayed;
	}

	@Override
	public void setMinutePlayed(String minutePlayed) {
		// TODO Auto-generated method stub
		this.minutePlayed = minutePlayed;
		
	}

	@Override
	public int getFieldGoalMade() {
		// TODO Auto-generated method stub
		return this.fieldGoalMade;
	}

	@Override
	public void setFieldGoalMade(double fieldGoalMade) {
		// TODO Auto-generated method stub
		this.fieldGoalMade = (int)fieldGoalMade;
		
	}

	@Override
	public int getFieldGoalAttempted() {
		// TODO Auto-generated method stub
		return this.fieldGoalAttempted;
	}

	@Override
	public void setFieldGoalAttempted(double fieldGoalAttempted) {
		// TODO Auto-generated method stub
		this.fieldGoalAttempted = (int)fieldGoalAttempted;
		
	}

	@Override
	public double getFieldGoalPercentage() {
		// TODO Auto-generated method stub
		return this.fieldGoalPercentage;
	}

	@Override
	public void setFieldGoalPercentage(double fieldGoalPercentage) {
		// TODO Auto-generated method stub
		this.fieldGoalPercentage = fieldGoalPercentage;
		
	}

	@Override
	public int getThreePointMade() {
		// TODO Auto-generated method stub
		return this.threePointMade;
	}

	@Override
	public void setThreePointMade(double threePointMade) {
		// TODO Auto-generated method stub
		this.threePointMade = (int)threePointMade;
		
	}

	@Override
	public int getThreePointAttempted() {
		// TODO Auto-generated method stub
		return this.threePointAttempted;
	}

	@Override
	public void setThreePointAttempted(double threePointAttempted) {
		// TODO Auto-generated method stub
		this.threePointAttempted = (int)threePointAttempted;
		
	}

	@Override
	public double getThreePointPercentage() {
		// TODO Auto-generated method stub
		return this.threePointPercentage;
	}

	@Override
	public void setThreePointPercentage(double threePointPercentage) {
		// TODO Auto-generated method stub
		this.threePointPercentage = threePointPercentage;
		
	}

	@Override
	public int getFreeThrowMade() {
		// TODO Auto-generated method stub
		return this.freeThrowMade;
	}

	@Override
	public void setFreeThrowMade(double freeThrowMade) {
		// TODO Auto-generated method stub
		this.freeThrowMade = (int)freeThrowMade;
		
	}

	@Override
	public int getFreeThrowAttempted() {
		// TODO Auto-generated method stub
		return this.freeThrowAttempted;
	}

	@Override
	public void setFreeThrowAttempted(double freeThrowAttempted) {
		// TODO Auto-generated method stub
		this.freeThrowAttempted = (int)freeThrowAttempted;
		
	}

	@Override
	public double getFreeThrowPercentage() {
		// TODO Auto-generated method stub
		return this.freeThrowPercentage;
	}

	@Override
	public void setFreeThrowPercentage(double freeThrowPercentage) {
		// TODO Auto-generated method stub
		this.freeThrowPercentage = freeThrowPercentage;
		
	}

	@Override
	public int getOffensiveRebound() {
		// TODO Auto-generated method stub
		return this.offensiveRebound;
	}

	@Override
	public void setOffensiveRebound(double offensiveRebound) {
		// TODO Auto-generated method stub
		this.offensiveRebound = (int)offensiveRebound;
		
	}

	@Override
	public int getDefensiveRebound() {
		// TODO Auto-generated method stub
		return this.defensiveRebound;
	}

	@Override
	public void setDefensiveRebound(double defensiveRebound) {
		// TODO Auto-generated method stub
		this.defensiveRebound = (int)defensiveRebound;
		
	}

	@Override
	public int getTotalRebound() {
		// TODO Auto-generated method stub
		return this.totalRebound;
	}

	@Override
	public void setTotalRebound(double totalRebound) {
		// TODO Auto-generated method stub
		this.totalRebound = (int)totalRebound;
		
	}

	@Override
	public int getAssist() {
		// TODO Auto-generated method stub
		return this.assist;
	}

	@Override
	public void setAssist(double assist) {
		// TODO Auto-generated method stub
		this.assist = (int)assist;
		
	}

	@Override
	public int getSteal() {
		// TODO Auto-generated method stub
		return this.steal;
	}

	@Override
	public void setSteal(double steal) {
		// TODO Auto-generated method stub
		this.steal = (int)steal;
		
	}

	@Override
	public int getBlock() {
		// TODO Auto-generated method stub
		return this.block;
	}

	@Override
	public void setBlock(double block) {
		// TODO Auto-generated method stub
		this.block = (int)block;
		
	}

	@Override
	public int getTurnover() {
		// TODO Auto-generated method stub
		return this.turnover;
	}

	@Override
	public void setTurnover(double turnover) {
		// TODO Auto-generated method stub
		this.turnover = (int)turnover;
		
	}

	@Override
	public int getPersonalFoul() {
		// TODO Auto-generated method stub
		return this.personalFoul;
	}

	@Override
	public void setPersonalFoul(double personalFoul) {
		// TODO Auto-generated method stub
		this.personalFoul = (int)personalFoul;
		
	}

	@Override
	public int getPoint() {
		// TODO Auto-generated method stub
		return this.point;
	}

	@Override
	public void setPoint(double point) {
		// TODO Auto-generated method stub
		this.point = (int)point;
		
	}

	@Override
	public int getPlusMinus() {
		// TODO Auto-generated method stub
		return this.plusMinus;
	}

	@Override
	public void SetPlusMinus(double plusMinus) {
		// TODO Auto-generated method stub
		this.plusMinus = (int)plusMinus;
		
	}

}
