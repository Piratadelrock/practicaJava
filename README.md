# DOCUMENTACION JAVA PERSONAL
    * ACTUALIZACION : 12/11/2021 
 *Casi cualquier cosa que pudiera decir es honesta y haría más daño que bien. -James Gosling*


 
# JAVA:
    Estudia de java SE -> java EE
    java es un lenguaje de alto nivel 
    
    verde alto nivel: java, javascript, ruby, python 
    amarillo: scala, java
    naranja medio: c++
    rojo y naranja entre bajo y medio: c
    rojo bajo nivel: machine, code, assembly 
    
   * primer nivel: 
        java SE special edition aplicaciones de escritorio, modo consola.
        desde el java SE 6 se inicio para los proyectos de los desarrolladores
        
   * segundo nivel: 
        java EE enterprise su lugar esta en web, servidores, apps mejor distribuidas
    
 * WORA: Write Once Run Anywhere 
                 
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
  	 
#CLASES / HERRAMIENTAS
    una clase que se llama scanner 
    una clase es una herramienta que agrupa una funcionalidad
    le añadiremos al programa import
    usaremos el operador punto para leer de la consola un numero entero
    para luego poder en el programa duplicar que permite llamar el nextInt() 
    y que me lea un dato de la consola 
    
    *Configurar el scanner una herramienta 
    inicializa          entrada de datos 
    new        Scanner System.in
    comandos: para leer se llama a Scanner, mas su importacion se hara 
    automaticamente         
         Scanner sc = new Scanner(System.in);
         int nota = sc.nextInt();
    
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
    las com.practica.platzi.variables de entorno y cofigurar los 
    paths que queremos
     
     Ejercicio 2.
     Asegurate de tener definida una versión superior a la 8.
     Ahora desde tu terminal escribe el siguiente comando 
     para abrir nuestra jshell
     
     $jshell 
     Screen Shot 2019-07-24 at 5.04.52 PM.png
     Ahora escribe la línea de código para imprimir 
     un texto (no olvides poner ; y dar enter).
 
 # com.practica.curso.variables en java
    tipoDeDato nombreVariable;
    int salario;
    String nombre;
# nombres de las com.practica.curso.variables
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
        nombres de metodos,nombres de las com.practica.platzi.variables 
# tipos de datos com.practica.platzi.DataTypes
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
     Seguro te diste cuenta que siempre debemos escribir el tipo de dato de nuestras com.practica.platzi.variables antes de definir su nombre y valor.
     Pero esto cambia a partir de Java 10:
     solo debemos escribir la palabra reservada var y
     Java definirá el tipo de dato de nuestras com.practica.platzi.variables automáticamente:
     
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
    Podemos usar estos operadores de forma prefija (++i) o postfija (i++).
    La diferencia está en qué operación se ejecuta primero:
    
    regalando puntos cuando obtiene una vida.
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
        
# operaciones lado cientifico, clase math 
    la clase math tiene muchos otros metodos
    //devuelve un entero redondeo hacia arriba
        Math.ceil(x) 
    //devuelve entero redondeo hacia abajo
        Math.floor(x)
    //devuelve un numero elevado a otro 
        Math.pow(x,y) //23
    //devuelve el numero mayor 
        Math.max(x,y)
    //devuelve raíz cuadrada
        Math.sqrt(y)
    //Area de un circulo
    //pi * r2
        Math.PI * Math.pow(y,2) 
        imaginando que y es el radio elevado a la segunda potencia y,2
    //area de una esfera
    //4*PI*r2
        4*Math.PI * Math.pow(y,2)
    //volumen de una esfera
    //(4/3)*pi*r3
    (4/3)*Math.PI * Math.pow(y,2)
    
        Math.PI // 3.141592653589793
        Math.E // 2.718281828459045

        Math.ceil(2.1) // 3.0 (redondear hacia arriba)
        Math.floar(2.1) // 2.0 (redondear hacia abajo)

        Math.pow(2, 3) // 8.0 (número elevado a una potencia)
        Math.sqrt(3) // 1.73... (raíz cuadrada)

        Math.max(2, 3) // 3.0 (el número más grande)

        // Área de un círculo (PI * r^2):
                Math.PI * Math.pow(r, 2)

        // Área de una esfera (4 * PI * r^2):
                4 * Math.PI * Math.pow(r, 2)

        // Volumen de una esfera ( (4/3) * PI * r^3):
                (4/3) * Math.PI * Math.pow(r, 3)
                
# CAST manual en com.practica.curso.variables 
#estimación y exactitud
    un cast es un tipo de dato que esta siendo transformado a un tipo 
    de dato distinto ejecutar un casting sera colocar (int)
    para truncar la parte decimal
      
    un double transformado a un int
        int estimado = (int) variableAEstimar;
    transformamos un dato grande a un dato pequeño se trunca la parte decimal
     
    //ESTIMACIÓN se trunca la parte decimal,
         int estimatedMonthlyDogs = (int) monthlyDogs; //casteando a entero el decimal, de 2.5 que seria exacto
         System.out.println(estimatedMonthlyDogs);// 2

    //EXACTITUD
        int a= 30;
        int b= 12;
        System.out.println((double) a/b); //2.5
        
# TABLA DE CONVERSION DE TIPOS DE DATOS QUE SE PUEDE TENER 
    :: tamaño en aumento 
        menor tamaño -----> mayor tamaño 
        byte -> short -> int -> long 
        :: decimales 
        float double
        :: verdadero / falso 
         boolean 
         ::caracter sencillo 
         char
    buscar la tabla mas o menos esta desde el mas pequeño al
     mas grande las flechas 
     
    * conversion automatica( ) y requiere un cast ()
    btye <------\   
    short <------>char
    int <-------/
    long
    float
    double
    
    .::Conversión Automatica::.
    byte -> short
    short -> int
    char -> int
    int -> long
    long -> float
    float -> double
    
    .::Cast Necesario::.
    double -> float
    float -> long
    long -> int
    int -> short
    short -> byte
    
    char <-> byte
    char <-> short
    int -> char
    
    

#archivos JAR (Java Archive) .jar
    los .class es el resultado de la compilacion del codigo fuente
    
    son archivos de Java con el código compilado de los archivos (*.class)  
    y comprimido con el formato ZIP para que más adelante sean interpretados 
    y ejecutados por la máquina virtual de Java (JVM).
    
    Para generar estos archivos podemos entrar a
      File > Project Structure > Artifacts y seleccionar la opción de JAR > From modules with dependencies. 
    Luego de esto podemos compilar nuestro proyecto desde 
      Build > Build Artifacts > Build 
    y podremos nuestros archivos ejecutables en la carpeta 
      out/artifacts/.
        
    ejecutar el archivo jar
        java -jar com.practica.platzi._MenuPrincipal.Java.jar
 
# practica 
    Variables
    Ejercicio 1.
    Ponte creativo y preséntanos a tu familia con com.practica.platzi.variables, utiliza todos los tipos y cantidad de com.practica.platzi.variables que puedas, no olvides las convenciones de nombres Camel Case.
    
    com.practica.platzi.Casting
    Ejercicio 2
    
    Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.
    
    char c = ‘z’; conviertelo a int
    int i = 250; conviertelo a long y luego de long a short
    double d = 301.067; conviertelo a long
    int i = 100; súmale 5000.66 y conviertelo a float
    int i = 737; multiplícalo por 100 y conviertelo a byte
    double d = 298.638; divídelo entre 25 y conviertelo a long
    
    Archivos JAR
    Ejercicio 3
    
    Explica cómo distribuirías y crearías un ambiente de producción para un programa compilado con la versión 9 de Java.
    Incluye al menos dos Sistemas Operativos.
    
# alcance / scope de la variable 
    {Scope}
    la variable se declara antes de usarse
    la segunda es que este declarada dentro del scope, 
    que limita el uso de la variable
    si quisieramos ampliar su alcance deberiamos ponerla al mismo nivel 
    donde se declara las com.practica.platzi.variables antes del scope
    
# expresiones boleanas
    operadores especiales, true o false
    operadores de equidad 
        igualdad a==b
        desigualdad a!=b
    operadores relacionales 
        <,>,<=,>= tambien devuelven verdadero o falso
    operadores logicos 
        && AND, || OR, ! NOT

    Por ejemplo:
    
    boolean condicionA = true; // verdadero
    boolean condicionB = false; // falso
    
    boolean condicionC = 2 + 2 == 4; // verdadero
    boolean condicionD = 2 + 2 == 5; // falso
    
    boolean condicionE = "Pepito" == "Pepito"; // verdadero
    boolean condicionF = "Pepito" == "Pepe"; // falso
    Para esto debemos usar los operadores lógicos:
    
    Operadores de equidad:
    
    Igualdad: ==
    Desigualdad: !=
    Operadores Relacionales:
    
    Menor que: <
    Mayor que: >
    Menor o igual que: <=
    Mayor o igual que: >=
    Operadores lógicos:
    
    &&: AND (evaluar si dos o más condiciones son verdaderas).
    ||: OR (evaluar si al menos una de las condiciones es verdadera).
    !: NOT (evaluar que la condición NO sea verdadera).
    Recuerda que además de las sentencias IF y ELSE, también podemos usarELSE IF. Esta la usamos cuando queremos evaluar alguna condición diferente a la condición delIF` pero no exactamente al revés.
    
    Por ejemplo:
    
    if (noHayInternet) {
      System.out.println("No hay Internet");
    } else if (hayInternetPeroMuyPoquito) {
      System.out.println("Tienes muy poquito Internet");
    } else if (hayBuenInternetPeroNoEsSuficiente) {
      System.out.println("Casi casi, falta solo un poquito más");
    } else {
      System.out.println("¡Tienes suficiente Internet!");
    }
 # SWITCH 
    admite los tipos de datos:
        byte y Byte
        short y Short
        int y Integer
        char y Character
        String
        enum
        
    No admite:
        boolean y Boolean
        long y Long
        float y Float
        double y Double
    switch (colorModeSelected){
        case "Light":
            System.out.println("Seleccionaste Light Mode");
            break;
        case "Blue Dark":
            System.out.println("Seleccionaste Blue Dark Mode");
            break;
        case "Dark":
            System.out.println("Seleccionaste Dark");
            break:
        default:
            System.out.println("Selecciona una opcion");
    }
# break continue y return 
    Antes de pasar a uno de nuestros temas más importantes del curso
    es importante que sepas todas las opciones que tienes para
     detener ciclos y así seguir controlando 
     el flujo de tus programas.
    
    Break
    En Java esta sentencia la verás en dos situaciones especificamente:
    
    En un Switch: en esta situación break hace que el flujo del switch 
    no continúe ejecutándose a la siguiente comparación,
    esto con el objetivo de que solo se cumpla una sola condición:
    switch (colorModeSelected){
        case "Light":
                    System.out.println("Seleccionaste Light Mode");
                    break;
            case "Night": //Ambar
                    System.out.println("Seleccionaste Night Mode");
                    break;
            case "Blue Dark":
                    System.out.println("Seleccionaste Blue Dark Mode");
                    break;
    }
    Para salir de un bucle: Como acabamos de ver un break es capaz 
    de detener el flujo en el código, en este caso detendremos 
    el ciclo como tal terminándolo y haciendo que saltemos
    a la siguiente instrucción después del ciclo.
    
    Continue
    Continue en cierto modo también nos va a servir para 
    detener un ciclo pero en lugar de terminarlo como en 
    el caso de break, este volverá directo a la condición.
    
    Return
    Aunque en algunos lenguajes esta sentencia sirve como 
    un tipo goto, dónde se rompe el flujo del programa la
     mejor forma de usarlo en Java es 
     en com.practica.curso.Funciones, cuando lo usamos aquí 
     siempre viene acompañado de un valor, el cuál indica el 
     dato que se estará devolviendo en la función.    

 #FUNCIONES 
    entregamos dato -> realiza proceso-> sale resultado
    organizar y modularizar el código 
    reutilizar codigo 
    evitar código repetido
    una funcion puede verse asi:
        public int suma(int a, int b){
            return a+b;
        }
    es importante devolver el con el tipo de dato que se va a obtener,
    sera mucho mejor para testear
   
    la firma de la funcion es la primer linea public int funcion,
    recordar que deban ser unicos y apegados a low 

    com.practica.platzi.Funciones: nos ayudan a organizar, modularizar y evitar el código repetido.
    • Return: palabra clave cuando una función tiene un valor de regreso.
    • Void: palabra clave cuando una función no tiene un valor de regreso.
#LLamar funciones
    int c= suma(5,7);
# CREAR funciones
       public static double sphereVolumen(double r){
            return (4/3)*Math.PI * Math.pow(r,2);
        }

#static void

    static: Indica que no es necesario crear una instancia de la clase
    para acceder al método. 
    Corresponde a la clase en general, mas no a una intancia. 
   
    void: Indica el tipo de objeto que regresa la función. 
    En este caso la función no regresa ningún valor, por eso es void.
    
    Una función static la vas a poder llamar directo dentro de 
    la clase sin instanciarla, o fuera de la clase haciendo referencia 
    a la clase y no a un objeto de ella, si no es estatic, para 
    poder llamarlo deber ser por medio de la instancia de un objeto de esa clase, saludos
    
    La cuestión es que en el ejemplo se
    pusieron las funciones como métodos estáticos, 
    para que pudieran ser utilizadas dentro del método main.
     si no no sería posible
    
    //modificador de acceso static: es algo que aplica para metodos que comparten el metodo main, 
    // para todo lo demas no es aplicatorio poner static y nuestro valor de regreso es double
    
    No exactamente, una clase de tipo static me permite invocar sus métodos sin necesidad de crear una instancia.
    El singleton es un design pattern usado para que dentro de un sistema una clase solo pueda tener una única instancia.
    Puede sonar parecido en la explicación que dan en la clase, pero la realidad es que son conceptos muy distintos.
#JAVA DOCS
    nos ayuda a comprender qué hace el código 
    genera documentacion en html
    declarar mi javadoc con documentacion 
    /** */ 

    /** 
    * esta es la documentacion que si se va a leer de javadoc
    *
    * @param quantity Cantidad de dinero
    * @param currency Tipo de moneda: solo acepta MXN o COP
    * @return quantity Devuelve la cantidad actualizada en dolares
    */
    el ide lo tiene oculto
    configuracion: editor->general->code completion->activa show the documentation popup in 1000ms 
#tags de java docs

 # BUCLES O CICLOS
   * IF
   * FOR 
   * FOR INVERSO
   * WHILE
   * DO WHILE
   * ANIDAMIENTOS Y BUCLES
 
 #Bucle: if e if anidado
     if(nota>5){
         System.out.println("comprar movil");
         if(oferta){
             System.out.print("auriculares");
         }
     }
# Bucle: for y for Anidados
    * Estructura for:
        for (inicialización; condición; incremento/decremento) {
            // Instrucciones
        }
        
    El Ciclo For nos ayuda a ejecutar
    una parte de nuestro código las veces que
    sean necesarias para que se cumpla una condición.
    De hecho, el ciclo FOR nos da muchas ayudas para
    lograr este resultado de la forma más fácil posible:
    
    // En este ejemplo el mensaje de printSOS se
    // ejecutará 10 veces:
    for (int i = 1; i <= 10; i++) {
      printSOS();
    }
    ___
   
    *Estructura for anidado:
      for(int i = 5; i >= 0; i--){
         	for(int j = 0; j <= i; j++){
         		System.out.print("*");
         	}
         	System.out.print("\n");
         }
         
     Los ciclos FOR nos ayudan a ejecutar una parte de nuestro
      código todas las veces que sean necesarias hasta que una
       condición se cumpla, por ejemplo, que un número supere 
       o iguale cierta cantidad.
     
     Eso es exactamente lo que necesitamos para trabajar 
     con índices. En vez de escribir todos los números a mano,
      vamos a utilizar un ciclo para imprimir el valor de cada
       posición de nuestros arreglos, incluso si estos son 
       multidimensionales:
     
     // Array de una sola dimensión:
     for (int i = 0; i <= 3; i++) {
       System.out.println(i);
     }
     // El resultado será: 0, 1, 2, 3
     
     // Array de dos dimensiones:
     for (int row = 0; row < cities.length; row++) {
       for (int col = 0; col < cities[row].length; col++) {
         System.out.println(cities[row][col]);
       }
     }
     // El resultado será:
     // Colombia
     // Bogotá
     // México
     // Guadalajara
     // España
     // Madrid
     El ciclo FOREACH también nos ayuda a recorrer los elementos
      de un array posición por posición, solo que no tenemos 
      control sobre el índice, el ciclo se encarga de recorrer
       todo el array automáticamente:
     
     for (TipoDato elemento : coleccion) {
       // Instrucciones
     }
     
     
# BUCLES INVERSOS o decremento 
 #for inverso 
    se ejecuta al revez,
        inicio   fin   incremento/vueltas   
    for(int i=10;i>0;i=i-1){
    }
    
#Bucle: do while 
    Los bucles (ciclos) nos ayudan a ejecutar una parte de nuestro código una cantidad de veces hasta que se cumpla alguna condición y podamos continuar con la ejecución de nuestro código.
    
    Existen diferentes bucles. Por ejemplo, el bucle do while:
    
    do {
      // instrucciones
    } while (condición);
    Los ciclos evaluarán si la condición se cumple y cuando deje de hacerlo no ejecutarán más el código del ciclo. Las instrucciones son las encargadas de que esta condición cambie de verdadero a falso. De otra forma, si las instrucciones nunca cambian la condición, el ciclo no se detendrá nunca, lo que conocemos como un ciclo infinito.
    
    La clase Scanner le permite a los usuarios contestar algunas preguntas para que nuestro programa actúe de una forma u otra. Para usarla solo debemos importar la clase Scanner de las APIs de desarrollo de Java:
    
    import java.util.Scanner;
    
    int response = 0;
    
    Scanner sc = new Scanner(System.in);
    response = Integer.valueOf(sc.nextLine());
 
#operador ternario y bucle while 
    Vamos a crear el algoritmo con la lógica necesaria para encender una lampara, emitir un mensaje y detener las luces en algún momento.
    
    El Bucle While nos ayuda a ejecutar una parte del código mientras una condición se cumpla. Recuerda tener mucho cuidado y asegurarte de que la condición del ciclo while cambie en algún momento, de otra forma, el ciclo no se detendrá nunca y sobrecargarás tu programa:
    
    while (isTurnOnLight) {
      printSOS();
    }
    Los operadores ternarios son otra forma de evaluar condiciones, así como los condicionales IF y ELSE`:
    
    // Operador Ternario:
    isTurnOnLight = (isTurnOnLight) ? false : true;
    
    // IF y ELSE:
    if (isTurnOnLight) {
      isTurnOnLight = false;
    } else {
      isTurnOnLight = true;  
    }

# arrays 
    Los arreglos o arrays son objetos en los que podemos guardar más de una variable, una lista de elementos. Los arrays son de una sola dimensión, pero si guardamos arrays dentro de otros arrays podemos obtener arrays multidimensionales.
    
    Los arrays se definen en código de las siguientes maneras:
    
    // 1. Definir el nombre de la variable y el tipo de datos
    //  que va a contener, cualquiera de las siguientes dos
    // opciones es válida:
    TipoDato[] nombreVariable;
    TipoDato nombreVariable[];
    
    // 2. Definir el tamaño del array, la cantidad de elementos
    // que podemos guardar en el array:
    TipoDato[] nombreVariable = new TipoDato[capacidad];
    
    // Array de dos dimensiones:
    TipoDato[][] cities = new String[númeroFilas][númeroColumnas];
    Ya que los arrays pueden guardar multiples elementos, la convención es escribir los nombres de las com.practica.platzi.variables en plural.
    
# declarando arreglos 
    
# indices y busqueda de elementos en array 
    Los índices son com.practica.platzi.variables simples que nos ayudan a identificar las posiciones en un arreglo. Estas com.practica.platzi.variables siempre guardan números, comienzan en 0 e incrementan de abajo a arriba y de izquierda a derecha a medida que guardamos más elementos en nuestros arrays.
    
    Para guardar un valor en alguna posición de nuestro array solo debemos usar el índice de la siguiente forma:
    
    nombreVariable[indice] = valor;
    Recuerda que puedes aprender muchas más sobre estructuras de datos en el Curso Básico de Algoritmos.
 
# CONTINUA PROGRAMACION ORIENTADO A OBJETOS 


