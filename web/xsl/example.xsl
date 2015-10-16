<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>

    <xsl:template match="adrbook">
        <h1>Адресная книга</h1>
        <hr/>
        <xsl:apply-templates select="person"/>
    </xsl:template>

    <xsl:template match="person1">
        <h2>
            <b>
                <xsl:value-of select="name/first"/>
            </b>
            -
            <i>
                <xsl:value-of select="name/last"/>
            </i>
            <br/>
        </h2>

        <ul>
            <xsl:apply-templates select="contact"/>
        </ul>
    </xsl:template>

    <xsl:template match="contact">
        <xsl:for-each select="phone">
            <xsl:sort select="text()" order="ascending"/>
            <li>
                <xsl:value-of select="text()"/>
            </li>
        </xsl:for-each>
    </xsl:template>

    <xsl:template match="person">
        <table border="1">
            <xsl:choose>
                <xsl:when test="position() mod 2 = 0">
                    <tr>
                        <td style="background-color: yellow">
                            <xsl:value-of select="name/first"/>
                        </td>
                        <td style="background-color: yellow">
                            <xsl:value-of select="name/last"/>
                        </td>
                    </tr>
                </xsl:when>
                <xsl:otherwise>
                    <tr>
                        <td style="background-color: blue">
                            <xsl:value-of select="name/first"/>
                        </td>
                        <td style="background-color: blue">
                            <xsl:value-of select="name/last"/>
                        </td>
                    </tr>
                </xsl:otherwise>
            </xsl:choose>
        </table>
    </xsl:template>


</xsl:stylesheet>