## **Balanceador de parentesis**

* Balanceador de parentesis (solo un tipo):
Escriba un programa que detecte que si los parentesis están balanceados en un string, por ejemplo “((())((())))” retorna True y “(()()))(” retorna False

* Multiples tipos:
Ahora se agregan más tipos de parentesis: redondos (), corchetes [] y llaves {}, por ejemplo “([{}])({})” retorna True y “[({)}]” retorna False

* Cualquier tipo:
Ahora hay una interfaz Parentesis con variables open y close, por ejemplo la clase MiParentesis1 que implementa Parentesis tiene como open “!” y close “@” y MiParentesis2 tiene como open “#” y close “$”, para la entrada “!@!@!!#$#$@@” retorna True y para la entrada “##!@$$!@#$!#@$” retorna False