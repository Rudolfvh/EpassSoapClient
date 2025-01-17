
package com.example.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchSimpleImportTradeitemsByModifiedTimeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="searchSimpleImportTradeitemsByModifiedTimeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_FROMDATE"/&gt;
 *     &lt;enumeration value="INVALID_TODATE"/&gt;
 *     &lt;enumeration value="INVALID_RECORD_COUNT"/&gt;
 *     &lt;enumeration value="INVALID_START_RECORD"/&gt;
 *     &lt;enumeration value="INVALID_ROLE"/&gt;
 *     &lt;enumeration value="NO_RESULTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "searchSimpleImportTradeitemsByModifiedTimeEnum")
@XmlEnum
public enum SearchSimpleImportTradeitemsByModifiedTimeEnum {

    API_ERROR,
    OK,
    INVALID_FROMDATE,
    INVALID_TODATE,
    INVALID_RECORD_COUNT,
    INVALID_START_RECORD,
    INVALID_ROLE,
    NO_RESULTS;

    public String value() {
        return name();
    }

    public static SearchSimpleImportTradeitemsByModifiedTimeEnum fromValue(String v) {
        return valueOf(v);
    }

}
