<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/Hoteles">
        <html>
            <body>
                <h1>Hoteles</h1>
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Categoria</th>
                        <th>Piscina</th>
                        <th>Localizacion</th>
                        <th>Precio Hab. Doble</th>
                    </tr>
                    <xsl:for-each select="Hotel">
                    <tr>
                        <td><xsl:value-of select="Nombre"/></td>
                        <td><xsl:value-of select="Categoria"/></td>
                        <td>
                        <xsl:if test="Piscina = 'true'">
                            SI
                        </xsl:if>
                        <xsl:if test="Piscina = 'false'">
                            NO
                        </xsl:if>
                        </td>
                        <td><xsl:value-of select="Localizacion/Pais"/></td>
                        <td><xsl:value-of select="Habitaciones/Dobles/Precio"/></td>
                    </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>    
</xsl:stylesheet>