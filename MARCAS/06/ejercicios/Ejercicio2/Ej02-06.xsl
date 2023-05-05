<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/receta">
        <html>
            <head>
                <style>
                    #receta {
                        text-align:center;
                        color: white;
                        background-color: black;
                    }
                    #titulo{
                        Color: DarkRed;
                    }
                </style>
            </head>
            <body>
                <h1 id="receta">Receta</h1>
                <h1 id="titulo"><xsl:value-of select="titulo"/></h1>
                <p>Tiempo Elaboración: <xsl:value-of select="tiempo_elaboracion"/><xsl:value-of select="tiempo_elaboracion/@t_medida"/></p>
                <p>Origen: <xsl:value-of select="cocina"/></p>
                <p>Especialidad: <xsl:value-of select="especialidad"/></p>
                <h2>Ingredientes (para 10 personas)</h2>
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Cantidad</th>
                        <th>Medida</th>
                        <th>Categoría</th>
                    </tr>
                    <xsl:for-each select="ingredientes/ingrediente">
                        <tr>
                            <td>
                                <xsl:value-of select="nombre"/>
                            </td>
                            <td>
                                <xsl:value-of select="cantidad"/>
                            </td>
                            <td>
                                <xsl:value-of select="medida"/>
                            </td>
                            <td>
                                <xsl:value-of select="./@categoria"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <h2>Proceso</h2>
                <xsl:for-each select="procedimiento/paso">
                    <ol>
                        <li><xsl:value-of select="."/></li>
                    </ol>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>    
</xsl:stylesheet>