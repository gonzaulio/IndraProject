package com.indra.technicalTest;
// PriceControllerTest.java

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPrice() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/prices")
            .param("brandId", "1")
            .param("productId", "35455")
            .param("date", "2020-06-14T10:00:00"))
            .andExpect(MockMvcResultMatchers.status().isOk());
        // Agrega más pruebas según los casos descritos
    }
    
    @Test
    public void testGetPriceCase1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/prices")
            .param("brandId", "1")
            .param("productId", "35455")
            .param("date", "2020-06-14T10:00:00"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
            .andExpect(MockMvcResultMatchers.jsonPath("$.brandId").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14 00:00:00"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31 23:59:59"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(35.50));
    }
    
    @Test
    public void testGetPriceCase2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/prices")
            .param("brandId", "1")
            .param("productId", "35455")
            .param("date", "2020-06-14T16:00:00"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
            .andExpect(MockMvcResultMatchers.jsonPath("$.brandId").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(2))
            .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14 15:00:00"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-06-14 18:30:00"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(25.45));
    }
    
    @Test
    public void testGetPriceCase3() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/prices")
            .param("brandId", "1")
            .param("productId", "35455")
            .param("date", "2020-06-14T21:00:00"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
            .andExpect(MockMvcResultMatchers.jsonPath("$.brandId").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-14 00:00:00"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31 23:59:59"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(35.50));
    }
    
    @Test
    public void testGetPriceCase4() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/prices")
            .param("brandId", "1")
            .param("productId", "35455")
            .param("date", "2020-06-15T10:00:00"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
            .andExpect(MockMvcResultMatchers.jsonPath("$.brandId").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(3))
            .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-15 00:00:00"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-06-15 11:00:00"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(30.50));
    }
    
    @Test
    public void testGetPriceCase5() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/prices")
            .param("brandId", "1")
            .param("productId", "35455")
            .param("date", "2020-06-16T21:00:00"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
            .andExpect(MockMvcResultMatchers.jsonPath("$.brandId").value(1))
            .andExpect(MockMvcResultMatchers.jsonPath("$.priceList").value(4))
            .andExpect(MockMvcResultMatchers.jsonPath("$.startDate").value("2020-06-15 16:00:00"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").value("2020-12-31 23:59:59"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(38.95));
    }
    
    
}