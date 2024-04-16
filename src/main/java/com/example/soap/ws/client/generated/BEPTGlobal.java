
package com.example.soap.ws.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BEPTGlobal", targetNamespace = "http://globalservice.ws.bept.ids.by/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BEPTGlobal {


    /**
     * 
     * @param request
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetCurrentTime")
    @ResponseWrapper(localName = "getCurrentTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetCurrentTimeResponse")
    public XMLGregorianCalendar getCurrentTime(
        @WebParam(name = "request", targetNamespace = "")
        String request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.LogoutResp
     */
    @WebMethod(operationName = "Logout")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Logout", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.Logout")
    @ResponseWrapper(localName = "LogoutResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.LogoutResponse")
    public LogoutResp logout(
        @WebParam(name = "request", targetNamespace = "")
        LogoutReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.LoginResp
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.LoginResponse")
    public LoginResp login(
        @WebParam(name = "request", targetNamespace = "")
        LoginReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetFunctionalnameByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFunctionalnameByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetFunctionalnameByGTIN")
    @ResponseWrapper(localName = "getFunctionalnameByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetFunctionalnameByGTINResponse")
    public GetFunctionalnameByGTINResp getFunctionalnameByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        GetFunctionalnameByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetFunctionalnameByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFunctionalnameByGTIN2", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetFunctionalnameByGTIN2")
    @ResponseWrapper(localName = "getFunctionalnameByGTIN2Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetFunctionalnameByGTIN2Response")
    public GetFunctionalnameByGTINResp getFunctionalnameByGTIN2(
        @WebParam(name = "request", targetNamespace = "")
        GetFunctionalnameByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetCheckGTIN29Resp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCheckGTIN29", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetCheckGTIN29")
    @ResponseWrapper(localName = "getCheckGTIN29Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetCheckGTIN29Response")
    public GetCheckGTIN29Resp getCheckGTIN29(
        @WebParam(name = "request", targetNamespace = "")
        GetCheckGTIN29Req request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetPartyByGLNResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPartyByGLN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetPartyByGLN")
    @ResponseWrapper(localName = "getPartyByGLNResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetPartyByGLNResponse")
    public GetPartyByGLNResp getPartyByGLN(
        @WebParam(name = "request", targetNamespace = "")
        GetPartyByGLNReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetPartyByUNPResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPartyByUNP", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetPartyByUNP")
    @ResponseWrapper(localName = "getPartyByUNPResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetPartyByUNPResponse")
    public GetPartyByUNPResp getPartyByUNP(
        @WebParam(name = "request", targetNamespace = "")
        GetPartyByUNPReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetQuotaImportInfoResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuotaImportInfo", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetQuotaImportInfo")
    @ResponseWrapper(localName = "getQuotaImportInfoResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetQuotaImportInfoResponse")
    public GetQuotaImportInfoResp getQuotaImportInfo(
        @WebParam(name = "request", targetNamespace = "")
        GetQuotaImportInfoReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetFullPartyByGLNResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFullPartyByGLN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetFullPartyByGLN")
    @ResponseWrapper(localName = "getFullPartyByGLNResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetFullPartyByGLNResponse")
    public GetFullPartyByGLNResp getFullPartyByGLN(
        @WebParam(name = "request", targetNamespace = "")
        GetFullPartyByGLNReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetVariantByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVariantByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetVariantByGTIN")
    @ResponseWrapper(localName = "getVariantByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetVariantByGTINResponse")
    public GetVariantByGTINResp getVariantByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        GetVariantByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetTradeitemByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemByGTIN")
    @ResponseWrapper(localName = "getTradeitemByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemByGTINResponse")
    public GetTradeitemByGTINResp getTradeitemByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetShortTradeitemByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemByGTINshort", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemByGTINshort")
    @ResponseWrapper(localName = "getTradeitemByGTINshortResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemByGTINshortResponse")
    public GetShortTradeitemByGTINResp getTradeitemByGTINshort(
        @WebParam(name = "request", targetNamespace = "")
        GetShortTradeitemByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetTradeitemsByGTINsShortResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemsByGTINsShort", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemsByGTINsShort")
    @ResponseWrapper(localName = "getTradeitemsByGTINsShortResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemsByGTINsShortResponse")
    public GetTradeitemsByGTINsShortResp getTradeitemsByGTINsShort(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemsByGTINsShortReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetTradeitemsByGTINsResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemsByGTINs", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemsByGTINs")
    @ResponseWrapper(localName = "getTradeitemsByGTINsResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemsByGTINsResponse")
    public GetTradeitemsByGTINsResp getTradeitemsByGTINs(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemsByGTINsReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetTradeitemsOfPoolByModifiedTimeResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTradeitemsOfPoolByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemsOfPoolByModifiedTime")
    @ResponseWrapper(localName = "getTradeitemsOfPoolByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTradeitemsOfPoolByModifiedTimeResponse")
    public GetTradeitemsOfPoolByModifiedTimeResp getTradeitemsOfPoolByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemsOfPoolByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.CleanTradeitemsOfPoolByDeleteTimeResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cleanTradeitemsOfPoolByDeleteTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.CleanTradeitemsOfPoolByDeleteTime")
    @ResponseWrapper(localName = "cleanTradeitemsOfPoolByDeleteTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.CleanTradeitemsOfPoolByDeleteTimeResponse")
    public CleanTradeitemsOfPoolByDeleteTimeResp cleanTradeitemsOfPoolByDeleteTime(
        @WebParam(name = "request", targetNamespace = "")
        CleanTradeitemsOfPoolByDeleteTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetTIImageKindsByGTINsResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTIImageKindsByGTINs", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTIImageKindsByGTINs")
    @ResponseWrapper(localName = "getTIImageKindsByGTINsResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetTIImageKindsByGTINsResponse")
    public GetTIImageKindsByGTINsResp getTIImageKindsByGTINs(
        @WebParam(name = "request", targetNamespace = "")
        GetTIImageKindsByGTINsReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.Tradeitem
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOldTradeitem", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetOldTradeitem")
    @ResponseWrapper(localName = "getOldTradeitemResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetOldTradeitemResponse")
    public Tradeitem getOldTradeitem(
        @WebParam(name = "request", targetNamespace = "")
        GetTradeitemByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.Party
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOldParty", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetOldParty")
    @ResponseWrapper(localName = "getOldPartyResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetOldPartyResponse")
    public Party getOldParty(
        @WebParam(name = "request", targetNamespace = "")
        GetFullPartyByGLNReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.ApiHeaderRequest
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOldHeaderReq", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetOldHeaderReq")
    @ResponseWrapper(localName = "getOldHeaderReqResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetOldHeaderReqResponse")
    public ApiHeaderRequest getOldHeaderReq(
        @WebParam(name = "request", targetNamespace = "")
        ApiHeaderRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.ApiHeaderResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOldHeaderResp", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetOldHeaderResp")
    @ResponseWrapper(localName = "getOldHeaderRespResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetOldHeaderRespResponse")
    public ApiHeaderResponse getOldHeaderResp(
        @WebParam(name = "request", targetNamespace = "")
        ApiHeaderResponse request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchTradeitemsByOKRB007Resp
     */
    @WebMethod(operationName = "SearchTradeitemsByOKRB007")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByOKRB007", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByOKRB007")
    @ResponseWrapper(localName = "SearchTradeitemsByOKRB007Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByOKRB007Response")
    public SearchTradeitemsByOKRB007Resp searchTradeitemsByOKRB007(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByOKRB007Req request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchTradeitemsByTNVEDResp
     */
    @WebMethod(operationName = "SearchTradeitemsByTNVED")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByTNVED", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByTNVED")
    @ResponseWrapper(localName = "SearchTradeitemsByTNVEDResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByTNVEDResponse")
    public SearchTradeitemsByTNVEDResp searchTradeitemsByTNVED(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByTNVEDReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchTradeitemsByNameResp
     */
    @WebMethod(operationName = "SearchTradeitemsByName")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByName", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByName")
    @ResponseWrapper(localName = "SearchTradeitemsByNameResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByNameResponse")
    public SearchTradeitemsByNameResp searchTradeitemsByName(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByNameReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchTradeitemsByGLNResp
     */
    @WebMethod(operationName = "SearchTradeitemsByGLN")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByGLN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByGLN")
    @ResponseWrapper(localName = "SearchTradeitemsByGLNResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByGLNResponse")
    public SearchTradeitemsByGLNResp searchTradeitemsByGLN(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByGLNReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchTradeitemsByModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByModifiedTime")
    @ResponseWrapper(localName = "SearchTradeitemsByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByModifiedTimeResponse")
    public SearchTradeitemsByModifiedTimeResp searchTradeitemsByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchSimpleTradeitemsByModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchSimpleTradeitemsByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTime")
    @ResponseWrapper(localName = "SearchSimpleTradeitemsByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTimeResponse")
    public SearchSimpleTradeitemsByModifiedTimeResp searchSimpleTradeitemsByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchSimpleTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchSimpleTradeitemsByModifiedTime2")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchSimpleTradeitemsByModifiedTime2", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTime2")
    @ResponseWrapper(localName = "SearchSimpleTradeitemsByModifiedTime2Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTime2Response")
    public SearchSimpleTradeitemsByModifiedTimeResp searchSimpleTradeitemsByModifiedTime2(
        @WebParam(name = "request", targetNamespace = "")
        SearchSimpleTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchSimpleTradeitemsByModifiedTime3")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchSimpleTradeitemsByModifiedTime3", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTime3")
    @ResponseWrapper(localName = "SearchSimpleTradeitemsByModifiedTime3Response", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchSimpleTradeitemsByModifiedTime3Response")
    public SearchSimpleTradeitemsByModifiedTimeResp searchSimpleTradeitemsByModifiedTime3(
        @WebParam(name = "request", targetNamespace = "")
        SearchSimpleTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchSimpleImportTradeitemsByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchGTINfromDatamarkSystemByModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchGTINfromDatamarkSystemByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchGTINfromDatamarkSystemByModifiedTime")
    @ResponseWrapper(localName = "SearchGTINfromDatamarkSystemByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchGTINfromDatamarkSystemByModifiedTimeResponse")
    public SearchSimpleImportTradeitemsByModifiedTimeResp searchGTINfromDatamarkSystemByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchSimpleImportTradeitemsByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchGTINfromDatamarkSystemByGTINResp
     */
    @WebMethod(operationName = "SearchGTINfromDatamarkSystemByGTIN")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchGTINfromDatamarkSystemByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchGTINfromDatamarkSystemByGTIN")
    @ResponseWrapper(localName = "SearchGTINfromDatamarkSystemByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchGTINfromDatamarkSystemByGTINResponse")
    public SearchGTINfromDatamarkSystemByGTINResp searchGTINfromDatamarkSystemByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        SearchGTINfromDatamarkSystemByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchPartiesByModifiedTimeResp
     */
    @WebMethod(operationName = "SearchPartiesByModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchPartiesByModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchPartiesByModifiedTime")
    @ResponseWrapper(localName = "SearchPartiesByModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchPartiesByModifiedTimeResponse")
    public SearchPartiesByModifiedTimeResp searchPartiesByModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchPartiesByModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.SearchTradeitemsByGLNAndModifiedTimeResp
     */
    @WebMethod(operationName = "SearchTradeitemsByGLNAndModifiedTime")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchTradeitemsByGLNAndModifiedTime", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByGLNAndModifiedTime")
    @ResponseWrapper(localName = "SearchTradeitemsByGLNAndModifiedTimeResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.SearchTradeitemsByGLNAndModifiedTimeResponse")
    public SearchTradeitemsByGLNAndModifiedTimeResp searchTradeitemsByGLNAndModifiedTime(
        @WebParam(name = "request", targetNamespace = "")
        SearchTradeitemsByGLNAndModifiedTimeReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetSimpleTradeitemsByGTINResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSimpleTradeitemsByGTIN", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetSimpleTradeitemsByGTIN")
    @ResponseWrapper(localName = "getSimpleTradeitemsByGTINResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetSimpleTradeitemsByGTINResponse")
    public GetSimpleTradeitemsByGTINResp getSimpleTradeitemsByGTIN(
        @WebParam(name = "request", targetNamespace = "")
        GetSimpleTradeitemsByGTINReq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.example.soap.ws.client.generated.GetClassificatorResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClassificator", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetClassificator")
    @ResponseWrapper(localName = "getClassificatorResponse", targetNamespace = "http://globalservice.ws.bept.ids.by/", className = "com.example.soap.ws.client.generated.GetClassificatorResponse")
    public GetClassificatorResp getClassificator(
        @WebParam(name = "request", targetNamespace = "")
        GetClassificatorReq request);

}