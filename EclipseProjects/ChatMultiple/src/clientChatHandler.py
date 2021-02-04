'''
Created on 22 nov. 2018
Python 3.2
Simple Chat Client Script
@author: leo
'''

from socket import *
from time import ctime

HOST = 'localhost'
PORT = 5000
BUFSIZE = 1024
ADDRESS = (HOST, PORT)

server = socket(AF_INET, SOCK_STREAM)
server.connect(ADDRESS)
print server.recv(BUFSIZE) #The servers greeting
usuario = raw_input('Ingresa tu usuario>')
#server.send(usuario)
while True:
    message = usuario + ' - ' + ctime() + ' : '  + raw_input('>')
    if not message:
        break
    server.send(message + '\n') # Send my reply to the server
    reply = server.recv(BUFSIZE) #Get the server's reply
    if not reply:
        print 'Server disconnected'
        break
    print reply  #display the server's reply
server.close()
