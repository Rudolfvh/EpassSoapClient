package com.example.soapdemo.client;

import com.example.soap.ws.client.generated.*;
import com.example.soapdemo.config.EpassConfig;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;


public class EpassClient extends WebServiceGatewaySupport {


    private WebServiceTemplate webServiceTemplate;
    private String sessionToken;

    public EpassClient(String username, String password) {
        EpassConfig config = new EpassConfig();
        webServiceTemplate = config.webServiceTemplate();

        LoginResp obj = login(username, password);

        if (!obj.getErrorCode().equals(LoginEnum.OK)) {
            throw new IllegalArgumentException(String.format("Ошибка авторизации ErrorCode = %s", obj.getErrorCode().value()));
        }
    }


    private void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    private void validateSessionToken() {
        if (sessionToken == null || sessionToken.isEmpty()) {
            throw new IllegalStateException("Session token is required.");
        }
    }


    private LoginResp login(String username, String password) {

        LoginReq request = new LoginReq();
        request.setUsername(username);
        request.setPassword(password);

        Login login = new Login();
        login.setRequest(request);

        JAXBElement<Login> jAXBElement = new ObjectFactory().createLogin(login);

        JAXBElement<LoginResponse> response = (JAXBElement<LoginResponse>) webServiceTemplate.marshalSendAndReceive(jAXBElement);

        LoginResp loginResp = response.getValue().getReturn();
        if (loginResp.getHeader() != null) {
            setSessionToken(loginResp.getHeader().getSessiontoken());
        }

        return response.getValue().getReturn();
    }


    public GetFullPartyByGLNResp getFullPartyByGLN(Long gln) {

        validateSessionToken();

        ApiHeaderRequest header = new ApiHeaderRequest();
        header.setSessiontoken(sessionToken);


        GetFullPartyByGLNReq request = new GetFullPartyByGLNReq();
        request.setGln(gln);
        request.setHeader(header);


        GetFullPartyByGLN getFullPartyByGLN = new GetFullPartyByGLN();
        getFullPartyByGLN.setRequest(request);

        JAXBElement<GetFullPartyByGLN> requestElement = new ObjectFactory().createGetFullPartyByGLN(getFullPartyByGLN);
        JAXBElement<GetFullPartyByGLNResponse> responseElement = (JAXBElement<GetFullPartyByGLNResponse>) getWebServiceTemplate().marshalSendAndReceive(requestElement);

        return responseElement.getValue().getReturn();
    }

    public SearchSimpleTradeitemsByModifiedTimeResp searchSimpleTradeitemsByModifiedTime3(XMLGregorianCalendar fromDate, XMLGregorianCalendar toDate, int recordCount, int startRecord) {

        validateSessionToken();

        ApiHeaderRequest header = new ApiHeaderRequest();
        header.setSessiontoken(sessionToken);

        SearchSimpleTradeitemsByModifiedTimeReq request = new SearchSimpleTradeitemsByModifiedTimeReq();
        request.setFromDate(fromDate);
        request.setToDate(toDate);
        request.setRecordCount(recordCount);
        request.setStartRecord(startRecord);
        request.setHeader(header);

        SearchSimpleTradeitemsByModifiedTime3 searchRequest = new SearchSimpleTradeitemsByModifiedTime3();
        searchRequest.setRequest(request);

        JAXBElement<SearchSimpleTradeitemsByModifiedTime3> requestElement = new ObjectFactory().createSearchSimpleTradeitemsByModifiedTime3(searchRequest);
        JAXBElement<SearchSimpleTradeitemsByModifiedTime3Response> responseElement = (JAXBElement<SearchSimpleTradeitemsByModifiedTime3Response>) getWebServiceTemplate().marshalSendAndReceive(requestElement);

        return responseElement.getValue().getReturn();
    }

    public SearchPartiesByModifiedTimeResp searchPartiesByModifiedTime(XMLGregorianCalendar fromDate, XMLGregorianCalendar toDate, int recordCount, int startRecord) {

        validateSessionToken();

        ApiHeaderRequest header = new ApiHeaderRequest();
        header.setSessiontoken(sessionToken);

        SearchPartiesByModifiedTimeReq request = new SearchPartiesByModifiedTimeReq();
        request.setFromDate(fromDate);
        request.setToDate(toDate);
        request.setRecordCount(recordCount);
        request.setStartRecord(startRecord);
        request.setHeader(header);

        SearchPartiesByModifiedTime searchRequest = new SearchPartiesByModifiedTime();
        searchRequest.setRequest(request);

        JAXBElement<SearchPartiesByModifiedTime> searchElement = new ObjectFactory().createSearchPartiesByModifiedTime(searchRequest);
        JAXBElement<SearchPartiesByModifiedTimeResponse> responseElement = (JAXBElement<SearchPartiesByModifiedTimeResponse>) getWebServiceTemplate().marshalSendAndReceive(searchElement);

        return responseElement.getValue().getReturn();
    }

}
