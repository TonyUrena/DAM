<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/Hoteles">
        <html>
            <body>
                <h1>Receta</h1>
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Categoria</th>
                        <th>Piscina</th>
                        <th>Localizacion</th>
                        <th>Precio Hab. Doble</th>
                    </tr>
                    <xsl:for-each select="Hotel">
                        <xsl:sort select="Habitaciones/Dobles/Precio"/>
                        <tr>
                            <td><xsl:value-of select="Nombre"/></td>
                            <td>
                                <xsl:choose>
                                    <xsl:when test="Categoria = 3">
                                        Bueno
                                    </xsl:when>
                                    <xsl:when test="Categoria = 4">
                                        Muy Bueno
                                    </xsl:when>
                                    <xsl:when test="Categoria = 5">
                                        Excelente
                                    </xsl:when>
                                </xsl:choose>
                            </td>
                            <td>
                                <xsl:if test="Piscina = 'true'">
                                    SI
                                </xsl:if>
                                <xsl:if test="Piscina = 'false'">
                                    NO
                                </xsl:if>
                            </td>
                            <td><xsl:value-of select="Localizacion/Pais"/></td>
                            <td>
                                <xsl:choose>
                                    <xsl:when test="Habitaciones/Dobles/Precio &lt; 100">
                                        Barato
                                    </xsl:when>
                                    <xsl:when test="Habitaciones/Dobles/Precio &gt; 100 and Habitaciones/Dobles/Precio &lt; 300">
                                        Correcto
                                    </xsl:when>
                                    <xsl:when test="Habitaciones/Dobles/Precio &gt; 500">
                                        Caro
                                    </xsl:when>
                                </xsl:choose>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>    
</xsl:stylesheet>