
package teamsC;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de team complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="team">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="players" type="{http://team.ch01/}player" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rosterCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "team", propOrder = {
    "name",
    "players",
    "rosterCount"
})
public class Team {

    protected String name;
    @XmlElement(nillable = true)
    protected List<Player> players;
    protected int rosterCount;

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the players property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the players property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Player }
     * 
     * 
     */
    public List<Player> getPlayers() {
        if (players == null) {
            players = new ArrayList<Player>();
        }
        return this.players;
    }

    /**
     * Obtém o valor da propriedade rosterCount.
     * 
     */
    public int getRosterCount() {
        return rosterCount;
    }

    /**
     * Define o valor da propriedade rosterCount.
     * 
     */
    public void setRosterCount(int value) {
        this.rosterCount = value;
    }

}
