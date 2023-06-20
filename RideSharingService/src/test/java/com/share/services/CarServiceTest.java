package com.share.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {
//
//    //Test case for getting the car details
//    @Mock
//    private CarRepository carRepository;
//
//    @InjectMocks
//    private CarServiceImpl carService;
//
//    @Test
//    public void testGetAvailableCars() {
//        // Create test data
//        Cars car1 = new Cars();
//        car1.setCar_ID(1);
//        car1.setCar_model("Corolla");
//        car1.setCar_brand("Toyota");
//        car1.setCar_year(2020);
//
//        Cars car2 = new Cars();
//        car2.setCar_ID(2);
//        car2.setCar_model("Accord");
//        car2.setCar_brand("Honda");
//        car2.setCar_year(2019);
//
//        List<Cars> carList = Arrays.asList(car1, car2);
//        Mockito.when(carRepository.findAllByAvailable(true)).thenReturn(carList);
//
//        List<Cars> availableCars = carService.getAvailableCars();
//
//        assertEquals(2, availableCars.size());
//        assertEquals(car1.getCar_ID(), availableCars.get(0).getCar_ID());
//        assertEquals(car1.getCar_model(), availableCars.get(0).getCar_model());
//        assertEquals(car1.getCar_brand(), availableCars.get(0).getCar_brand());
//        assertEquals(car1.getCar_year(), availableCars.get(0).getCar_year());
//        assertEquals(car2.getCar_ID(), availableCars.get(1).getCar_ID());
//        assertEquals(car2.getCar_model(), availableCars.get(1).getCar_model());
//        assertEquals(car2.getCar_brand(), availableCars.get(1).getCar_brand());
//        assertEquals(car2.getCar_year(), availableCars.get(1).getCar_year());
//    }


}