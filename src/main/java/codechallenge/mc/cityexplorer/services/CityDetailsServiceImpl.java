package codechallenge.mc.cityexplorer.services;

import codechallenge.mc.cityexplorer.model.CityModel;
import codechallenge.mc.cityexplorer.util.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class CityDetailsServiceImpl implements CityDetailsService{

    List<CityModel> cityModelList;

    @Override
    public String connected(String origin, String destination) {
        String result = "no";
        for (CityModel cityModel: AppConstants.cityModelList) {
            // log.info("Origin in Service Impl: " + cityModel.getOrigin()+ ", destination in Service Impl:" + cityModel.getDestination());
            if (origin.equalsIgnoreCase(cityModel.getOrigin()) && destination.equalsIgnoreCase(cityModel.getDestination())) {
                result = "yes";
            }
        }
        return result;
    }
}
