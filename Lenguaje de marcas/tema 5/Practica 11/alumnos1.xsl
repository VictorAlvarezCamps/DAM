<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version ="1.0" xmlns:xsl= "http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
   <html>
   <body bgcolor="#FF8000">
   <center><h1>Colegio</h1></center>
      <table border="2" bgcolor="#58D3F7">
      <tr bgcolor="#887788">
        <th><center>Nombre</center></th> 
        <th><center>Dirección</center></th>
        <th><center>Población</center></th>
        <th><center>Fecha nacimiento</center></th>
        <th><center>Curso actual</center></th>
        <th><center>Telefono contacto</center></th>
      </tr>
      <xsl:for-each select="Colegio/Alumno">
      <tr>
          <td><xsl:value-of select= "Nombre"/></td> 
          <td><xsl:value-of select= "Direccion"/></td>
          <td><xsl:value-of select= "Poblacion"/></td>
          <td><xsl:value-of select= "FechaNacimiento"/></td>
          <td><xsl:value-of select= "CursoActual"/></td>
          <td><xsl:value-of select= "tlfnoContacto"/></td>
      </tr>
      </xsl:for-each> 
     </table>
     </body>
</html>
</xsl:template>
</xsl:stylesheet>