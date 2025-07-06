# Deber # 2 Programación Orientada a Objetos
#### Descripción del Proyecto
<P>
Este proyecto tiene como objetivo aplicar conceptos basicos de programación orientada a objetos en Java utilizando Eclipse, es un sistema que permite gestionar distintos tipos del contenido audio visual.
El código fue ampliado con  nuevas clases, relaciones y funcionalidades.
Adicional, se implementaron nuevas subclases que heredan de la clase "ContenidoAudioVisual".
</P>
###     
####Caracteristicas principales
- Gestión de peliculas y sus actores.
- Gestión de Series de Tv con sus temporadas.
- Gestión de documentales con sus investigadores.
- Gestión de webinars con sus presentadores.
- Gestión de podcast con su contenido.
   
####Instrucción de instalación
<p>
01. Abrir Eclipse.
02. Seleccionar File > Import > Git > Proyects from Git.
03. Elije Clone URl y pega este enlace: https://github.com/VinicioAyala/ProyectosPooDb2.git
04. Elige la rama principal y *NEXT*.
05. Importa el proyecto como *EXISTING JAVA PROYECT*.
06. Finalizar y esperar que Eclipse cargue adecuadamente el proyecto.
</p>

####Ejecución del proyecto
- Abrir la clase PruebaAudioVisual que contiene el método *main*.
- Hacer clic en el icono redondo verde (*RUN*) que ejecuta el código.

####Editar nuevo contenido
<p>Puedes modificar o extender el código creando nuevas instancias, en las que adjunto a continuación: </p>

	    Pelicula p = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
                 p.agregarActor(new Actor("D CAPRIO",60));
                 p.agregarActor(new Actor("WILL SMITH",55));
        
        SerieDeTV s = new SerieDeTV("Juego del Calamar", 60, "Terror", 3);
        		  s.agregarTemporada(new Temporada("Temporada 2",12));
        		  
        Documental d = new Documental("Nanuk, el esquimal", 45, "Investigación", "Vida en el Artico");
        		   d.agregarInvestigador(new Investigador("Robert J. Flaherty",67));
        
        		   
        Webinars w = new Webinars("Lenguaje de Programación", 41, "Educativo", "Programacion orientada a objetos");
                 w.agregarPresentador(new Presentador("Luisina","Cuenca",28));
        
        Podcast t = new Podcast("Inteligencia Artificial", 10, "Informativo", "Video");
                t.agregarContenido(new Contenido("Programación con IA",3));

####Crear cuenta Github
- Crear una cuenta en Github con correo personal o de empresa.
- Llenar el formulario con informacion personal.
- Marcar como *public* , o *privado*  si no necesitas compartir.
- Crear un repositorio en *Create repository*.

####Subir proyecto desde Eclipse a Github
- Descargar Github Destop.
- El programa reconoce tu usuario y se vinculan.
- Existen varias opciones para cargar tu proyecto, la mas practica es arrastrar tu proyecto hasta la pantalla de Github.

####Estructura de carpetas
![Carpetas](https://github.com/VinicioAyala/ProyectosPooDb2/blob/5e8782689a893072b06d7697c2f20a859af350d8/CapturaPOO2.PNG)

####Diagrama de Clases
![Diagrama realizado con UML Common Elements](https://github.com/VinicioAyala/ProyectosPooDb2/blob/beda63ba49a4a633b81783cd226f8237aeedadf1/DiagramaPOODeber2.jpg)
