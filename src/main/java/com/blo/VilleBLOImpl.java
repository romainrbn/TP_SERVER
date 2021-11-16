package com.blo;

import com.dao.VilleDAO;
import com.dto.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VilleBLOImpl implements VilleBLO {

    @Autowired
    private VilleDAO villeDAO;

    @Override
    public Ville getInfoVilles() {
        // code metier
        Ville ville = villeDAO.findVille();
        return ville;
    }
}