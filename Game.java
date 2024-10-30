package lab5;

/**
 * 
 * <p>
 * Computational thinking for a software developer/computer programmer is a
 * critical skill that is consistently applied. This lab requires you to develop
 * a solution using Java object-oriented programming that simulates a basketball
 * shootout game.
 * </p>
 * <p>
 * Two players agree to limit the number of ball throw attempts to 3 throws
 * each. The first player will make all three throw attempts (keep track of the
 * successful baskets made where the ball goes into the basket).
 * </p>
 * <p>
 * After the first player completes all three shots, the second player will make
 * all three throw attempts. The player who makes the most baskets (gets the
 * ball in the hoop) will be declared the winner. In the case of a tie, the tie
 * counter is incremented by one. Then, the game is repeated until a winner can
 * be determined. Note that the game can be repeated many times.
 * </p>
 * <p>
 * The losing player of the shootout game will have to give the winning player a
 * move ticket(s). The number of movie tickets is determined by the total number
 * of baskets made by the winner, less the total number of baskets made by the
 * losing player.
 * </p>
 * <p>
 * The losing player gives half of a movie ticket for every tied game (if there
 * were any tied games).
 * </p>
 * <p>
 * If the final calculated number of movie tickets has a decimal value, it
 * should be rounded to the nearest whole number since you can't purchase half a
 * ticket!
 * </p>
 * <p>
 * Example: If the player1 made a total of 3 baskets, and player2 made a total
 * of 2, and they had three tied games, the number of movie tickets would
 * initially be {@code 3-2=1}, but increased by {@code 3 x 0.5=1.5}, making the
 * owed number of tickets {@code 2.5} which must be rounded up to 3 movie
 * tickets.
 * </p>
 * 
 * 
 * <p>
 * Requirements: - Any use of Java library classes or methods (e.g., ArrayList,
 * System.arraycopy) is forbidden. (That is, there must not be an import
 * statement in the beginning of this class.) Violation of this requirement will
 * result in a 50% penalty of your marks.
 * </p>
 * <p>
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g.,
 * int[], String[]).
 * </p>
 */

public class Game {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	/**
	 * Two players agree to limit the number of ball throw attempts to 3 throws
	 * each. Constant value
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private final static int NUMOFATTEMPT = 3;

	/**
	 * The player1name is used to store the player name. The default value will be
	 * used if the name is not given to the player
	 * <p>
	 * The default value is <strong> <code>Unknown</code></strong>
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String player1Name;

	/**
	 * The player2name is used to store the player name. The default value will be
	 * used if the name is not given to the player
	 * <p>
	 * The default value is <strong> <code>Unknown</code></strong>
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String player2Name;

	/**
	 * The player1Attempt array is dynamically allocated at run time to store the
	 * result from player1 attempts
	 * <p>
	 * The default value is <strong> <code>false</code></strong> for each attempt
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private boolean[] player1Attempt;
	/**
	 * The player2Attempt array is dynamically allocated at run time to store the
	 * result from player2 attempts
	 * <p>
	 * The default value is <strong> <code>false</code></strong> for each attempt
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private boolean[] player2Attempt;

	/**
	 * The numberofTie is a counter to keep track of the number of tie games.
	 * <p>
	 * The default value is <strong> <code>zero</code></strong> before starting the
	 * game
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private int numberofTie;

	/**
	 * String Status keeps track of the current situation or status of the game.
	 * <p>
	 * This string changes during the game to reflect the game status.
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String status;

	// TODO: Your implementation starts here
	/*
	 * Your implementation starts here Recall that : 1. No System.out.println
	 * statements should appear here. Instead, you need to return the result. 2. No
	 * Scanner operations should appear here (e.g., input.nextInt()). Instead, refer
	 * to the input parameters of this method.
	 */

	// Primary constructor
	public Game(String p1, String p2) {
		player1Name = p1;
		player2Name = p2;

		numberofTie = 0;

		player1Attempt = new boolean[NUMOFATTEMPT];
		player2Attempt = new boolean[NUMOFATTEMPT];

		player1Attempt[0] = false;
		player1Attempt[1] = false;
		player1Attempt[2] = false;
		player2Attempt[0] = false;
		player2Attempt[1] = false;
		player2Attempt[2] = false;

		if (p1.equals("")) {
			player1Name = "Unknown";
			status = "The game was initialized with player1(" + player1Name + ") and player2(" + player2Name + ")";
		}
		if (p2.equals("")) {
			player2Name = "Unknown";
			status = "The game was initialized with player1(" + player1Name + ") and player2(" + player2Name + ")";
		}

		status = "The game was initialized with player1(" + player1Name + ") and player2(" + player2Name + ")";
	}

	// Default constructor
	public Game() {
		player1Name = "Unknown";
		player2Name = "Unknown";

		status = "The game was initialized with unknown players";

		player1Attempt = new boolean[NUMOFATTEMPT];
		player2Attempt = new boolean[NUMOFATTEMPT];

		numberofTie = 0;

	}

	public String getGameStatus() {
		return this.status;
	}

	public String getPlayer1Name() {
		return this.player1Name;
	}

	public String getPlayer2Name() {
		return this.player2Name;
	}

	public boolean[] getPlayer1Attempt() {
		return this.player1Attempt;
	}

	public boolean[] getPlayer2Attempt() {
		return this.player2Attempt;
	}

	public void setPlayer2Name(String newName) {
		this.player2Name = newName;
		this.status = "Player2 name is set";
	}

	public void setPlayer1Name(String newName) {
		this.player1Name = newName;
		this.status = "Player1 name is set";
	}

	public void setPlayer1AttempttoSucess(int attemptNo) {
		if ((0 <= attemptNo) && (attemptNo <= 2)) {
			this.player1Attempt[attemptNo] = true;
			this.status = "Player1 score attempt number (" + attemptNo + ")";
		}
	}

	public void setPlayer2AttempttoSucess(int attemptNo) {
		if ((0 <= attemptNo) && (attemptNo <= 2)) {
			this.player2Attempt[attemptNo] = true;
			this.status = "Player2 score attempt number (" + attemptNo + ")";
		}
	}

	public void setPlayer1AttempttoFail(int attemptNo) {
		if ((0 <= attemptNo) && (attemptNo <= 2)) {
			this.player1Attempt[attemptNo] = false;
			this.status = "Player1 fail to score attempt number (" + attemptNo + ")";
		}
	}

	public void setPlayer2AttempttoFail(int attemptNo) {
		if ((0 <= attemptNo) && (attemptNo <= 2)) {
			this.player2Attempt[attemptNo] = false;
			this.status = "Player2 fail to score attempt number (" + attemptNo + ")";
		}
	}

	public int getNoofMovieTicket() {
		int p1Baskets = 0;
		int p2Baskets = 0;
		double tickets = 0;

		for (int i = 0; i < 3; i++) {
			if (this.player1Attempt[i]) {
				p1Baskets++;
			}
			if (this.player2Attempt[i]) {
				p2Baskets++;
			}
		}

		if (p1Baskets == p2Baskets) {
			// Tie
			this.numberofTie++;
			this.status = "The game is tied with no winner. Player1(" + p1Baskets + ")==Pleyer2(" + p2Baskets
					+ "). Reset the game.";
			return 0;
		} else {
			if (p1Baskets > p2Baskets) {
				tickets = p1Baskets - p2Baskets;
				this.status = "Player1 won the game. Player2 should pay (";
			} else {
				tickets = p2Baskets - p1Baskets;
				this.status = "Player2 won the game. Player1 should pay (";
			}

			tickets = tickets + (this.numberofTie * 0.5);

			// Rounding up
			if ((this.numberofTie % 2) != 0) {
				tickets += 0.5;
			}
			this.status += ((int) tickets + ") movie tickets.");
			return (int) tickets;
		}
	}
}
