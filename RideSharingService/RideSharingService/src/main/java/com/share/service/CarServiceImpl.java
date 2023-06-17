package com.share.service;
import com.share.model.Cars;
import com.share.model.RideShare;
import com.share.repository.CarRepository;
import com.share.repository.RideShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
   @Autowired
    private  CarRepository carRepository;


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Cars> findAllByAvailable(boolean available) {
        String query = "SELECT c FROM Cars c WHERE c.available = :available";
        return entityManager.createQuery(query, Cars.class)
                .setParameter("available", available)
                .getResultList();
    }
    @Override
    public List<Cars> getAvailableCars() {
        return carRepository.findAllByAvailable(true);
    }


}
