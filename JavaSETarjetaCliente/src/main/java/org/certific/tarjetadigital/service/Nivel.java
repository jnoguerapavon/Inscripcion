
package org.certific.tarjetadigital.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nivel.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="nivel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Basico"/>
 *     &lt;enumeration value="Intermedio"/>
 *     &lt;enumeration value="Experto"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nivel")
@XmlEnum
public enum Nivel {

    @XmlEnumValue("Basico")
    BASICO("Basico"),
    @XmlEnumValue("Intermedio")
    INTERMEDIO("Intermedio"),
    @XmlEnumValue("Experto")
    EXPERTO("Experto");
    private final String value;

    Nivel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Nivel fromValue(String v) {
        for (Nivel c: Nivel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
