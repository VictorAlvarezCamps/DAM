<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version ="1.0" xmlns:xsl= "http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
   <html>
   <body bgcolor="#FF8000">
      <table border="2" bgcolor="#58D3F7">
      <tr bgcolor="#887788">
        <th><center>Alumno</center></th> 
        <th><center>Asignatura</center></th>
        <th><center>Nota</center></th>
        <th><center>Fecha</center></th>
      </tr>
      <xsl:for-each select="Centro/Curso">
      <tr>
          <td><xsl:value-of select= "Alumno"/></td> 
          <td><xsl:value-of select= "Asignatura"/></td>
          <td><xsl:value-of select= "Nota"/></td>
          <td><xsl:value-of select= "Fecha"/></td>
      </tr>
      </xsl:for-each> 
     </table>
     </body>
</html>
</xsl:template>
</xsl:stylesheet>