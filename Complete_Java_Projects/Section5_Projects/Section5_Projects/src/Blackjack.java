public class Blackjack {

    public int parseCard(String card) {
        String[] tens = {"ten", "jack", "queen", "king"};
        if(card == "ace"){
            return 11;
            }
        for(int i=0; i < (tens.length); i++){
            if (card == tens[i]){
                return 10;
                }
            }
        return Integer.parseInt(card);
        }

        public boolean isBlackjack(String card1, String card2) {
            return((parseCard(card1) == 11) && (parseCard(card2) == 10)) || ((parseCard(card2) == 11) && (parseCard(card1) == 10));
        }
    
        public String largeHand(boolean isBlackjack, int dealerScore) {
            
            if(isBlackjack && dealerScore < 12){
                return "W";
                }
            return "S";
        }
    
        public String smallHand(int handScore, int dealerScore) {
            if(handScore > 16){
                return "S";
                }
            if(handScore < 12){
                return "H";
                }
            if(dealerScore > 6){
                return "H";
                }
            return "S";
        }
        // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
    
}

    
