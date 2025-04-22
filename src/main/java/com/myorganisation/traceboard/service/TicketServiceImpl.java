package com.myorganisation.traceboard.service;

import com.myorganisation.traceboard.dto.TicketInputDTO;
import com.myorganisation.traceboard.dto.TicketOutputDTO;
import com.myorganisation.traceboard.model.Ticket;
import com.myorganisation.traceboard.repository.TicketRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public TicketOutputDTO createTicket(TicketInputDTO ticketInputDTO) {
        Ticket ticket = new Ticket();


        ticket.setName(ticketInputDTO.getName());
        ticket.setCreatedBy(ticketInputDTO.getCreatedBy());
        ticket.setAssingnedTo(ticket.getAssingnedTo());
        ticket.setDescription(ticket.getDescription());
        ticket.setDateCreated(new Date());
        ticket.setStatus(ticketInputDTO.getStatus());
        ticket.setCategory(ticketInputDTO.getCategory());
        ticket.setPriority(ticketInputDTO.getPriority());

        ticket=ticketRepository.save(ticket);

        TicketOutputDTO  ticketOutputDTO = new TicketOutputDTO();

        ticketOutputDTO.setId(ticket.getId());
        ticketOutputDTO.setName(ticket.getName());
        ticketOutputDTO.setCreatedBy(ticket.getCreatedBy());
        ticketOutputDTO.setAssingnedTo(ticket.getAssingnedTo());
        ticketOutputDTO.setDescription(ticket.getDescription());
        ticketOutputDTO.setDateCreated(ticket.getDateCreated());
        ticketOutputDTO.setStatus(ticket.getStatus());
        ticketOutputDTO.setCategory(ticket.getCategory());
        ticketOutputDTO.setPriority(ticket.getPriority());

        return ticketOutputDTO;
    }

    @Override
    public TicketOutputDTO getTicket(Integer id) {
        return null;
    }

    @Override
    public List<TicketOutputDTO> getAllTickets() {
        return List.of();
    }

    @Override
    public TicketOutputDTO updateTicket(Integer id, TicketInputDTO ticketInputDTO) {
        return null;
    }

    @Override
    public String removeTicket(Integer id) {
        return "";
    }
}
