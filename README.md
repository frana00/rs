# Patrones de Diseño - Design Patterns

Este proyecto es parte del curso de Reutilización de Software de la Universidad Internacional de La Rioja (UNIR). Implementa varios patrones de diseño en Java, demostrando diferentes soluciones arquitectónicas a problemas comunes de diseño de software.

## Patrones Implementados

### 1. Patrón Adapter (Adaptador)
Implementado en dos versiones:
- **adapter1**: Adaptación a nivel de objeto entre Pila y Lista
- **adapter2**: Adaptación a nivel de clase entre Pila y Lista

### 2. Patrón Builder
Ubicado en el directorio `builder/`
- Implementa la construcción de documentos en diferentes formatos (HTML y JSON)
- Demuestra la separación entre la construcción y la representación

### 3. Patrón Decorator
Ubicado en el directorio `Decorator/`
- Implementación en el contexto de una agencia de aventuras
- Permite añadir funcionalidades adicionales (complementos) a las aventuras base
- Incluye actividades como Rafting, Espeleología y Tirolinas

### 4. Patrón Abstract Factory
Ubicado en el directorio `factoriaAbstracta/`
- Implementa un sistema de acceso a bases de datos
- Soporta diferentes tipos de bases de datos (MySQL y MongoDB)
- Demuestra la creación de familias de objetos relacionados

### 5. Patrón Interpreter
Ubicado en el directorio `Interprete/`
- Implementa un evaluador de expresiones booleanas
- Incluye operaciones AND y OR
- Maneja expresiones con paréntesis

### 6. Patrón MVC (Model-View-Controller)
Ubicado en el directorio `MVC/`
- Implementa una calculadora
- Demuestra la separación de:
  - Modelo (lógica de negocio)
  - Vista (interfaz de usuario)
  - Controlador (gestión de eventos)

### 7. Patrón Observer
Ubicado en el directorio `Observador/`
- Sistema de monitorización meteorológica
- Implementa una relación uno-a-muchos entre objetos
- Incluye actualizaciones automáticas de los observadores

### 8. Patrón Command
Ubicado en el directorio `Orden/`
- Implementa un mini mando a distancia
- Controla dispositivos como alarma y calefacción
- Demuestra la encapsulación de comandos como objetos

### 9. Patrón Proxy
Ubicado en el directorio `proxy/`
- Implementa un proxy de protección
- Controla el acceso a la ejecución de comandos
- Demuestra el control de acceso a objetos

## Estructura del Proyecto

Cada patrón está organizado en su propio directorio y contiene:
- Código fuente en Java
- Archivos de configuración Maven (pom.xml) cuando aplica
- Recursos y archivos de prueba cuando son necesarios

## Requisitos

- Java JDK 8 o superior
- Maven (para los proyectos que lo utilizan)

## Uso

Cada patrón puede ejecutarse independientemente. Para los proyectos Maven:

```bash
cd [directorio-del-patron]
mvn clean install
mvn exec:java -Dexec.mainClass="[clase-principal]"
```

Para proyectos Java regulares:

```bash
cd [directorio-del-patron]
javac [archivo-principal].java
java [clase-principal]
```

## Ventajas de los Patrones de Diseño

- **Reutilización**: Soluciones probadas a problemas comunes
- **Mantenibilidad**: Código más organizado y estructurado
- **Escalabilidad**: Facilidad para extender funcionalidades
- **Comunicación**: Vocabulario común entre desarrolladores

## Contribución

Este proyecto es con fines educativos como parte del curso de Reutilización de Software de la UNIR.


