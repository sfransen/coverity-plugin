
package com.coverity.ws.v9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMergedDefectsForProjectScopeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMergedDefectsForProjectScopeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.coverity.com/v9}mergedDefectsPageDataObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMergedDefectsForProjectScopeResponse", propOrder = {
    "_return"
})
public class GetMergedDefectsForProjectScopeResponse {

    @XmlElement(name = "return")
    protected MergedDefectsPageDataObj _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link MergedDefectsPageDataObj }
     *     
     */
    public MergedDefectsPageDataObj getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergedDefectsPageDataObj }
     *     
     */
    public void setReturn(MergedDefectsPageDataObj value) {
        this._return = value;
    }

}
