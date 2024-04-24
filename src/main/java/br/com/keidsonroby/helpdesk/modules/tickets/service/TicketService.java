package br.com.keidsonroby.helpdesk.modules.tickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.keidsonroby.helpdesk.modules.tickets.entity.TicketEntity;
import br.com.keidsonroby.helpdesk.modules.tickets.repository.TicketRepository;

@Service
public class TicketService {
  
  @Autowired
  private TicketRepository ticketRepository;

  public TicketEntity salvar(TicketEntity ticketEntity) {
    return this.ticketRepository.save(ticketEntity);
  }
}
