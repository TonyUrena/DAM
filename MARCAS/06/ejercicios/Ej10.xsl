<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/inventario">
        <html>
            <body>
                <xsl:element name="ul">
                    <xsl:for-each select="producto">
                        <xsl:element name="li">Elemento <xsl:value-of select="@codigo"/>
                            <xsl:element name="ul">
                                <xsl:element name="li">Nombre: <xsl:value-of select="nombre"/></xsl:element>
                                <xsl:element name="li">Peso: <xsl:value-of select="peso"/><xsl:value-of select="@unidad"/></xsl:element>
                            </xsl:element>
                        </xsl:element>
                    </xsl:for-each>
                </xsl:element>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>