animal(ayudantedesanta).
animal(boladenieve).

amigos(milhouse,bart).
amigos(bart,milhouse).
amigos(lisa,milhouse).
amigos(jessica,bart).
amigos(bart,jessica).
amigos(lisa,jessica).
amigos(jessica,lisa).
amigos(milhouse,lisa).

duenio(boladenieve,homero).
duenio(boladenieve,marge).
duenio(boladenieve,bart).
duenio(boladenieve,lisa).
duenio(boladenieve,maggie).
duenio(ayudantedesanta,homero).
duenio(ayudantedesanta,marge).
duenio(ayudantedesanta,lisa).
duenio(ayudantedesanta,bart).
duenio(ayudantedesanta,maggie).

mujer(mona).
mujer(jackie).
mujer(marge).
mujer(patty).
mujer(selma).
mujer(lisa).
mujer(maggie).
mujer(ling).
mujer(abbie).
mujer(jessica).


hombre(abraham).
hombre(clancy).
hombre(herb).
hombre(homero).
hombre(arthur).
hombre(bart).
hombre(milhouse).

casados(homero,marge).
casados(abraham,mona).
casados(clancy,jackie).
casados(marge,homero).
casados(mona,abraham).
casados(jackie,clancy).

padre(abraham,abbie).
padre(abraham,herb).
padre(abraham,homero).
padre(mona,homero).
padre(clancy,marge).
padre(clancy,patty).
padre(clancy,selma).
padre(clancy,arthur).
padre(jackie,marge).
padre(jackie,patty).
padre(jackie,selma).
padre(jackie,arthur).
padre(homero,bart).
padre(homero,lisa).
padre(homero,maggie).
padre(marge,bart).
padre(marge,lisa).
padre(marge,maggie).
padre(selma,ling).

esesposode(X,Y):-hombre(X),casados(X,Y).
esesposade(X,Y):-mujer(X),casados(X,Y).
espadrede(X,Y):-hombre(X),padre(X,Y).
esmadrede(X,Y):-mujer(X),padre(X,Y).
eshijode(X,Y):-hombre(X),padre(Y,X).
eshijade(X,Y):-mujer(X),padre(Y,X).
esabuelode(X,Y):-hombre(X),padre(X,N),padre(N,Y).
esabuelade(X,Y):-mujer(X),padre(X,N),padre(N,Y).
eshermanode(X,Y):-padre(N,X),padre(N,Y),X\==Y,hombre(X).
eshermanade(X,Y):-padre(N,X),padre(N,Y),X\==Y,mujer(X).
estiode(X,Y):-hombre(X),padre(N,Y),eshermanode(X,N).
estiade(X,Y):-mujer(X),padre(N,Y),eshermanade(X,N).
esnietode(X,Y):-hombre(X),padre(Y,N),padre(N,X).
esnietade(X,Y):-mujer(X),padre(Y,N),padre(N,X).
esdueniode(X,Y):-animal(Y),hombre(X),duenio(Y,X).
esdueniade(X,Y):-animal(Y),mujer(X),duenio(Y,X).
esamigode(X,Y):-hombre(X),amigos(X,Y).
esamigade(X,Y):-mujer(X),amigos(X,Y).

quienes(X,Y):-eshijode(X,Y),write(X),write(' es hijo de '),write(Y).
quienes(X,Y):-eshijade(X,Y),write(X),write(' es hija de '),write(Y).
quienes(X,Y):-esabuelode(X,Y),write(X),write(' es abuelo de '),write(Y).
quienes(X,Y):-esabuelade(X,Y),write(X),write(' es abuela de '),write(Y).
quienes(X,Y):-esesposode(X,Y),write(X),write(' es esposo de '),write(Y).
quienes(X,Y):-esesposade(X,Y),write(X),write(' es esposa de '),write(Y).
quienes(X,Y):-espadrede(X,Y),write(X),write(' es padre de '),write(Y).
quienes(X,Y):-esmadrede(X,Y),write(X),write(' es madre de '),write(Y).
quienes(X,Y):-eshermanode(X,Y),write(X),write(' es hermano de '),write(Y).
quienes(X,Y):-eshermanade(X,Y),write(X),write(' es hermana de '),write(Y).
quienes(X,Y):-esnietode(X,Y),write(X),write(' es nieto de '),write(Y).
quienes(X,Y):-esnietade(X,Y),write(X),write(' es nieta de '),write(Y).
quienes(X,Y):-esamigade(X,Y),write(X),write(' es amiga de '),write(Y).
quienes(X,Y):-esamigode(X,Y),write(X),write(' es amigo de '),write(Y).
quienes(X,Y):-esdueniode(X,Y),write(X),write(' es duenio de '),write(Y).
quienes(X,Y):-esdueniade(X,Y),write(X),write(' es duenia de '),write(Y).
quienes(X,Y):-estiode(X,Y),write(X),write(' es tio de '),write(Y).
quienes(X,Y):-estiade(X,Y),write(X),write(' es tia de '),write(Y).
quienes(X,Y):-esdueniode(Y,X),write(X),write(' es mascota de '),write(Y).
quienes(X,Y):-esdueniade(Y,X),write(X),write(' es mascota de '),write(Y).













