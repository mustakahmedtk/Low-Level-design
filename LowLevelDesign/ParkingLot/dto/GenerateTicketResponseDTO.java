package ParkingLot.dto;

import ParkingLot.Models.Ticket;

public class GenerateTicketResponseDTO extends ResponseDTO{
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "GenerateTicketResponseDTO{" +
                "ticket=" + (ticket != null ? ticket.toString() : "null") +
                '}';
    }
}
