
package com.example.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchSimpleTradeitemsByModifiedTime3Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchSimpleTradeitemsByModifiedTime3Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://globalservice.ws.bept.ids.by/}searchSimpleTradeitemsByModifiedTimeResp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSimpleTradeitemsByModifiedTime3Response", propOrder = {
    "_return"
})
public class SearchSimpleTradeitemsByModifiedTime3Response {

    @XmlElement(name = "return")
    protected SearchSimpleTradeitemsByModifiedTimeResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSimpleTradeitemsByModifiedTimeResp }
     *     
     */
    public SearchSimpleTradeitemsByModifiedTimeResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSimpleTradeitemsByModifiedTimeResp }
     *     
     */
    public void setReturn(SearchSimpleTradeitemsByModifiedTimeResp value) {
        this._return = value;
    }

}
