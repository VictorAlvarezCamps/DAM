<?xml version="1.0" encoding="ISO-8859-1"?><!-- DWXMLSource="Continentes.xml" -->
<xsl:stylesheet version ="1.0" xmlns:xsl= "http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
   <html>
   <body bgcolor="#FF8000">
   <center><h1>Mundo</h1></center>
      <table border="2" bgcolor="#58D3F7">
      <tr bgcolor="#887788">
      	<th><center>continente</center></th>
        <th><center>Nombre</center></th> 
        <th><center>Capital</center></th>
        <th><center>Idioma</center></th>
        <th><center>Poblacion</center></th>
        <th><center>InformacionPais</center></th>        
      </tr>
      <xsl:for-each select="Mundo/Pais">
      <tr>
      	  <td><xsl:value-of select="@continente"/></td>
          <td><xsl:value-of select="Nombre"/></td> 
          <td><xsl:value-of select="Capital"/></td>
          <td><xsl:value-of select="Idioma"/></td>
          <td><xsl:value-of select="Poblacion"/></td>
          <td><xsl:value-of select="InformacionPais"/></td>
      </tr>
      </xsl:for-each> 
     </table>
     </body>
</html>
</xsl:template>
</xsl:stylesheet>