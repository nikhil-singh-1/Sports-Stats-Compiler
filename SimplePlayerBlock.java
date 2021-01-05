
import java.util.ArrayList;

public class SimplePlayerBlock implements PlayerBlock{
	private ArrayList<PlayerStats> playerStats;
	
	public SimplePlayerBlock() {
		 this.playerStats = new ArrayList<PlayerStats>();
	}

	@Override
	public PlayerStats getStats() {
		// TODO Auto-generated method stub
		return this.playerStats.remove(0);
	}

	@Override
	public PlayerStats peekStats() {
		// TODO Auto-generated method stub
		return this.playerStats.get(0);
	}

	@Override
	public boolean isEmpty() {
		if (this.playerStats.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public void addPlayerStats(PlayerStats stats) {
		// TODO Auto-generated method stub
		this.playerStats.add(stats);
	}

}
