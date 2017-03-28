**Bertrand/Axel**

**Bontron/Julien**

# Rapport TP2

## Question 1
Voici le diagramme UML de notre projet afin d'utiliser le pattern Visitor.
![Question 1](images/Question1.png)

## Question 2
Afin de mettre en place le pattern Visitor dans notre projet, nous avons en place une interface appellée Affichage qui permet de visiter
les différents types de noeuds de l'arbre. Elle permet de définir les différents variantes de la fonction visit qui permet de parcourir les 
constantes, les négations, les additions et les multiplications. Ces méthodes seront redefinis pour les implémenter les différents parcours que 
nous devons effectuer lors de ce TP.

## Question 3
Pour le parcours postfixe, on affiche en premier la valeur des constantes des différents noeuds puis on affiche celle des opérateurs pour chaque branche.

## Question 4
Afin d'effectuer le calcul des valeurs dans l'arbre, il faut retourner la valeur quand on a une constante, la soustraction de la valeur pour une négation, 
pour l'addition il faut stocker la variable de droite et l'additionner à celle de gauche et pour la multiplication 
il faut stocker la variable de droite et la multiplier par celle de gauche. 

## Question 5
Afin d'effectuer le calcul de la hauteur quand on est en présence d'une constante on initialise la profondeur à 1, quand on on est sur un opérateur unaire 
(Negation), on calcule la hauteur du fils et on incrémnte de 1 et quand on est sur un opérateur binaire (multiplication ou addition) on calcule et compare 
la hauteur des deux fils et on garde la plus grande qu'on incrémente de 1.

## Question 6
Pour le parcours infixe, pour un opérteur binaire on affiche d'abord la branche de gauche puis l'opérateur puis la branche de droite pour un 
opérateur binaire, on affiche d'abord l'opérateur puis la valeur de la branche. 