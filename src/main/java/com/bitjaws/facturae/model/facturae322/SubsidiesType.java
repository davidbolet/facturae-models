
package com.bitjaws.facturae.model.facturae322;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubsidiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubsidiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Subsidy" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}SubsidyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidiesType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "subsidy"
})
public class SubsidiesType {

    @XmlElement(name = "Subsidy", required = true)
    protected List<SubsidyType> subsidy;

    /**
     * Gets the value of the subsidy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subsidy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubsidyType }
     * 
     * 
     */
    public List<SubsidyType> getSubsidy() {
        if (subsidy == null) {
            subsidy = new ArrayList<SubsidyType>();
        }
        return this.subsidy;
    }

}
