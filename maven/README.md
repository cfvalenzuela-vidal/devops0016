Bootcamp DevOps – Grupo 11
Alumno: Cristian Valenzuela Vidal – cfvalenzuela.vidal@gmail.com
	     Eduardo Ramírez – eramirez4@uc.cl       
               
Ejercicio guiado M3-3: "Automatización Profesional con Maven” 
                                                                                                 
¿Qué aprendiste sobre el ciclo de vida de Maven?

Los principales ciclos de vida como: validate, compile, test, package, install y deploy se ejecutan para que un proyecto se construya en fases claras esto permite la automatización y mantener el control de cada etapa del desarrollo de una manera más eficiente.  

¿Cómo facilita Maven el trabajo en equipo y la reproducibilidad?

La estandarización de proyectos de forma centralizada es mediante el Modelo de Objetos de Proyecto (pom.xml) así se logra estructurar el proyecto de forma eficiente ya que las versiones de librerías y plugins son las mismas evitando conflictos.

¿Cuál fue el mayor reto al trabajar con dependencias?

Maven debería gestionar las dependencias de un proyecto automáticamente a través del archivo pom.xml, sin embargo, algunas veces falla y se modifico manualmente la versión de junit para lograr la compatibilidad esto generaba a errores difíciles de visualizar.

¿Por qué crees que Maven es tan usado en entornos empresariales?

Debido a que estandariza ofreciendo: orden, consistencia y automatización controlando las versiones de las dependencias y permite construir el proyecto sin errores en diferentes entornos. Grandes empresas  utilizan Nexus Repository (repositorio de artefactos que permite almacenar, organizar y distribuir librerías y paquetes, como archivos  jar o pom) entre otros para gestionar librerías internas de Maven. 

¿Qué harías diferente si tuvieras que automatizar otro proyecto?
    
Para automatizar otro proyecto debemos tener la documentación del anterior para no perder tiempo y mantener el orden. Revisión previa de dependencias para evitar conflictos, duplicidades, usar versiones obsoletas, incompatibles. Investigando se encontraron dos comandos que pueden ayudar:

mvn dependency:tree → Muestra el árbol de dependencias, útil para ver conflictos o duplicados.

mvn dependency:analyze → Dependencias que no se usan. 
