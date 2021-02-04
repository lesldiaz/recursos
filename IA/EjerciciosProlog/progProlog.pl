fruta(manzana).
fruta(mandarina).
fruta(melon).
fruta(sandia).
fruta(pera).
postre(manzana,manjar).
postre(pera,miel).
postre(melon,manjar).
postre(sandia,manjar).

comida(X,Y):- fruta(X),postre(X,Y).