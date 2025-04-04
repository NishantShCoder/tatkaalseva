package com.myorganisation.tatkaalseva.dto;

import com.myorganisation.tatkaalseva.enums.TicketCategory;
import com.myorganisation.tatkaalseva.enums.TicketPriority;
import com.myorganisation.tatkaalseva.enums.TicketStatus;

import java.util.Date;

public class TicketInputDTO
{
    private String name;
    private Integer createdBy;
    private Integer assingnedTo;
    private String description;
    private TicketStatus status;
    private TicketCategory category;
    private TicketPriority priority;
}
