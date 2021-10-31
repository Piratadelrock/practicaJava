# practica Java 
 *casi cualquier cosa que pudiera decir es honesta y haría más daño que bien -James Gosling*

# JAVA:
    java es un lenguaje de alto nivel 
verde alto nivel: java javascript ruby python 
amarillo scala, java
naranja medio c++
rojo y naranja entre bajo y medio: c
rojo bajo nivel : machine code assembly 

* primer nivel: 
    java SE special edition aplicaciones de escritorio, modo consola.

    desde el java SE 6 se inicio para los proyectos de los desarrolladores
* segundo nivel: 
    java EE enterprise su lugar esta en web, servidores, apps mejor distribuidas


Write Once 
Run Anywhere 
WORA 

java SE -> java EE

# JAVA DEVELOPMENT KIT JDK 
 * Java runtime environment JRE 
    es la maquina virtual de java, que hace serla multiplataforma, tambien contiene algunas librerias 
 * Compilador de java 
    el jdk trae el compilador de java, que hace que pueda ser traducido a bitecode, que hace que se pueda ejecutar y se pueda leer
 * API de desarrollo
    java contiene muchas apis de desarrollo, que son una base para el ddesarrollo, que nos ayuda a no partir de cero, que podemos simplemente tomar "ingredientes para crear nuestros propios programas"
# VERSIONES ACTUALIZADAS / 6 MESES 
    EXECPTO las LTS long term support de 3 años
 * JDK 11 java SE 11: 
    * es la primera version de java en la que se cobra licencia.
    * Free- ambientes de desarrollo y testing
# openJDK 
    Es la version open-source de java SE platform edition
    existe desde java SE 6 
    impulsada por sun microsystems 2006
    comunidad y compañia apoyador: red hat

# HERRAMIENTAS mas usadas en java
* versiones de java adoptados son entre java 7-11, la mas usada es java 8 LTS(la mayoria de ambientes de desarrollo)
* SERVER: tipos de ambiente mas utilizada es maven el doble de gradle, gradle tambien se usa.
* FRAMEWORKS: Spring v2, 
* IDE entornos de desarrollo integrado: es un entorno de programacion que ha sido empaquetado como un progama de aplicacion
    editor de código 
    compilador 
    depurador 
    constructor de interfaz gráfica
    IDE'S netbeans, eclipse, intellij idea


# metodo main
 es el punto de entrada de ua aplicación java.
	public static void main (String[] args){
	    System.out.println("Hola mundo");
	}
sin el la aplicacion no se ejecutara y saldra error 

# comandos JAVA  
  	 //sout : System.out.println("Hola mundo");

    
# QUE PASA CUANDO SE EJECUTA UN PROGRAMA JAVA
# primera fase: archivos .java
    trabajamos con los: "archivos .java", creando un hola mundo,
    conocidos como el codigo fuente del programa,
    la funcionalidad es imprimir un texto.
# segunda fase: compilador javac
    cuando damos run lo que sucede es que se activa el compilador java,
    conocido como javac, esto en realidad lo estamos usando con un boton,
    cuando damos clic derecho run, empezo a compilar, analizo el codigo java
    y lo empezo a traducir a un lenguaje que pueda leer nuestra computadora 
    para mostrarnos ese mensaje, ese lenguaje es llamado bytecode, que en realidad
    seran archivos .class y esos archivos comprenden un monton de simbolos, este es 
    el efecto del compilador.
# tercera fase: bytecode class
    ese el lenguaje de los archivos generados .class
    desde el lenguaje de programacion java
# fase final: JVM java (java virtual machine)
    se encarga de ejecutar el código 
    de forma que funcione en cualquier dispositivo o sistema operativo.
    es el que crea ese efecto multiplataforma del lenguaje
    el que procesa los .class para poder comprender la programacion 
   

 * 1.escribir codigo fuente: editar.
 * 2.COMPILADOR javac: compilar, cargar, analizarlo, verificarlo.
 * 3.EJECUCION: interpretar, cargo en un empaquetado, preparando el archivo .class
 por lo tanto java es compilado e interpretado
 
 # la JSHELL de java
 Sabías que Java tiene una herramienta interactiva en dónde puedes ir probando segmentos
 de código en vez de realizar todo el proceso de creación de un programa en Java.
 Escribir, compilar y correr.
 
 Su nombre es jshell y está disponible desde la versión 9 de Java.
 
 Abre tu consola de comandos o terminal, corre el siguiente comando:
    $java -version
 
 Ejercicio 1.
 Investiga cómo cambiar la versión de Java desde tu
  consola de comandos o terminal
 
 # comandos consola java jshell(v9 en adelante)
 antes se debe instalar el jdk mayor a 9 
 
    para revisar la version 
     java -version
    en esta seccion sera para cambiar de path o ruta del jdk por consola
     set JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-11.0.13.8-hotspot
     set PATH=%JAVA_HOME%\bin;%PATH%
    para entrar a jshell tecleamos 
        jshell
    para salir 
        /ex
    tambien podemos usar sysdm.cpl desde ejecutar o cmd para abrir 
    las variables de entorno y cofigurar los paths que queremos
     
 Ejercicio 2.
 Asegurate de tener definida una versión superior a la 8.
 Ahora desde tu terminal escribe el siguiente comando para abrir nuestra jshell
 
 $jshell 
 Screen Shot 2019-07-24 at 5.04.52 PM.png
 Ahora escribe la línea de código para imprimir un texto (no olvides poner ; y dar enter).
 
 # variables en java
    tipoDeDato nombreVariable;
    int salario;
    String nombre;
# nombres de las variables
    *java es sensible a mayúsculas y minúsculas 
    *deben comenzar con una letra, simbolo "$" o guion bajo "_"
    *letras posteriores pueden ser números, $ y "_"
    *las constantes se escriben en mayusculas y contienen "_".
        String _NOMBREDESARROLLADOR = "Emmanuel"; 
# convención CAMELLO -> CAMEL CASE
    // Upper Camel Case: la primer letra sera mayúscula separandola con iniciales en mayúscula
    class SoyUnaClase {};
        clases: Nombre de clase identico al archivo.
    // Lower Camel Case:la primer letra sera minúscula
    int soyUnNumeroInt = 10;
        nombres de metodos,nombres de las variables 
# tipos de datos DataTypes
    btye: rango -128 a 127 (1 byte)
    short Rango -32,768 a 32,767 (2 bytes)
    int rango -2,147,483,648 a 2,147,483,647 (4 bytes) 
    long rango -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 (8 bytes) 
    
    Punto flotante
        (4 bytes)float: rango 1.40129846432481707e-45 a 3.40282346638528860e+38  
        (8 bytes)double: rango 4.94065645841246544e-324d a 1.79769313486231570e+308d
            double nD = 123.4567891233;
            float nF = 123.456F;

    tipo de dato long 
        long nL = 12345678901; dara error
        se debera colocar una L al final 
        long nL = 12345678901L;
        
# tipos de datos solo para char y boolean
Recuerda que esto solo funciona con versiones superiores a Java 10.

     char: Ocupa 2 bytes y solo puede almacenar 1 dígito,
     debemos usar comillas simples en vez de comillas dobles.
     boolean: Son un tipo de dato lógico, solo aceptan los valores true y false.
     También ocupa 2 bytes y almacena únicamente 1 dígito.
     Seguro te diste cuenta que siempre debemos escribir el tipo de dato de nuestras variables antes de definir su nombre y valor.
     Pero esto cambia a partir de Java 10:
     solo debemos escribir la palabra reservada var y
     Java definirá el tipo de dato de nuestras variables automáticamente:
     
     var salary = 1000; // INT
     //pension 3%
     var pension = salary * 0.03; // DOUBLE
     var totalSalary = salary - pension; // DOUBLE
     
# Operadores de asignación:
    
    +=: a += b es equivalente a a = a + b.
    -=: a -= b es equivalente a a = a - b.
    *=: a *= b es equivalente a a = a * b.
    /=: a /= b es equivalente a a = a / b.
    %=: a %= b es equivalente a a = a % b.
#Operadores de incremento:
    
    ++: i++ es equivalente a i = i + 1.
    --: i-- es equivalente a i = i - 1.
    Podemos usar estos operadores de forma prefija (++i) o postfija (i++). La diferencia está en qué operación se ejecuta primero:
    
    // Incremento postfijo:
    int vidas = 5;
    int regalo = 100 + vidas++;
    
    System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
    // Regalo: 105, vidas: 6
    
    // Incremento prefijo:
    int vidas = 5;
    int regalo = 100 + ++vidas;
    
    System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
    // Regalo: 106, vidas: 6
     