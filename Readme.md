Se añadio la clase LibroException que es una excepción personalizada que se utiliza para manejar errores específicos relacionados con libros. Al lanzar esta excepción, se puede proporcionar un mensaje descriptivo que indique la causa del error. Por ejemplo, se puede utilizarlo cuando no se encuentra un libro específico por su ID o cuando se producen validaciones personalizadas.

![1](https://github.com/josueleonn/libro-api/assets/147575712/3b4bd83a-7e30-4f6f-a437-07af88114475)
![3](https://github.com/josueleonn/libro-api/assets/147575712/6686610c-1073-4f06-9566-670395e1ed36)


Ademas, se ha modificado el controlador de libros para que, en caso de no encontrar un libro, responda con un estado NOT_FOUND y un mensaje personalizado. Esta actualización garantiza una mejor experiencia para los usuarios al proporcionar información más clara sobre la falta de resultados.

![2](https://github.com/josueleonn/libro-api/assets/147575712/0bc8b277-3718-4b2d-8d0e-3485667dcda6)
