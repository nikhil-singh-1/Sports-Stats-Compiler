
public interface PlayerBlock {
	
	public PlayerStats getStats();
	
	public PlayerStats peekStats();
	
	public boolean isEmpty();
	
	public void addPlayerStats(PlayerStats stats);

}
