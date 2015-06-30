package tddmicroexercises.turnticketdispenser;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicketDispenserTest { 

    @Test
    public void turnTicketShouldHaveSubsequentNumberOfPreviousTicket() {
        TicketDispenser td = new TicketDispenser(new TurnNumberSequence());
        TurnTicket ticket1 = td.getTurnTicket();
        TurnTicket ticket2 = td.getTurnTicket();
        
        assertThat(ticket2.getTurnNumber(), is(ticket1.getTurnNumber() + 1));
    }
    
    @Test
    public void turnTicketShouldHaveSubsequentNumberOfPreviousTicketFromDifferentDispenser() {
        TicketDispenser td = new TicketDispenser(new TurnNumberSequence());
        TicketDispenser td2 = new TicketDispenser(new TurnNumberSequence());
        
        TurnTicket ticket1 = td.getTurnTicket();
        TurnTicket ticket2 = td2.getTurnTicket();
        
        assertThat(ticket2.getTurnNumber(), is (ticket1.getTurnNumber() + 1));
    }
    
    @Test
    public void turnTicket11ShouldComeAfterTicket10() {
        TicketDispenser td = new TicketDispenser(new TurnNumberSequence());
        TurnTicket ticket1 = null;
        for (int i = 0; i < 10; i ++) {
             ticket1 = td.getTurnTicket();
        }
        TurnTicket ticket2 = td.getTurnTicket();

        assertThat(ticket2.getTurnNumber(), is(ticket1.getTurnNumber() + 1));
    }
    
    
}
