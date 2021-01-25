public class BonusMilesService {
    public int calculate(int ticketPrice) {
    int bonusCalculation = 20;


        int bonusMiles = ticketPrice / bonusCalculation / 100 ;

        return bonusMiles;
    }
}
