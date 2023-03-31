<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/ies">
        <html>
            <xsl:element name="h1">
                <xsl:value-of select="/ies/@nombre"/>
            </xsl:element>
            <xsl:element name="p">
                Página web:
                <xsl:element name="a">
                    <xsl:attribute name="href">
                        <xsl:value-of select="/ies/@web"/>
                    </xsl:attribute>
                    <xsl:value-of select="/ies/@web"/>
                </xsl:element>
            </xsl:element>
            
            <xsl:element name="table">
                <xsl:attribute name="border">1</xsl:attribute>
                <tr>
                    <th>Nombre del ciclo</th>
                    <th>Grado</th>
                    <th>Año del título</th>
                </tr>
                <xsl:for-each select="//ciclo">
                    <xsl:element name="tr">
                        <xsl:element name="td">
                            <xsl:value-of select="nombre"/>
                        </xsl:element>
                        <xsl:element name="td">
                            <xsl:value-of select="grado"/>
                        </xsl:element>
                        <xsl:element name="td">
                            <xsl:value-of select="decretoTitulo/@año"/>
                        </xsl:element>
                    </xsl:element>
                </xsl:for-each>
                
            </xsl:element>
            
        </html>
    </xsl:template>
</xsl:stylesheet>