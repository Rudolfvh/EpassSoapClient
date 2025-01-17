
package com.example.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFullPartyByGLNEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="getFullPartyByGLNEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_GLN"/&gt;
 *     &lt;enumeration value="GLN_NOT_EXIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getFullPartyByGLNEnum")
@XmlEnum
public enum GetFullPartyByGLNEnum {

    API_ERROR,
    OK,
    INVALID_GLN,
    GLN_NOT_EXIST;

    public String value() {
        return name();
    }

    public static GetFullPartyByGLNEnum fromValue(String v) {
        return valueOf(v);
    }

}
