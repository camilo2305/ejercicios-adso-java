# Pseudocódigo

## Constantes (pi y URL de Google)

```
Algoritmo Constantes
    Constante PI <- 3.141592653589793
    Constante URL_GOOGLE <- "https://www.google.com"
    Escribir "Número pi: ", PI
    Escribir "URL de Google: ", URL_GOOGLE
FinAlgoritmo
```

## Mayor de edad

```
Algoritmo MayorDeEdad
    Leer edad
    Si edad >= 18 Entonces
        Escribir "Es mayor de edad"
    SiNo
        Escribir "Es menor de edad"
    FinSi
FinAlgoritmo
```

## Ángulos de un triángulo

```
Algoritmo AngulosTriangulo
    Leer a, b, c
    Si a > 0 Y b > 0 Y c > 0 Y (a + b + c) = 180 Entonces
        Escribir "Los ángulos corresponden a un triángulo"
    SiNo
        Escribir "Los ángulos NO corresponden a un triángulo"
    FinSi
FinAlgoritmo
```

## Par o impar

```
Algoritmo ParImpar
    Leer numero
    Si numero MOD 2 = 0 Entonces
        Escribir "Es par"
    SiNo
        Escribir "Es impar"
    FinSi
FinAlgoritmo
```

## Divisible entre cinco

```
Algoritmo DivisiblePorCinco
    Leer numero
    Si numero MOD 5 = 0 Entonces
        Escribir "Es divisible entre cinco"
    SiNo
        Escribir "No es divisible entre cinco"
    FinSi
FinAlgoritmo
```

## Número primo (entre 1 y 15)

```
Algoritmo NumeroPrimo
    Leer numero
    Si numero < 1 O numero > 15 Entonces
        Escribir "El número debe estar entre 1 y 15"
    SiNo
        primo <- (numero > 1)
        Para i <- 2 Hasta numero - 1 Hacer
            Si numero MOD i = 0 Entonces
                primo <- Falso
            FinSi
        FinPara
        Si primo Entonces
            Escribir "Es primo"
        SiNo
            Escribir "No es primo"
        FinSi
    FinSi
FinAlgoritmo
```

## Mayor de dos números

```
Algoritmo MayorDeDos
    Leer a, b
    Si a = b Entonces
        Escribir "Los números son iguales"
    SiNo
        Si a > b Entonces
            Escribir "El mayor es ", a
        SiNo
            Escribir "El mayor es ", b
        FinSi
    FinSi
FinAlgoritmo
```

## IVA en el supermercado

```
Algoritmo IvaSupermercado
    Leer producto
    Si producto = "lentejas" O producto = "arroz" Entonces
        Escribir "No paga IVA"
    SiNo
        Si producto = "crema" O producto = "vino" Entonces
            Escribir "Sí paga IVA"
        SiNo
            Escribir "Producto no reconocido"
        FinSi
    FinSi
FinAlgoritmo
```
