
package br.com.caelum.correios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cObjeto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cObjeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prazoEntrega" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPostagemCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataMaxEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postagemDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataUltimoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUltimoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoUltimoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoUltimoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cObjeto", propOrder = {
    "codigo",
    "servico",
    "cepOrigem",
    "cepDestino",
    "prazoEntrega",
    "dataPostagem",
    "dataPostagemCalculo",
    "dataMaxEntrega",
    "postagemDH",
    "dataUltimoEvento",
    "codigoUltimoEvento",
    "tipoUltimoEvento",
    "descricaoUltimoEvento",
    "erro",
    "msgErro"
})
public class CObjeto {

    protected String codigo;
    protected String servico;
    protected String cepOrigem;
    protected String cepDestino;
    protected int prazoEntrega;
    protected String dataPostagem;
    protected String dataPostagemCalculo;
    protected String dataMaxEntrega;
    protected String postagemDH;
    protected String dataUltimoEvento;
    protected String codigoUltimoEvento;
    protected String tipoUltimoEvento;
    protected String descricaoUltimoEvento;
    protected String erro;
    protected String msgErro;

    /**
     * Obt�m o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obt�m o valor da propriedade servico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServico() {
        return servico;
    }

    /**
     * Define o valor da propriedade servico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServico(String value) {
        this.servico = value;
    }

    /**
     * Obt�m o valor da propriedade cepOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepOrigem() {
        return cepOrigem;
    }

    /**
     * Define o valor da propriedade cepOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepOrigem(String value) {
        this.cepOrigem = value;
    }

    /**
     * Obt�m o valor da propriedade cepDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepDestino() {
        return cepDestino;
    }

    /**
     * Define o valor da propriedade cepDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepDestino(String value) {
        this.cepDestino = value;
    }

    /**
     * Obt�m o valor da propriedade prazoEntrega.
     * 
     */
    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    /**
     * Define o valor da propriedade prazoEntrega.
     * 
     */
    public void setPrazoEntrega(int value) {
        this.prazoEntrega = value;
    }

    /**
     * Obt�m o valor da propriedade dataPostagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPostagem() {
        return dataPostagem;
    }

    /**
     * Define o valor da propriedade dataPostagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPostagem(String value) {
        this.dataPostagem = value;
    }

    /**
     * Obt�m o valor da propriedade dataPostagemCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPostagemCalculo() {
        return dataPostagemCalculo;
    }

    /**
     * Define o valor da propriedade dataPostagemCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPostagemCalculo(String value) {
        this.dataPostagemCalculo = value;
    }

    /**
     * Obt�m o valor da propriedade dataMaxEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMaxEntrega() {
        return dataMaxEntrega;
    }

    /**
     * Define o valor da propriedade dataMaxEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMaxEntrega(String value) {
        this.dataMaxEntrega = value;
    }

    /**
     * Obt�m o valor da propriedade postagemDH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostagemDH() {
        return postagemDH;
    }

    /**
     * Define o valor da propriedade postagemDH.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostagemDH(String value) {
        this.postagemDH = value;
    }

    /**
     * Obt�m o valor da propriedade dataUltimoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimoEvento() {
        return dataUltimoEvento;
    }

    /**
     * Define o valor da propriedade dataUltimoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimoEvento(String value) {
        this.dataUltimoEvento = value;
    }

    /**
     * Obt�m o valor da propriedade codigoUltimoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUltimoEvento() {
        return codigoUltimoEvento;
    }

    /**
     * Define o valor da propriedade codigoUltimoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUltimoEvento(String value) {
        this.codigoUltimoEvento = value;
    }

    /**
     * Obt�m o valor da propriedade tipoUltimoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUltimoEvento() {
        return tipoUltimoEvento;
    }

    /**
     * Define o valor da propriedade tipoUltimoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUltimoEvento(String value) {
        this.tipoUltimoEvento = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoUltimoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoUltimoEvento() {
        return descricaoUltimoEvento;
    }

    /**
     * Define o valor da propriedade descricaoUltimoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoUltimoEvento(String value) {
        this.descricaoUltimoEvento = value;
    }

    /**
     * Obt�m o valor da propriedade erro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErro() {
        return erro;
    }

    /**
     * Define o valor da propriedade erro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErro(String value) {
        this.erro = value;
    }

    /**
     * Obt�m o valor da propriedade msgErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErro() {
        return msgErro;
    }

    /**
     * Define o valor da propriedade msgErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErro(String value) {
        this.msgErro = value;
    }

}
