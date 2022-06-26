# TAREA 5 ARSW 

Juego de Picas y Fijas
# LOC/h. Rendimiento

1. desde las 8:00 pm, hasta las 10:30 pm - fueron en total 151 lineas
2. desde las 6:36 pm, hasta las 9:23 pm - fueron en total 63 lineas


LOC = (214L/6h)

## 35.6 LOC

## Link heroku: https://desolate-lake-49595.herokuapp.com/

# Documentación

La documentacion de este proyecto esta en la siguiente ruta del proyecto:
```
raiz /README.md
```
## EMPEZAR

Copie el proyecto via git clone en cualquier diretorio para empezar a trabajar:
```
Falta el repositorio 
```

### Prerequisitos

Tener instalado Java jdk versiones 7+, Maven comandos y git

### Instalando

1. Ejecutar en terminal:

```
$$ mvn clean install
```
2.(opcional):
si requiere la documentacion del codigo ejecute y estara en raiz /target:

```
mvn javadoc:javadoc
```

2. (Demostracion):
   Puede compilar y probar el proyecto con el siguiente comando, recuerde que la app corre por el puerto 8080

```
java -cp ".\target\classes" edu.escuelaing.arem.fijaspicas.app.PicasYFilasGame;

```
## Explicacion del juego
1. El juego es picas y fijas
2. Debe llenar cada uno de los campos para su correcto funcionamiento 
3. La idea del juego es adivinar los numeros y las posiciones de los numeros generados aleatoriamente en el servidor.
4. Gana si consigue adivinar la lista de numeros en su orden correcto.

## Diagrama de clases
"La imagen se encuentra en la carpeta img, por alguna razon no logro que se cargue cuando subo el repo a github"

![1](https://user-images.githubusercontent.com/42101956/175193387-6de70ab7-3a79-498c-978f-268ed07bea4c.png)



## Built con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html) - construcción


## Autor

* **Juan Mateo Mejia Zuluaga** - *Initial work* - [MatiwsxD](https://github.com/MatiwsxD)


## Licencia

This project is licensed under the GNU General Public License - see the [LICENSE](LICENSE) file for details
