package com.myorganisation.traceboard.dto;

import com.myorganisation.traceboard.model.enums.TicketCategory;
import com.myorganisation.traceboard.model.enums.TicketPriority;
import com.myorganisation.traceboard.model.enums.TicketStatus;
import lombok.Data;

import java.util.Date;
@Data
public class TicketOutputDTO {
    private Long id;
    private String name;
    private Long createdBy;
    private Long assingnedTo;
    private String description;
    private Date dateCreated;
    private TicketStatus status;
    private TicketCategory category;
    private TicketPriority priority;

}
