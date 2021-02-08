# u7-rpc-rmi-server
Código fuente del servidor de la actividad "RPC/RMI" perteneciente a la Unidad 7 del curso de Sistemas Distribuidos.

## Integrantes
- Carolina Patiño
- Luis Fuentes
- David Monroy

## Requerimientos para ejecutar el servidor
- Java

## Procedimiento para ejecutar el servidor
1. En la ruta base del proyecto, va a crear 5 archivos de texto plano que se llamarán _user.txt_, _account.txt_, _deposit.txt_, _transference.txt_, y _withdrawal.txt_
2. Acceda a la carpeta _src_ y dentro de esta ejecute los siguientes comandos según su SO:
- Windows:
```
$ Javac *.java
$ Start rmiregistry
```
- Linux:
```
$ javac *.java
$ rmiregistry &
```
3. Compile y ejecute Server.java

Ya con esto puede tener funcionando el server a esperas de las peticiones de los clientes ATM
