package com.controller;

import com.blo.VilleBLO;
import com.dto.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VilleController {

    @Autowired
    VilleBLO villeService;

    @RequestMapping(value = "/ville", method = RequestMethod.GET)
    @ResponseBody
    public Ville appelGet(@RequestParam(required = false, value = "codePostal") String codePostal){
        Ville ville = villeService.getInfoVilles();

        System.out.print("Appel GET ");
        System.out.println("Code Postal " + codePostal);

        return ville;
    }
}
