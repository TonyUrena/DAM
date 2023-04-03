<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/inventario">
        <html>
            <body>
                <h1>Resultados</h1>
                <xsl:element name="table">
                    <xsl:for-each select="producto">
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="peso"/>
                            </td>
                            <td>
                                <xsl:value-of select="lugar/@edificio"/><xsl:value-of select="lugar/aula"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </xsl:element>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>