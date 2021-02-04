'''
Cliente 1 TCP -
DiazLeslie_PachacamaPamela
'''
import socket


sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
host = 'localhost' #dd/mm/aaaa
server = (host,2525)
sock.connect(server)
ahora = raw_input("Escriba la fecha en formato dd/mm/AAAA: ")
#ahora = "06/11/1997"
#print (f"La fecha ingresada es ,{ahora}")
sock.send(ahora) #.encode('utf-8')
print (sock.recv(1024))
sock.close()
