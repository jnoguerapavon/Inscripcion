
package org.certific.tarjetadigital.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para programas.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="programas">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BootCamp"/>
 *     &lt;enumeration value="JavaCloud"/>
 *     &lt;enumeration value="JavaOracle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "programas")
@XmlEnum
public enum Programas {

    @XmlEnumValue("BootCamp")
    BOOT_CAMP("BootCamp"),
    @XmlEnumValue("JavaCloud")
    JAVA_CLOUD("JavaCloud"),
    @XmlEnumValue("JavaOracle")
    JAVA_ORACLE("JavaOracle");
    private final String value;

    Programas(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Programas fromValue(String v) {
        for (Programas c: Programas.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
