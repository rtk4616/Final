
public class PlayerEx extends Player {

	public PlayerEx(int chips) {
		super("Example", chips); //Example用姓名跟學號取代 xx-xx xxxxx (B96123)
		// TODO Auto-generated constructor stub
	}

	@Override
	public int make_bet() {
		setBet(5);
		if (getBet() <= get_current_chips()) {
			return getBet();
		} else {
			System.out.println("Your Bet is " + getBet() + ", You don't have so many chips");
			setBet(0);
			return getBet();
		}
	}

	@Override
	public boolean hit_me(Table tbl) {
		int total_value = getTotalValue();

		if (total_value >= 17) {
			return false;
		} else {
			return true;
		}

	}

}
