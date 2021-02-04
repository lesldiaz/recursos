
from socket import *
from time import ctime
from threading import Thread


class ClientHandler(Thread):
    def __init__(self, client, record):
        Thread.__init__(self)
        self._client = client
        self._record = record
    def run(self):
        self._client.send('Bienvenido a esta sala de chat')
        self._client.send(str(self._record))
        while True:
            message = self._client.recv(BUFSIZE)   #Reply from client
            if not message:
                print 'Client disconnected'
                self._client.close()
                break
            else:
                print message
                self._record.add(message)
                self._client.send(str(self._record)) #Reply to client
        
class ChatRecord(object):
    def __init__(self):
        self.data = []
    def add(self, s):
        self.data.append(s)
    def __str__(self):
        if len(self.data) == 0:
            return 'No hay mensajes'
        else:
            return '\n'.join(self.data)
          
HOST = 'localhost'
PORT = 5000
BUFSIZE = 1024
ADDRESS = (HOST,PORT)

record = ChatRecord()
server = socket(AF_INET, SOCK_STREAM)
server.bind(ADDRESS)
server.listen(5)
while True: 
    print 'Esperando Conexion . . .'
    client, address = server.accept()
    print 'Cliente:', address
    client.send('Welcome to my chat room!') #Send greeting
    handler = ClientHandler(client, record)
    handler.start()