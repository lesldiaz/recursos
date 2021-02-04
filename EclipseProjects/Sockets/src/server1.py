'''
Servidor 1 TCP
PachacamaPamela_DiazLeslie
'''
import socket
import datetime

IP = "localhost"
PORT = 2525
#Creating a server socket on the local machine
serversocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
try:
    serversocket.bind((IP,PORT))
    serversocket.listen(5)
    while True:        
        newsock,(client_host,client_port)=serversocket.accept()
        print ("Client:",client_host,client_port)
        data=newsock.recv(1024)
        dia_semana=datetime.datetime.strptime(data,'%d/%m/%Y')
        newsock.send("El dia de la semana es: "+dia_semana.strftime('%A'))
        
        newsock.close()

except socket.error:
    print("Problemas using port %i. Do you have permission?" % PORT)
