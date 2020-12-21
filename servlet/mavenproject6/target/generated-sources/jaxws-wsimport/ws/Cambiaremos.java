
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambiaremos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambiaremos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idalumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ci" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambiaremos", propOrder = {
    "idalumno",
    "ci"
})
public class Cambiaremos {

    protected String idalumno;
    protected int ci;

    /**
     * Obtiene el valor de la propiedad idalumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdalumno() {
        return idalumno;
    }

    /**
     * Define el valor de la propiedad idalumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdalumno(String value) {
        this.idalumno = value;
    }

    /**
     * Obtiene el valor de la propiedad ci.
     * 
     */
    public int getCi() {
        return ci;
    }

    /**
     * Define el valor de la propiedad ci.
     * 
     */
    public void setCi(int value) {
        this.ci = value;
    }

}
