package codechallenge.mc.cityexplorer.controllers;

import codechallenge.mc.cityexplorer.services.CityDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@Slf4j
@RestController
public class CityConnectorController {

    @Autowired
    public CityDetailsService cityDetailsService;

    @GetMapping(value="/connected")
    public String connected(@RequestParam String origin, @RequestParam String destination) {
        return cityDetailsService.connected(origin, destination);
    }

}
