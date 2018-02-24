
package br.com.caelum.correios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalcPrazoObjetoResult" type="{http://tempuri.org/}cResultadoObjeto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calcPrazoObjetoResult"
})
@XmlRootElement(name = "CalcPrazoObjetoResponse")
public class CalcPrazoObjetoResponse {

    @XmlElement(name = "CalcPrazoObjetoResult", required = true)
    protected CResultadoObjeto calcPrazoObjetoResult;

    /**
     * Obtém o valor da propriedade calcPrazoObjetoResult.
     * 
     * @return
     *     possible object is
     *     {@link CResultadoObjeto }
     *     
     */
    public CResultadoObjeto getCalcPrazoObjetoResult() {
        return calcPrazoObjetoResult;
    }

    /**
     * Define o valor da propriedade calcPrazoObjetoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultadoObjeto }
     *     
     */
    public void setCalcPrazoObjetoResult(CResultadoObjeto value) {
        this.calcPrazoObjetoResult = value;
    }

}
