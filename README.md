# QRGen
## Java program to generate QR codes from a text given / Programa en Java para generar codigos QR a partir de texto  

This litle program uses a main librarie to achieve the goal of creating QR codes from plain text, it is zxing, here is their repo: https://github.com/zxing/zxing.  

But in this librarie i had to import two separated libraries as i didnt find all methods i needed on the first one, these are: 

        -google.zxing:core:3.5.1  
        -solvoj.zxing.java6.javase  

Whose maven dependecies are :  

        <dependency>  
            <groupId>com.google.zxing</groupId>  
            <artifactId>core</artifactId>  
            <version>3.5.1</version>  
        </dependency>  

        <dependency>  
            <groupId>com.solvoj.zxing-java6</groupId>  
            <artifactId>javase-java6</artifactId>  
            <version>3.2.0</version>  
        </dependency>  

Este pequeño programa hace uso de una libreria principal para conseguir crear codigos QR a partir de texto plano, esta se llama zxing y este es su repositorio: https://github.com/zxing/zxing.  

En este caso al hacer uso de la libreria core de este proyecto no encontre algunos de los metodos necesarios por lo que fue necesario importar dos librerias de dicho proyecto, estas son:  

        -google.zxing:core:3.5.1  
        -solvoj.zxing.java6.javase  

Cuyas dependencias Maven son :  

        <dependency>  
            <groupId>com.google.zxing</groupId>  
            <artifactId>core</artifactId>  
            <version>3.5.1</version>  
        </dependency>  

        <dependency>  
            <groupId>com.solvoj.zxing-java6</groupId>  
            <artifactId>javase-java6</artifactId>  
            <version>3.2.0</version>  
        </dependency>  
