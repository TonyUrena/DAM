<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/employees">
        <html>
            <body>
                <xsl:for-each select="employee">
                    <xsl:sort select="./@hireDate" order="ascending"/>
                    <p>Last: <xsl:value-of select="last"/>
                        First: <xsl:value-of select="first"/>
                        Salary: <xsl:value-of select="salary"/>
                        Hire Date: <xsl:value-of select="./@hireDate"/></p>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>    
</xsl:stylesheet>