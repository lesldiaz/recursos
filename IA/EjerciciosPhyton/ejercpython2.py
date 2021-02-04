import numpy as np
import cv2
#cargar la plantilla de haar cascade
face_cascade=cv2.CascadeClassifier('haarcascade_frontalface_alt.xml') #archivo haarcascade
cap=cv2.VideoCapture(0)
#cap.set(3,100)
#cap.set(4,100)
#para cambiar la resolucion de una camara
while(True):
    ret,frame=cap.read()
    #convertir imagen en blanco y negro
    gray=cv2.cvtColor(frame,cv2.COLOR_BGR2GRAY)
    faces=face_cascade.detectMultiScale(gray,1.3,5)
    for  (x,y,w,h) in faces:
        cv2.rectangle(frame,(x,y),(x+w,y+h),(125,255,0),0)
        cv2.imshow('rostro',frame)
    if cv2.waitKey(1)&0xff == ord('s'):
            break
cap.release()
cv2.destroyAllWindows()
