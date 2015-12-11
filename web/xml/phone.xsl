<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="mobile_phone">
        <html>
            <head>
                <link rel="stylesheet" type="text/css" href="../css/style.css"/>
            </head>
            <body>
                <h1>Мобилы</h1>
                <hr/>
                <div class="content">
                    <xsl:apply-templates select="phone"/>
                </div>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="phone">
        <xsl:if test="@id = 1">
            <h1 class="price">Top price</h1>
        </xsl:if>
        <h2>
            <xsl:value-of select="model"/>
        </h2>
        <ul>
            <li>
                <xsl:value-of select="name(price)"/>:
                <xsl:value-of select="price"/>
            </li>
            <li>
                <ul>
                    <li>
                        <xsl:value-of select="manufacturer/name"/>
                    </li>
                    <li>
                        <xsl:value-of select="manufacturer/founded"/>
                    </li>
                    <li>
                        <xsl:value-of select="manufacturer/industry"/>
                    </li>
                    <li>
                        <xsl:value-of select="manufacturer/country"/>
                    </li>
                </ul>
            </li>
            <li>
                <xsl:value-of select="name(sim-card_number)"/>:
                <xsl:value-of select="sim-card_number"/>
            </li>
            <li>
                <xsl:value-of select="name(screen_size)"/>:
                <xsl:value-of select="screen_size"/>
            </li>
            <li>
                <xsl:value-of select="name(resolution)"/>:
                <xsl:value-of select="resolution"/>
            </li>
            <li>
                <xsl:value-of select="name(OS)"/>:
                <xsl:value-of select="OS"/>
            </li>
        </ul>
        <hr/>
    </xsl:template>
</xsl:stylesheet>
