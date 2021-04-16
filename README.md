Clase 01 (Introducción)
-¿Qué son los microservicios?
-¿Qué beneficios nos ofrece una arquitectura basada en microservicios?
-¿Qué dificultades conlleva el uso de una arquitectura basada en microservicios?
-¿En qué se diferencian con las arquitectura monolíticas?

Clase 02 (Eureka Server)
-¿Qué es un servidor de registro y descubrimiento?
-Creando nuestros primeros microservicios
-Registrando nuestros microservicios en Eureka Server
-Conociendo los endpoints de Eureka Server

Clase 03 (Spring Cloud Config)
-¿Qué es un servidor de configuración centralizada?
-Obteniendo los archivos de configuración(.properties, .yml) de nuestros microservicios desde un repositorio
-Uso de patterns, profile y labels
-Usando actuator para refrescar beans

Clase 04 (JCE, Jasypt, Ribbon)
-Encriptación estática de propiedades de configuración con JCE
-Encriptación estática de propiedades de configuración con Jasypt (proyecto zprueba)
-Balanceo de carga de lado del cliente con Ribbon

Clase 05 (Hystrix)
-Entendiendo el patrón circuit breaker
-Implementando circuit breaker con hystrix
-Decorando métodos con @HystrixCommand y definiendo el método fallback
-Configurando hystrix command properties

Clase 06 (Zuul)
-¿Qué es un Edge Server y para qué nos sirve?
-Levantando nuestro primer servidor perimetral (Edge Server) con Zuul
-Entendiendo el enrrutamiento de peticiones en Zuul mediante archivos de configuración (.properties, .yml)
-Entendiendo los filtros de Zuul