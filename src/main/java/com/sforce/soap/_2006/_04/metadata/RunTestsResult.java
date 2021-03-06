
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunTestsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunTestsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeCoverage" type="{http://soap.sforce.com/2006/04/metadata}CodeCoverageResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codeCoverageWarnings" type="{http://soap.sforce.com/2006/04/metadata}CodeCoverageWarning" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="failures" type="{http://soap.sforce.com/2006/04/metadata}RunTestFailure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numFailures" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numTestsRun" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="successes" type="{http://soap.sforce.com/2006/04/metadata}RunTestSuccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalTime" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunTestsResult", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "codeCoverage",
    "codeCoverageWarnings",
    "failures",
    "numFailures",
    "numTestsRun",
    "successes",
    "totalTime"
})
public class RunTestsResult {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CodeCoverageResult> codeCoverage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CodeCoverageWarning> codeCoverageWarnings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<RunTestFailure> failures;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numFailures;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numTestsRun;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<RunTestSuccess> successes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected double totalTime;

    /**
     * Gets the value of the codeCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeCoverageResult }
     * 
     * 
     */
    public List<CodeCoverageResult> getCodeCoverage() {
        if (codeCoverage == null) {
            codeCoverage = new ArrayList<CodeCoverageResult>();
        }
        return this.codeCoverage;
    }

    /**
     * Gets the value of the codeCoverageWarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeCoverageWarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeCoverageWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeCoverageWarning }
     * 
     * 
     */
    public List<CodeCoverageWarning> getCodeCoverageWarnings() {
        if (codeCoverageWarnings == null) {
            codeCoverageWarnings = new ArrayList<CodeCoverageWarning>();
        }
        return this.codeCoverageWarnings;
    }

    /**
     * Gets the value of the failures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunTestFailure }
     * 
     * 
     */
    public List<RunTestFailure> getFailures() {
        if (failures == null) {
            failures = new ArrayList<RunTestFailure>();
        }
        return this.failures;
    }

    /**
     * Gets the value of the numFailures property.
     * 
     */
    public int getNumFailures() {
        return numFailures;
    }

    /**
     * Sets the value of the numFailures property.
     * 
     */
    public void setNumFailures(int value) {
        this.numFailures = value;
    }

    /**
     * Gets the value of the numTestsRun property.
     * 
     */
    public int getNumTestsRun() {
        return numTestsRun;
    }

    /**
     * Sets the value of the numTestsRun property.
     * 
     */
    public void setNumTestsRun(int value) {
        this.numTestsRun = value;
    }

    /**
     * Gets the value of the successes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the successes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunTestSuccess }
     * 
     * 
     */
    public List<RunTestSuccess> getSuccesses() {
        if (successes == null) {
            successes = new ArrayList<RunTestSuccess>();
        }
        return this.successes;
    }

    /**
     * Gets the value of the totalTime property.
     * 
     */
    public double getTotalTime() {
        return totalTime;
    }

    /**
     * Sets the value of the totalTime property.
     * 
     */
    public void setTotalTime(double value) {
        this.totalTime = value;
    }

}
