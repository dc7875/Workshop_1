package gambling_simulation;
/**********************
 * Gambling Simulation Code
 * Stake 100$ every day
 * bet 1$ every game
 */
public class Gambler {
	int stake=100;   
    int goal=200;    
    int trials=100;    

    int bets = 1;       
    int wins = 0;   
    
    public static void main(String[] args) {
		   int choice = 0;
		   int bet = (int)Math.floor(Math.random()*10%2);
		   
	if(bet==choice)
		System.out.println("win");
	else
		System.out.println("loose");
		   
	}
}
       
        