package org.egov.web.controllers;

import org.egov.web.models.ErrorRes;
import org.egov.web.models.HouseholdMemberRequest;
import org.egov.web.models.HouseholdMemberResponse;
import org.egov.web.models.HouseholdRequest;
import org.egov.web.models.HouseholdResponse;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.egov.TestConfiguration;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* API tests for HouseholdApiController
*/
@Ignore
@RunWith(SpringRunner.class)
@WebMvcTest(HouseholdApiController.class)
@Import(TestConfiguration.class)
public class HouseholdApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void householdMemberV1CreatePostSuccess() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/member/v1/_create").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void householdMemberV1CreatePostFailure() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/member/v1/_create").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

    @Test
    public void householdMemberV1SearchPostSuccess() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/member/v1/_search").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void householdMemberV1SearchPostFailure() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/member/v1/_search").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

    @Test
    public void householdMemberV1UpdatePostSuccess() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/member/v1/_update").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void householdMemberV1UpdatePostFailure() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/member/v1/_update").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

    @Test
    public void householdV1CreatePostSuccess() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/v1/_create").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void householdV1CreatePostFailure() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/v1/_create").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

    @Test
    public void householdV1SearchPostSuccess() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/v1/_search").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void householdV1SearchPostFailure() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/v1/_search").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

    @Test
    public void householdV1UpdatePostSuccess() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/v1/_update").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void householdV1UpdatePostFailure() throws Exception {
        mockMvc.perform(post("/rushang.dhanesha/Project-Service/1.0.0/household/v1/_update").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

}
