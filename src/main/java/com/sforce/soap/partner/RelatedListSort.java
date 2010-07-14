/**
 * RelatedListSort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class RelatedListSort  implements java.io.Serializable {
    private boolean ascending;

    private String column;

    public RelatedListSort() {
    }

    public RelatedListSort(
           boolean ascending,
           String column) {
           this.ascending = ascending;
           this.column = column;
    }


    /**
     * Gets the ascending value for this RelatedListSort.
     * 
     * @return ascending
     */
    public boolean isAscending() {
        return ascending;
    }


    /**
     * Sets the ascending value for this RelatedListSort.
     * 
     * @param ascending
     */
    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }


    /**
     * Gets the column value for this RelatedListSort.
     * 
     * @return column
     */
    public String getColumn() {
        return column;
    }


    /**
     * Sets the column value for this RelatedListSort.
     * 
     * @param column
     */
    public void setColumn(String column) {
        this.column = column;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RelatedListSort)) return false;
        RelatedListSort other = (RelatedListSort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ascending == other.isAscending() &&
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              this.column.equals(other.getColumn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isAscending() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getColumn() != null) {
            _hashCode += getColumn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedListSort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RelatedListSort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ascending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ascending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}