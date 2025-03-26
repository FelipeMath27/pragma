package com.pragma.talentpool.domain.usecase;

import com.pragma.talentpool.domain.api.IRolServicePort;
import com.pragma.talentpool.domain.model.Rol;
import com.pragma.talentpool.domain.spi.IRolPersistencePort;

import java.util.List;

public class UseCaseRol implements IRolServicePort {

    private final IRolPersistencePort rolPersistencePort;

    public UseCaseRol(IRolPersistencePort rolPersistencePort){
        this.rolPersistencePort = rolPersistencePort;
    }

    @Override
    public void saveRol(Rol rol){
        rolPersistencePort.saveRol(rol);
    }

    @Override
    public List<Rol> getAllRoles(){
        return rolPersistencePort.getAllRoles();
    }

    @Override
    public Rol getRol(String name_rol) {
        return rolPersistencePort.getRol(name_rol);
    }

    @Override
    public void updateRol(Rol rol){
        rolPersistencePort.updateUser(rol);
    }

    @Override
    public void deleteRol(String name_rol){
        rolPersistencePort.deleteRol(name_rol);
    }
}