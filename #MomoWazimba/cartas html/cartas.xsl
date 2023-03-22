<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="cartas">
        <html lang="en">
            <head>
                <meta charset="UTF-8"></meta>
                <meta http-equiv="X-UA-Compatible" content="IE=edge"></meta>
                <meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>
                <link rel="stylesheet" href="styles.css"></link>
                <title>Cartas contra la humanidad</title>
            </head>
            <body>

                <div id="flexContainer">
                    <div class="wrapper">
                        <xsl:for-each select="//carta[@tipo='negra']">
                            <div class="carta negra">
                                <h1>
                                    <xsl:value-of select="."></xsl:value-of>
                                </h1>
                            </div>
                        </xsl:for-each>

                    </div>

                    <div class="wrapper">
                        <xsl:for-each select="//carta[@tipo='blanca']">
                            <div class="carta blanca">
                                <h1>
                                    <xsl:value-of select="."></xsl:value-of>
                                </h1>
                            </div>
                        </xsl:for-each>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>