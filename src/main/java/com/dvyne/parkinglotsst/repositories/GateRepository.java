package com.dvyne.parkinglotsst.repositories;

import com.dvyne.parkinglotsst.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<>();

    public Optional<Gate> findById(long gateId) {

       if(gates.containsKey(gateId)) return Optional.ofNullable(gates.get(gateId));
       else return Optional.empty();
    }


}
