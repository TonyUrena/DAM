const fs = require('fs') 
let data = fs.readFileSync("./libreria.json")
let jsonDatos = JSON.parse(data)

let books = jsonDatos.bookstore.book

// ¿Cuántos libros hay en la librería?
console.log(books.length)
console.log("------------------------------")

// Recibe un límite inferior y superior para el precio y muestra todos los libros cuyo precio esta en ese intervalo.
let limitInf = 5;
let limitSup = 100;
for (let i = 0; i < books.length; i++) {
    if (books[i].price > limitInf && books[i].price < limitSup) 
    {
        console.log(books[i].title.__text)
    }
}
console.log("------------------------------")

// Recibe una cadena por teclado, y muestra el título y el año de publicación de los libros cuyo título empiece por la cadena introducida.
let cadena = "Harry Potter"
for (let i = 0; i < books.length; i++) {
    if (books[i].title.__text = cadena)
    {
        console.log(books[i].title.__text)
        console.log(books[i].year)
    }
}
console.log("------------------------------")

// Devuelve todos los títulos de los libros con la lista de sus autores.
for (let i = 0; i < books.length; i++) {
    
    console.log(books[i].title.__text)
    console.log(books[i].author)
    console.log("------------------------------")
    
}
