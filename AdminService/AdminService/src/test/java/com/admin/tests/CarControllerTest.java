//package com.admin.tests;
//
//import com.admin.model.Car;
//import com.admin.service.AdminService;
//import com.admin.service.AdminServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.Arrays;
//import java.util.List;
//
//@ExtendWith(MockitoExtension.class)
//public class CarControllerTest {
//    @Mock
//    private AdminServiceImpl carServiceImpl;
//
//    @InjectMocks
//    private CarControllerTest carController;
//
//    private MockMvc mockMvc;
//
//    @BeforeEach
//    void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(carController).build();
//    }
//
//    @Test
//    void testGetAllCars() throws Exception {
//        Car car1 = new Car(1, "Car1", "Brand1", 2022, true, 5, "car1.jpg");
//        Car car2 = new Car(2, "Car2", "Brand2", 2023, false, 4, "car2.jpg");
//        List<Car> cars = Arrays.asList(car1, car2);
//
//        Mockito.when(carServiceImpl.getAllCars()).thenReturn(cars);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/cars"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(2))
//                .andExpect(jsonPath("$[0].car_ID").value(1))
//                .andExpect(jsonPath("$[0].car_model").value("Car1"))
//                .andExpect(jsonPath("$[0].car_brand").value("Brand1"))
//                .andExpect(jsonPath("$[1].car_ID").value(2))
//                .andExpect(jsonPath("$[1].car_model").value("Car2"))
//                .andExpect(jsonPath("$[1].car_brand").value("Brand2"));
//
//        verify(carService, times(1)).getAllCars();
//    }
//
//    @Test
//    void testGetCarById() throws Exception {
//        Car car = new Car(1L, "Car1", "Brand1", 2022, true, 5, "car1.jpg");
//
//        when(carService.getCarById(1L)).thenReturn(car);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/cars/1"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.car_ID").value(1))
//                .andExpect(jsonPath("$.car_model").value("Car1"))
//                .andExpect(jsonPath("$.car_brand").value("Brand1"));
//
//        verify(carService, times(1)).getCarById(1L);
//    }
//
//    @Test
//    void testInsertCarRecord() throws Exception {
//        Car car = new Car(null, "Car1", "Brand1", 2022, true, 5, "car1.jpg");
//        Car savedCar = new Car(1L, "Car1", "Brand1", 2022, true, 5, "car1.jpg");
//
//        when(carService.insertCarRecord(car)).thenReturn(savedCar);
//
//        String carJson = "{\"car_model\":\"Car1\",\"car_brand\":\"Brand1\",\"car_year\":2022,\"available\":true,\"car_capacity\":5,\"car_image\":\"car1.jpg\"}";
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/cars")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(carJson))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.car_ID").value(1))
//                .andExpect(jsonPath("$.car_model").value("Car1"))
//                .andExpect(jsonPath("$.car_brand").value("Brand1"));
//
//        verify(carService, times(1)).insertCarRecord(car);
//    }
//}
