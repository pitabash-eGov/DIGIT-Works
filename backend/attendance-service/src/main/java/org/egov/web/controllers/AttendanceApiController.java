package org.egov.web.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.egov.common.contract.response.ResponseInfo;
import digit.models.coremodels.RequestInfoWrapper;
import org.egov.service.AttendanceService;
import org.egov.util.ResponseInfoFactory;
import org.egov.web.models.AttendanceRegister;
import org.egov.web.models.AttendanceRegisterRequest;
import org.egov.web.models.AttendanceRegisterResponse;
import org.egov.web.models.AttendanceRegisterSearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2022-11-14T14:44:21.051+05:30")

@Controller
@RequestMapping("/v1")
public class AttendanceApiController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ResponseInfoFactory responseInfoCreator;

    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping(value = "/_create", method = RequestMethod.POST)
    public ResponseEntity<AttendanceRegisterResponse> attendanceV1CreatePOST(@ApiParam(value = "", allowableValues = "application/json") @RequestHeader(value = "Content-Type", required = false) String contentType, @ApiParam(value = "") @Valid @RequestBody AttendanceRegisterRequest attendanceRegisterRequest) {
        AttendanceRegisterResponse attendanceRegisterResponse = attendanceService.createAttendanceRegister(attendanceRegisterRequest);
        return new ResponseEntity<AttendanceRegisterResponse>(attendanceRegisterResponse,HttpStatus.OK);
    }

    @RequestMapping(value = "/_search", method = RequestMethod.POST)
    public ResponseEntity<AttendanceRegisterResponse> attendanceV1SearchPOST(@Valid @ModelAttribute AttendanceRegisterSearchCriteria searchCriteria, @Valid @RequestBody RequestInfoWrapper requestInfoWrapper) {
        List<AttendanceRegister> attendanceRegisterList = attendanceService.searchAttendanceRegister(requestInfoWrapper, searchCriteria);
        ResponseInfo responseInfo = responseInfoCreator.createResponseInfoFromRequestInfo(requestInfoWrapper.getRequestInfo(), true);
        AttendanceRegisterResponse attendanceRegisterResponse = AttendanceRegisterResponse.builder().responseInfo(responseInfo).attendanceRegister(attendanceRegisterList).build();
        return new ResponseEntity<AttendanceRegisterResponse>(attendanceRegisterResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/_update", method = RequestMethod.POST)
    public ResponseEntity<AttendanceRegisterResponse> attendanceV1UpdatePOST(@ApiParam(value = "", allowableValues = "application/json") @RequestHeader(value = "Content-Type", required = false) String contentType, @ApiParam(value = "") @Valid @RequestBody AttendanceRegisterRequest attendanceRegisterRequest) {
        AttendanceRegisterResponse attendanceRegisterResponse = attendanceService.updateAttendanceRegister(attendanceRegisterRequest);
        return new ResponseEntity<AttendanceRegisterResponse>(attendanceRegisterResponse,HttpStatus.OK);
    }

}
