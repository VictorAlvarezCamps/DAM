<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version ="1.0" xmlns:xsl= "http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
   <html>
   <body bgcolor="#FF8000">
   <center><h1>Videoclub</h1></center>
      <table border="2" bgcolor="#58D3F7">
      <tr bgcolor="#887788">
        <th><center>T�tulo</center></th> 
        <th><center>Nacionalidad</center></th>
        <th><center>Productor</center></th>
        <th><center>Director</center></th>
        <th><center>A�o</center></th>
        <th><center>Duracion</center></th>
        <th><center>Genero</center></th>
        <th><center>Sinopsis</center></th>
        <th><center>URL</center></th>
      </tr>
      <xsl:for-each select="Videoclub/pelicula">
      <tr>
          <td><xsl:value-of select= "T�tulo"/></td> 
          <td><xsl:value-of select= "Nacionalidad"/></td>
          <td><xsl:value-of select= "Productor"/></td>
          <td><xsl:value-of select= "Director"/></td>
          <td><xsl:value-of select= "Anyo"/></td>
          <td><xsl:value-of select= "Duraci�n"/></td>
          <td><xsl:value-of select= "G�nero"/></td>
          <td><xsl:value-of select= "Sinopsis"/></td>
          <td><xsl:value-of select= "URL"/></td>
      </tr>
      </xsl:for-each> 
     </table>
     </body>
</html>
</xsl:template>
</xsl:stylesheet>