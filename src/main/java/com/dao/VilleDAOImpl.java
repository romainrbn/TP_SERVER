package com.dao;

import com.dto.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VilleDAOImpl implements VilleDAO {

    @Autowired
    private VilleDAO villeDAO;

    @Override
    public Ville findVille() {
        Ville ville = new Ville();
        ville.setCodeCommune("code_test");
        ville.setNomCommune("nomCommune");
        return ville;
    }
}
