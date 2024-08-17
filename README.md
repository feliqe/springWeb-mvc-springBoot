## Spring boot  MVC

Desarrollo de aplicaciones web con spring boot web

------------------------------------ CONCEPTOS  -------------------------------

- se crea la class en formato canguro, pero con la primera letra en mayúscula
- para definir el puerto que necesitamos los realizamos en application.properties
- en IndexController realizamos la configuración de la vista
- en index es nuestro html principal
- en models Usuario es donde indicaremos las variables que podemos usar también se puede definir la base de datos los nombres de las tablas
- en IndexController creamos métodos para poder usar las variables y darle información, se crean método donde tiene la esta información para definirlo de manera global y todas las demás rutas y métodos puedan usarlo
- en EjemploParamsController es como enviar parámetros desde la url
- en EjemploVariablesRutaController pasamos los datos directos en el html
- para pasar los títulos de cada modelo se cargan application.properties
- en IndexController es donde creamos las variables e indicamos los campos asignados en application.properties
- en TextoPropertiesConfig es donde se configura para poder cambiar la ubicación donde se toman los titulo escritos en application.properties
- HomeController es para redireccionar la página de inicio a una dirección

-----------------ORDEN DE CREACION DE DOCUMENTOS----------------

- crear el package controllers
- se crea en controllers la class IndexController
- se crea en templae el index.html
- se crear el package models
- se crear en models la class Usuario
- se crea el package EjemploParamsController
- se crea la carpeta params en template
- se crea en params el ver.html
- se crea en params el index.html
- se crea la carpeta variable en template
- se crea en params el ver.html
- se crea en params el index.html
- se crea la carpeta css en static
- se crea en css style.css
- se crea la carpeta imagen en static
- se crea en la raiz TextoPropertiesConfig
- se crea HomeController
