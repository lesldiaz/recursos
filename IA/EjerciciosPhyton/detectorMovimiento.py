import numpy as np
import cv2

#capturar video de la camara
cap = cv2.VideoCapture(0)

#metodo
fgbg = cv2.createBackgroundSubtractorMOG2(history=500,varThreshold=50,detectShadows=False)

#opencl false
cv2.ocl.setUserOpenCL(False)



while(1):
    #get frames
    ret,frame = cap.read()
    if not ret:
        break
    #aplicar Algortimo
    fgmask = fgbg.apply(frame)
    #umbral
    contornosu = fgmask.copy()
    
    im, contornos, hierarchy= cv2.findContours(contornosu,cv2.RETR_TREE,cv2.CHAIN_APPROX_SIMPLE)
    #recorrer los contornos
    for c in contornos:
        #borrar contornos pequenios
        if cv2.contourArea(c)<325:
            continue
        #obtener el bouns del mayor rectangulo
        (x,y,w,h) = cv2.boundingRect(c)
        #dibujar rectagulo
        cv2.rectangle(frame,(x,y),(x+w,y+h),(0,255,0),2)
    #mostrar capturas del frame
    cv2.imshow('Camara',frame)
    cv2.imshow('Umbral',fgmask)
    cv2.imshow('Contornos',contornosu)

    k = cv2.waitkey(30) & 0xff
    if k==ord("s"):
        break
#cerrar camara y destruir sistema
cap.release()
cv2.destroyAllWindows()
            
        
    
    
    
