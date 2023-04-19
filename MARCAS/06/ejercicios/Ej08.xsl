<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/ies">
        <html>
            <body>
                <xsl:element name="h1">
                    <xsl:value-of select="/ies/@nombre"/>
                </xsl:element>
                <xsl:element name="table">
                    <xsl:attribute name="border">1</xsl:attribute>
                    <tr>
                        <th>Nombre del ciclo</th>
                        <th>Año del título</th>
                    </tr>
                    <xsl:for-each select="//ciclo">
                        <xsl:element name="tr">
                            <xsl:element name="td">
                                <xsl:value-of select="nombre"/>
                            </xsl:element>
                            <xsl:element name="td">
                                <xsl:apply-templates select="decretoTitulo"/>
                            </xsl:element>
                        </xsl:element>
                    </xsl:for-each>
                    
                </xsl:element>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="//decretoTitulo">
    <xsl:if test="@año>2009">
        <span style="color: verde">
            <xsl:value-of select="@año"/>
        </span>
    </xsl:if>
    <xsl:if test="@año=2009">
        <span style="color: azul">
            <xsl:value-of select="@año"/>
        </span>
    </xsl:if>
    <xsl:if test="@año<2009">
        <span style="color: rojo">
            <xsl:value-of select="@año"/>
        </span>
    </xsl:if>
    </xsl:template>
</xsl:stylesheet>