<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
    <xsl:template match="/ies">
        <xsl:element name="highschool">
            <xsl:attribute name="name">
                <xsl:value-of select="/ies/@nombre"/>
            </xsl:attribute>
            <xsl:attribute name="webPage">
                <xsl:value-of select="/ies/@web"/>
            </xsl:attribute>
            <xsl:apply-templates select="child::*"/>
        </xsl:element>
    </xsl:template>
    
    <xsl:template match="ciclos">
        <xsl:element name="cicles">
            <xsl:apply-templates select="child::*"/>
        </xsl:element>
    </xsl:template>
    
    <xsl:template match="ciclo">
        <xsl:element name="cicle">
            <xsl:attribute name="id" select="@id"/>
            <xsl:apply-templates select="child::*"/>
        </xsl:element>
    </xsl:template>
    
    <xsl:template match="nombre">
        <xsl:element name="name">
            <xsl:value-of select="."/>
        </xsl:element>
    </xsl:template>
    
    <xsl:template match="grado">
        <xsl:element name="grade">
            <xsl:value-of select="."/>
        </xsl:element>
    </xsl:template>
    
    <xsl:template match="decretoTitulo">
        <xsl:element name="title">
            <xsl:attribute name="year" select="@año"/>
        </xsl:element>
    </xsl:template>
    
</xsl:stylesheet>