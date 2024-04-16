
package com.example.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchGTINfromDatamarkSystemByGTIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchGTINfromDatamarkSystemByGTIN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://globalservice.ws.bept.ids.by/}searchGTINfromDatamarkSystemByGTINReq" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGTINfromDatamarkSystemByGTIN", propOrder = {
    "request"
})
public class SearchGTINfromDatamarkSystemByGTIN {

    protected SearchGTINfromDatamarkSystemByGTINReq request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link SearchGTINfromDatamarkSystemByGTINReq }
     *     
     */
    public SearchGTINfromDatamarkSystemByGTINReq getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchGTINfromDatamarkSystemByGTINReq }
     *     
     */
    public void setRequest(SearchGTINfromDatamarkSystemByGTINReq value) {
        this.request = value;
    }

}
