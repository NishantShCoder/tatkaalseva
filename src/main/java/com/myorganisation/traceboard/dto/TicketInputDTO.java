package com.myorganisation.traceboard.dto;

import com.myorganisation.traceboard.model.enums.TicketCategory;
import com.myorganisation.traceboard.model.enums.TicketPriority;
import com.myorganisation.traceboard.model.enums.TicketStatus;
import lombok.Data;

@Data
public class TicketInputDTO
{
    private String name;
    private Long createdBy;
    private Long assingnedTo;
    private String description;
    private TicketStatus status;
    private TicketCategory category;
    private TicketPriority priority;
}
