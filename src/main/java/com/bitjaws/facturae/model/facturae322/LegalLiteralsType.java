
package com.bitjaws.facturae.model.facturae322;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LegalLiteralsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LegalLiteralsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegalReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax250Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalLiteralsType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "legalReference"
})
public class LegalLiteralsType {

    @XmlElement(name = "LegalReference")
    protected List<String> legalReference;

    /**
     * Gets the value of the legalReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the legalReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLegalReference() {
        if (legalReference == null) {
            legalReference = new ArrayList<String>();
        }
        return this.legalReference;
    }

}
