package tddmicroexercises.turnticketdispenser;

import com.sun.glass.ui.TouchInputSupport;

public class TicketDispenser
{

    NumberSequenceGenerator generator;

    public TicketDispenser(NumberSequenceGenerator generator) {
        this.generator = generator;
    }
    
    public TurnTicket getTurnTicket()
    {
        int newTurnNumber = generator.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
