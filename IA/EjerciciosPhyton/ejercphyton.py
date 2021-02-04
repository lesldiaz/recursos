import numpy as np #manejo de arrays y funciones matematicas
import cv2 #para vision artificial

#capturar video de la camara
cap = cv2.VideoCapture(0) #prende la camara del computador
#el opencl debe estar en false
cv2.ocl.setUserOpenCL(False)

#metodo
fgbg = cv2.createBackgroundSubtractorMOG2(history=500,varThreshold=50,detectShadows=False)
# Quiero encontrar contornos, siluetas, todo lo que se mueva con mascaras, la mascara se desplaza por el frame y va buscando los bordes

while(1):
    #obtener los frames
    ret,frame = cap.read()
    if not ret:
        break
    #aplicar algoritmo de deteccion de movimiento
    fgmask = fgbg.apply(frame) #devuelve lo que la mascara encontro
    #a esta mascara se le aplica un valor umbral
    contornosu = fgmask.copy() #me devuelve el umbral
    im, contornos, hierarchy = cv2.findContours(contornosu,cv2.RETR_TREE,cv2.CHAIN_APPROX_SIMPLE)
    #recorrer los contornos
    for c in contornos:
        #borrar contornos pequenios
        if cv2.contourArea(c)<325: #dependiendo del area que voy a detectar humanos (es mas grande)
            continue
        #obtener el bouns del mayor rectangulo
        [x,y,w,h]=cv2.boundingRect(c)
        #dibujar rectangulo
        cv2.rectangle(frame,(x,y),(x+w,y+h),(0,255,0),2)
    #mostrar capturas del frame
        cv2.imshow('Camara',frame)
        cv2.imshow('Umbral',fgmask)
        cv2.imshow('Contornos',contornosu)

        k = cv2.waitkey(30) & 0xff #codigo exadecimal para lectura de teclado
        if k==ord("s"):
            break
#cerrar la camara y destruir sistema
        cap.release()
        cv2.destroyAllWindows()
