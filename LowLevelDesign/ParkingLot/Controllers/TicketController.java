package ParkingLot.Controllers;

import ParkingLot.Exception.ParkingLotNotAvailbleException;
import ParkingLot.Exception.ParkingSpotNotAvailable;
import ParkingLot.Models.Ticket;
import ParkingLot.Services.TicketService;
import ParkingLot.dto.ErrorResponseDTO;
import ParkingLot.dto.GenerateTicketRequestDTO;
import ParkingLot.dto.GenerateTicketResponseDTO;
import ParkingLot.dto.ResponseDTO;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public ResponseDTO getTicket(GenerateTicketRequestDTO generateTicketRequestDTO) throws ParkingLotNotAvailbleException, ParkingSpotNotAvailable{
        try {
            Ticket ticket  = ticketService.getTicket(generateTicketRequestDTO.getVehicle(), generateTicketRequestDTO.getEntryGate());
            GenerateTicketResponseDTO generateTicketResponseDTO = new GenerateTicketResponseDTO();
            generateTicketResponseDTO.setTicket(ticket);
            return generateTicketResponseDTO;
        }catch(ParkingLotNotAvailbleException e){
            return new ErrorResponseDTO("parkingLot not available", 404);

        }catch(ParkingSpotNotAvailable p) {
            return new ErrorResponseDTO("parking spot not available", 404);
        }
    }


}
