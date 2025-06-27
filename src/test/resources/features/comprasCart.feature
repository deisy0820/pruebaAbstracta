#Author: Deisy Mosquera
  #Email:deisymsqr6@gmail.com

Feature: Ingresar  opencart y comprar un iphone

  Background: Precondition
    Given El usuario ingresa a la pagina web

  Scenario: El usuario agregra un producto al carrito
    When El usuario agrega el telefono al carrito
    Then El usuario verifica que el telefono si este en el carro de compras "iPhone"
#
  Scenario: El usuario elimina el producto del carrito
    When El usuario elimina el telefono al carrito
    Then El usuario verifica que el telefono no se enuentre en el carrito de compras