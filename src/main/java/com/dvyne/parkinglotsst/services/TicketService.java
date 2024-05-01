package com.dvyne.parkinglotsst.services;

import com.dvyne.parkinglotsst.exception.InvalidGateException;
import com.dvyne.parkinglotsst.models.Gate;
import com.dvyne.parkinglotsst.models.Ticket;
import com.dvyne.parkinglotsst.models.VehicleType;
import com.dvyne.parkinglotsst.repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidGateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate=gateRepository.findById(gateId);
        if(optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate id");
        }

        Gate gate =optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());



        return ticket;
    }
}
