
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numExecutions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeLocation", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "column",
    "line",
    "numExecutions",
    "time"
})
public class CodeLocation {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int column;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int line;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numExecutions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected double time;

    /**
     * Gets the value of the column property.
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     */
    public void setColumn(int value) {
        this.column = value;
    }

    /**
     * Gets the value of the line property.
     * 
     */
    public int getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     */
    public void setLine(int value) {
        this.line = value;
    }

    /**
     * Gets the value of the numExecutions property.
     * 
     */
    public int getNumExecutions() {
        return numExecutions;
    }

    /**
     * Sets the value of the numExecutions property.
     * 
     */
    public void setNumExecutions(int value) {
        this.numExecutions = value;
    }

    /**
     * Gets the value of the time property.
     * 
     */
    public double getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(double value) {
        this.time = value;
    }

}
